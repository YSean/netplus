package com.net.plus.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	
	public static Date currentDate(){
		return new Date();
	}
	public static String currentDateStr(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(new Date());
	}
}
