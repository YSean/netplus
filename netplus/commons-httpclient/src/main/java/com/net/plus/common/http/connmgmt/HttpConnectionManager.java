/*
 * @(#)HttpConnectionManager.java 2013-7-12
 * Copyright 2008 Client Service International, Inc. All rights reserved.
 * CSII PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.net.plus.common.http.connmgmt;

import java.io.IOException;

import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.springframework.beans.factory.InitializingBean;

/**
 * HttpConnectionManager.java
 * 
 * <p>
 * Created on 2013-7-12 Modification history
 * <p>
 *
 * @author yixx
 * @version 1.0
 * @since 1.0
 */
public class HttpConnectionManager implements InitializingBean {

	private static HttpParams httpParams;  
    private static PoolingClientConnectionManager connectionManager;
    private int maxTotalConns;
    private int maxRouteConns;
    private int connTimeout;
    private int soTimeout;
    private int soBuffSize;
    private boolean tcpNoDelay;
    private static int retryCount;
    
    public HttpConnectionManager() {
    	maxTotalConns = 100;
    	maxRouteConns = 50;
    	connTimeout = 0;
    	soTimeout = 0;
    	soBuffSize = 8024;
    	tcpNoDelay = Boolean.FALSE;
    	retryCount = 0;
    }
  
    private void init(){
    	connectionManager = new PoolingClientConnectionManager();
    	connectionManager.setMaxTotal(maxTotalConns);
    	connectionManager.setDefaultMaxPerRoute(maxRouteConns);
    	
    	httpParams = new BasicHttpParams();
    	HttpConnectionParams.setConnectionTimeout(httpParams, connTimeout);  
    	HttpConnectionParams.setSoTimeout(httpParams, soTimeout);
    	HttpConnectionParams.setSocketBufferSize(httpParams, soBuffSize);
    	HttpConnectionParams.setTcpNoDelay(httpParams, tcpNoDelay);
    	
    }
  
    public static HttpClient getHttpClient() {
    	connectionManager.closeExpiredConnections();
    	DefaultHttpClient httpClient = new DefaultHttpClient(connectionManager, httpParams);
    	httpClient.setHttpRequestRetryHandler(new HttpRequestRetryHandler() {
			
			public boolean retryRequest(IOException ioexception, int i, HttpContext httpcontext) {
				if(i <= retryCount) {
					// retry if less than the retry count
					return true;
				}
				return false;
			}
		});
        return httpClient;
    }

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	public void afterPropertiesSet() throws Exception {
		init();
	}
	
	public void shutdown() {
		if(connectionManager != null) {
			connectionManager.shutdown();
		}
	}

	public void setMaxTotalConns(int maxTotalConns) {
		this.maxTotalConns = maxTotalConns;
	}

	public void setMaxRouteConns(int maxRouteConns) {
		this.maxRouteConns = maxRouteConns;
	}

	public void setConnTimeout(int connTimeout) {
		this.connTimeout = connTimeout;
	}

	public void setSoTimeout(int soTimeout) {
		this.soTimeout = soTimeout;
	}

	public void setSoBuffSize(int soBuffSize) {
		this.soBuffSize = soBuffSize;
	}

	public void setTcpNoDelay(boolean tcpNoDelay) {
		this.tcpNoDelay = tcpNoDelay;
	}

	public void setRetryCount(int count) {
		retryCount = count;
	}

}
