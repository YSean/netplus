/*
 * @(#)AbstractHttpClientTransport.java 2013-7-12
 * Copyright 2008 Client Service International, Inc. All rights reserved.
 * CSII PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.net.plus.common.http.transport;

import java.net.URI;

import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.conn.params.ConnRoutePNames;
import org.springframework.util.StringUtils;

import com.net.plus.common.http.connmgmt.HttpConnectionManager;

/**
 * AbstractHttpClientTransport.java
 * 
 * <p>
 * Created on 2013-7-12 Modification history
 * <p>
 *
 * @author yixx
 * @version 1.0
 * @since 1.0
 */
public abstract class AbstractHttpClientTransport<T> implements Transport {

	private boolean isProxy = Boolean.FALSE;//是否使用代理
	private String proxyHost;//代理主机
	private int proxyPort;//代理端口
	
	private String protocol;//协议
	private String host;//目标服务器IP或名称
	private int port = -1;//目标端口
	private String target;//请求地址
	private String queryString;//查询参数
	
	private int connTimeout = 80000;//连接超时时间
    private int soTimeout = 80000;//读取超时时间
	
	private String url;
	
	
	public Object submit(Object data) throws Exception {
		HttpClient httpClient = init();
		preSend(data);
		Object obj = send(httpClient, data);
		aftSend(obj);
		return obj;
	}
	

	public HttpClient init(){
		HttpClient httpClient = HttpConnectionManager.getHttpClient();
		httpClient.getParams().setParameter("http.connection.timeout",  this.connTimeout);
		httpClient.getParams().setParameter("http.socket.timeout",  this.soTimeout);
		if(isProxy){
			HttpHost proxy = new HttpHost(proxyHost, proxyPort, "http");
			httpClient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);
			
		}
		return httpClient;
	}
	
	public void preSend(Object data) {
		
	}
	
	public abstract T send(HttpClient httpClient, Object obj);
	
	public void aftSend(Object data) {
		
	}

	public URI getSendUrl() {
		try {
			if(StringUtils.hasText(url)){
				return new URIBuilder(url).build();
			}
			URIBuilder builder = new URIBuilder();
			if(StringUtils.hasText(protocol)){
				builder.setScheme(protocol);
			}
			if(StringUtils.hasText(host)){
				builder.setHost(host);
			}
			if(port != -1){
				builder.setPort(port);
			}
			if(StringUtils.hasText(target)){
				builder.setPath(target);
			}
			if(StringUtils.hasText(queryString)){
				builder.setQuery(queryString);
			}
			return builder.build();
		} catch (Exception e) {
			return null;
		}
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isProxy() {
		return isProxy;
	}

	public void setProxyHost(String proxyHost) {
		this.proxyHost = proxyHost;
	}

	public void setProxyPort(int proxyPort) {
		this.proxyPort = proxyPort;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}

	public int getConnTimeout() {
		return connTimeout;
	}

	public void setConnTimeout(int connTimeout) {
		this.connTimeout = connTimeout;
	}

	public int getSoTimeout() {
		return soTimeout;
	}

	public void setSoTimeout(int soTimeout) {
		this.soTimeout = soTimeout;
	}
	
}
