package com.net.plus.wechat.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.net.plus.common.Constants;
import com.net.plus.exception.NetRuntimeException;
import com.net.plus.service.HttpClientRequest;
import com.net.plus.service.HttpClientService;

@Service
public class WechatCGIService{
	
	@Resource
	HttpClientService httpService;
	
	
	//管理wechat接口的接口类型
	private static Map reqObj = new HashMap();
	static{
		reqObj.put("default", Constants.wechatApiCgi+"%s?access_token=%s");
		reqObj.put("menu", Constants.wechatApiCgi + "menu/%s?access_token=%s");
		reqObj.put("media", Constants.wechatApiCgi + "media/%s?access_token=%s&type=%s");
	}
	/**
	 * @param obj 对象
	 * @param params action+accessToken
	 * @return
	 */
	public static String buildUrl(String obj,String ... params){
		String url = (String)reqObj.get(obj);
		if(url==null){
			throw new NetRuntimeException("url is error");
		}
		return String.format(url, params);
	}
	public Map sendParams(String url){
		return httpService.send(url);
	}
	public Map sendParams(String url,Map<String,Object> params){
		HttpClientRequest req = new HttpClientRequest();
		req.setUrl(url);
		req.setContentType("UTF-8");
		req.setType(HttpClientRequest.req_json);
		req.setContent(new JSONObject(params));
		return httpService.send(req);
	}
	
	public Map uploadFile(String url,String fileName,byte[] content){
		HttpClientRequest req = new HttpClientRequest();
		req.setUrl(url);
		req.setContentType("UTF-8");
		req.setType(HttpClientRequest.req_files);
		Map params = new HashMap();
		params.put("FileName", fileName);
		params.put("FileContent",content);
		params.put("ContentType",getContentType(fileName));
		req.setParams(params);
		return httpService.send(req);
	}
	
	private Object getContentType(String fileName) {
		// TODO Auto-generated method stub
		return null;
	}
	public Map send(){
		return null;
	}
}
