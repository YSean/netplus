/*
 * @(#)ByteArrayResponseHandler.java 2013-7-12
 * Copyright 2008 Client Service International, Inc. All rights reserved.
 * CSII PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.net.plus.common.http.handler;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

import com.net.plus.common.Utils.Util;

/**
 * ByteArrayResponseHandler.java
 * 
 * <p>
 * Created on 2013-7-12 Modification history
 * <p>
 *
 * @author yixx
 * @version 1.0
 * @since 1.0
 */
public class ByteArrayResponseHandler implements ResponseHandler<byte[]> {

	/**
     * Returns the response body as a byte array if the response was successful (a
     * 2xx status code). If no response body exists, this returns null. If the
     * response was unsuccessful (>= 300 status code), throws an
     * {@link HttpResponseException}.
     */
	public byte[] handleResponse(HttpResponse response)
			throws ClientProtocolException, IOException {
		StatusLine statusLine = response.getStatusLine();
        HttpEntity entity = response.getEntity();
        if (statusLine.getStatusCode() >= 300) {
            EntityUtils.consume(entity);
            throw new HttpResponseException(statusLine.getStatusCode(),
                    statusLine.getReasonPhrase());
        }
        byte[] result = null;
		long len = entity.getContentLength();
		if (len != -1 && len < 4096) {
			result = EntityUtils.toByteArray(entity);
		} else {
			result = Util.toByteArray(entity);
		}
		EntityUtils.consume(entity);
		return result;
	}
}
