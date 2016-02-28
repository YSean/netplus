package com.net.plus.util;

import java.util.List;
import java.util.UUID;

public class Utils {

	public static boolean isEmpty(Object obj){
		if(obj==null)return true;
		if(obj instanceof String){
			return ((String) obj).trim().length() >0 ;
		}else if(obj instanceof List){
			return ((List)obj).size() > 0;
		}
		return false;
	}
	
	public static String buildString(String ... args){
		StringBuilder builder = new StringBuilder();
		for(String i : args){
			builder.append(i);
		}
		return builder.toString();
	}
	
	public static String getUuid(){
		return UUID.randomUUID().toString();
	}
}
