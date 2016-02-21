package com.net.plus.wechat.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.net.plus.common.Constants;
import com.net.plus.exception.NetRuntimeException;
import com.net.plus.service.HttpClientService;

@Service
public class WechatCGIService{
	
	@Resource
	HttpClientService httpService;
	@Resource
	AccessTokenService accessToken;
	
	private static Map reqObj = new HashMap();
	static{
		reqObj.put("token", Constants.wechatApiCgi+"token?grant_type=client_credential&appid=%s&secret=%s");
		reqObj.put("menu", Constants.wechatApiCgi + "menu?%s?access_token=%s");
	}
	public static String getFormat(String obj){
		return (String)reqObj.get(obj);
	}
	/**
	 * 
	 * @param obj 对象
	 * @param params action+accessToken
	 * @return
	 */
	public static String buildUrl(String obj,String ... params){
		String url = getFormat(obj);
		if(url==null){
			throw new NetRuntimeException("url is error");
		}
		return String.format(url, params);
	}
	
	public static String sendParams(String url,Object obj){
		
		return "";
	}
	
	public static String uploadFile(String url,Object obj){
		return "";
	}
	
	public Map send(){
		return null;
	}
}
