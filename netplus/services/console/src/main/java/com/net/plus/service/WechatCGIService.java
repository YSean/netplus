package com.net.plus.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.net.plus.common.Constants;
import com.net.plus.exception.NetRuntimeException;

@Service
public class WechatCGIService{
	
	@Resource
	HttpClientService httpService;
	
	private static Map reqObj = new HashMap();
	static{
		reqObj.put("token", Constants.wechatApiCgi+"token?grant_type=client_credential&appid=%s&secret=%s");
	}
	public static String getFormat(String obj){
		return (String)reqObj.get(obj);
	}
	public static String buildUrl(String obj,String ... params){
		String url = getFormat(obj);
		if(url==null){
			throw new NetRuntimeException("url is error");
		}
		return String.format(url, params);
	}
}
