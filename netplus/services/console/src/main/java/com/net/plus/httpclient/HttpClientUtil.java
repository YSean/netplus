package com.net.plus.httpclient;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.net.plus.util.Utils;

@Service
public class HttpClientUtil {

	Log log = LogFactory.getLog(HttpClientUtil.class);
	@Autowired
	RestTemplate restTemplate;
	
	public Object doPost(String url, Map<String, String> formParams,String type){
		if (Utils.isEmpty(formParams)) {
            return doPost(url);
        }
        try {
        	HttpHeaders headers =new HttpHeaders();
        	if("json".equals(type)){
        		headers.setContentType(MediaType.APPLICATION_JSON);
        	}else{
        		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        	}
        	HttpEntity request = new HttpEntity(formParams,headers);
            return restTemplate.postForObject(url,request, String.class);
        } catch (Exception e) {
            log.error("POST请求出错：{}"+url, e);
        }
 
        return null;
		
	}
	
	/**
     * post请求
     * @param url
     * @return
     */
    public Map doPost(String url) {
        try {
            return restTemplate.postForObject(url, HttpEntity.EMPTY, Map.class);
        } catch (Exception e) {
            log.error("POST请求出错：{}"+ url, e);
        }
 
        return null;
    }
    
    /**
     * get请求
     * @param url
     * @return
     */
    public Map doGet(String url) {
        try {
            return restTemplate.getForObject(url, Map.class);
        } catch (Exception e) {
            log.error("GET请求出错：{}"+url, e);
        }
 
        return null;
    }
}
