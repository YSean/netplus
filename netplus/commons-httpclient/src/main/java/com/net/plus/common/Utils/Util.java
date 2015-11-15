/*
 * @(#)Util.java 2013-7-12
 * Copyright 2008 Client Service International, Inc. All rights reserved.
 * CSII PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.net.plus.common.Utils;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.util.ByteArrayBuffer;

/**
 * Util.java
 * 
 * <p>
 * Created on 2013-7-12 Modification history
 * <p>
 *
 * @author yixx
 * @version 1.0
 * @since 1.0
 */
public class Util {

	public static byte[] toByteArray(HttpEntity entity) {
		InputStream instream = null;
		byte[] ret = null;
		try {
			if(entity == null){
				throw new IllegalArgumentException("HTTP entity may not be null");
			}
			instream = entity.getContent();
			if(instream == null){
				return null;
			}
			int i = (int)entity.getContentLength();
			if(i < 0){
				i = 4096;
			}
			ByteArrayBuffer buffer = new ByteArrayBuffer(i);
			byte tmp[] = new byte[4096];
			int l;
			while((l = instream.read(tmp)) != -1) {
				buffer.append(tmp, 0, l);
			}
			ret = buffer.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(instream != null){
					instream.close();
				}
			} catch (IOException e) {
				
			}
		}
		
		return ret;
    }
	
	public static byte[] getBytesFromFile(String file) {
		if (file == null) {
			return null;
		}
		byte[] ret = null;
		FileInputStream in=null;
		try {
			in = new FileInputStream(file);
			ByteArrayOutputStream out = new ByteArrayOutputStream(4096);
			byte[] b = new byte[4096];
			int n;
			while ((n = in.read(b)) != -1) {
				out.write(b, 0, n);
			}
			ret = out.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(in!=null){
				try {
					in.close();
				} catch (IOException e) {

				}
			}
		}
		return ret;
	}
	
}
