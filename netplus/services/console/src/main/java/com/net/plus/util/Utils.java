package com.net.plus.util;

import java.util.List;

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
}
