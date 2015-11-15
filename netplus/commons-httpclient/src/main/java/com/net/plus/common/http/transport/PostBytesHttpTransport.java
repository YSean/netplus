/*
 * @(#)PostBytesHttpTransport.java 2013-7-12
 * Copyright 2008 Client Service International, Inc. All rights reserved.
 * CSII PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.net.plus.common.http.transport;

import java.io.UnsupportedEncodingException;
import java.net.ConnectException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.ContentType;


/**
 * PostBytesHttpTransport.java
 * 
 * <p>
 * Created on 2013-7-12 Modification history
 * <p>
 * 
 * @author yixx
 * @version 1.0
 * @since 1.0
 */
public class PostBytesHttpTransport extends AbstractHttpClientTransport<byte[]> {

	private Log log = LogFactory.getLog(PostBytesHttpTransport.class);
	private String mimeType;
	private String charset;
	private ResponseHandler<byte[]> resHandler;
	private static long counter = 0L;

	public byte[] send(HttpClient httpClient, Object obj) {
		byte[] bytes = (byte[]) obj;
		HttpPost post = new HttpPost(getSendUrl());
		ByteArrayEntity entity = new ByteArrayEntity(bytes, ContentType.create(
				mimeType, charset));
		entity.setChunked(true);
		post.setEntity(entity);
		try {
			byte[] response = httpClient.execute(post, resHandler);
			return response;
		}catch (ConnectException ce) {
			post.abort();
			log.error("Http transport error."+getSendUrl().toString(), ce);
			/*CommunicationException cce = new  CommunicationException("pe.connect_failed");
			cce.setDefaultMessage(getSendUrl().toString());
			throw cce;*/
		} catch (Exception ex) {
			post.abort();
			/*log.error("Http transport error."+getSendUrl().toString(), ex);
			throw new CommunicationException("pe.error.undefined", ex);*/
		}
		return null;
	}

	@Override
	public Object submit(Object data) throws Exception {
		counter++;
		return super.submit(data);
	}

	public void preSend(Object data) {
		try {
			if (log.isDebugEnabled()) {
				log.debug("REQUEST URL[" + counter + "]: " + getSendUrl().toString());
				log.debug("REQUEST MESSAGE[" + counter + "]: \n"
						+ new String((byte[]) data, "UTF-8"));
			}
		} catch (UnsupportedEncodingException e) {
		}
	}

	public void aftSend(Object data) {
		try {
			if (log.isDebugEnabled()) {
				log.debug("RESPONSE MESSAGE[" + counter + "]: \n"
						+ new String((byte[]) data, "UTF-8"));
			}
		} catch (UnsupportedEncodingException e) {
		}
	}

	/**
	 * @param mimeType
	 *            the mimeType to set
	 */
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	/**
	 * @param charset
	 *            the charset to set
	 */
	public void setCharset(String charset) {
		this.charset = charset;
	}

	/**
	 * @param resHandler
	 *            the resHandler to set
	 */
	public void setResHandler(ResponseHandler<byte[]> resHandler) {
		this.resHandler = resHandler;
	}

}
