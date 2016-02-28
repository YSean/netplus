package com.net.plus.service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.ByteArrayBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.plus.exception.NetRuntimeException;
import com.net.plus.util.JsonHelper;

@Service("httpService")
public class HttpClientService {
	
	Log log = LogFactory.getLog(HttpClientService.class);
	static final int _1M = 8388608;
	static final int _1K = 8192;
	@Autowired
	HttpClientBuilder httpClientBuilder;
	
	public Map send(String url){
		HttpClientRequest req = new HttpClientRequest();
		req.setUrl(url);
		return send(req);
	}
	public Map send(HttpClientRequest req){
		Object result = null;
		Map response = null;
		String type = req.getType();
		try{
			if(type==null){
				result = doGet(req.getUrl());
			}else if(req.req_json.equals(type)){
				result = doJsonPost(req.getUrl(),(JSONObject)req.getContent());
			}else if(req.req_files.equals(type)){
				Map<String,Object> map = req.getParams();
				String fileName = (String)map.get("FileName");
				String contentType = (String)map.get("ContentType");
				byte[] fileContent = (byte[])map.get("FileContent");
				result = doFilePost(req.getUrl(),fileName,fileContent,contentType);
			}
			response = (Map)result;
		}catch(Exception e){
			response = new HashMap();
			response.put("_RejCode","E99999");
			response.put("_RejMesssage", e.getMessage());
		}finally{
			if(response==null){
				response = new HashMap();
				response.put("_RejCode","E99999");
				response.put("_RejMesssage", "empty response");
			}
		}
		return response;
	}
	/**
	 * 对返回数据解析 
	 * @param result
	 * @return
	 * TODO
	 * @throws Exception 
	 */
	private Map afterFormat(CloseableHttpResponse result) {
		// TODO Auto-generated method stub
		HttpEntity entity = result.getEntity();
		InputStream inStream = null;
		ByteArrayOutputStream outStream = null;
		try {
			inStream = entity.getContent();
			outStream = new ByteArrayOutputStream();  
			long contentLength = entity.getContentLength();
			byte[] buffer = null;
			if(contentLength <= _1M){
				int length = new Long(contentLength).intValue();
				buffer = new byte[length];
				inStream.read(buffer);
				outStream.write(buffer, 0, length);  
			}else{
				buffer = new byte[1024];
				
				int len = -1;  
			    while ((len = inStream.read(buffer)) != -1) {  
			    	outStream.write(buffer, 0, len);  
			    }
			}
			String contentType = entity.getContentType().getValue();
			String encoding = entity.getContentEncoding()==null?"UTF-8":entity.getContentEncoding().getValue();
			if(contentType.contains("json")){
				System.out.println(contentType);
				return JsonHelper.toMap(new String(outStream.toByteArray(),encoding));
			}else{
				return null;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.error(e, e);
			throw new NetRuntimeException(e.getMessage());
		} finally{
			try{
				if(inStream!=null)inStream.close();
				if(outStream!=null)outStream.close();
			}catch(Exception ex){
				log.warn("===========stream close error===========");
			}
		}
		
	}
	/**
	 * 
	 * @param url
	 * @param json
	 * @return
	 * @throws URISyntaxException 
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public Object doJsonPost(String url,JSONObject jsonObj) throws URISyntaxException, ClientProtocolException, IOException{
		URI uri = new URI(url);
		CloseableHttpClient httpclient = httpClientBuilder.build();
		HttpPost request = new HttpPost();
		request.setURI(uri);
		ByteArrayEntity entity = new ByteArrayEntity(jsonObj.toString().getBytes());
		request.setEntity(entity);
		CloseableHttpResponse response = httpclient.execute(request);
		return afterFormat(response);
	}
	/**
	 * 
	 * @param url
	 * @param filename
	 * @param fileContent
	 * @return
	 * TODO
	 * @throws URISyntaxException 
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public Object doFilePost(String url,String filename,byte[] fileContent,String contentType) throws URISyntaxException, ClientProtocolException, IOException{
		//构造文件
		MultipartEntityBuilder multiPartBuilder =  MultipartEntityBuilder.create();
		multiPartBuilder.addPart("media", new ByteArrayBody(fileContent,contentType,filename));
		CloseableHttpClient httpclient = httpClientBuilder.build();
		//发起请求
		HttpPost request = new HttpPost();
		request.setURI(new URI(url));
		request.setEntity(multiPartBuilder.build());
		CloseableHttpResponse response = httpclient.execute(request);
		return afterFormat(response);
	}
    /**
     * get请求
     * @param url
     * @return
     * @throws URISyntaxException 
     * @throws IOException 
     * @throws ClientProtocolException 
     */
    public Object doGet(String url) throws URISyntaxException, ClientProtocolException, IOException {
		CloseableHttpClient httpclient = httpClientBuilder.build();
		HttpGet request = new HttpGet();
		request.setURI(new URI(url));
		CloseableHttpResponse response = httpclient.execute(request);
		return afterFormat(response);
    }
    
}
