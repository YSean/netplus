/*
 * @(#)AbstractHttpConnMgmtParams.java 2013-7-12
 * Copyright 2008 Client Service International, Inc. All rights reserved.
 * CSII PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.net.plus.common.http.connmgmt;

/**
 * AbstractHttpConnMgmtParams.java
 * 
 * <p>
 * Created on 2013-7-12 Modification history
 * <p>
 *
 * @author yixx
 * @version 1.0
 * @since 1.0
 */
public class HttpConnMgmtParams {

	private int maxTotalConns = 20;//最大连接数，默认：20
    private int maxRouteConns = 2;//每个路由最大连接数 ，默认：2
    private int connTimeout = 0;//连接超时时间 ，默认：0
    private int soTimeout = 0;//读取超时时间，默认：0
    private int soBuffSize = 8024;//缓存区大小，默认：8024
    private boolean tcpNoDelay = Boolean.FALSE;//是否使用Nagle算法，压缩被发送的数据到最节省宽带，默认：false
    
	public int getMaxTotalConns() {
		return maxTotalConns;
	}
	public void setMaxTotalConns(int maxTotalConns) {
		this.maxTotalConns = maxTotalConns;
	}
	public int getMaxRouteConns() {
		return maxRouteConns;
	}
	public void setMaxRouteConns(int maxRouteConns) {
		this.maxRouteConns = maxRouteConns;
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
	public int getSoBuffSize() {
		return soBuffSize;
	}
	public void setSoBuffSize(int soBuffSize) {
		this.soBuffSize = soBuffSize;
	}
	public boolean isTcpNoDelay() {
		return tcpNoDelay;
	}
	public void setTcpNoDelay(boolean tcpNoDelay) {
		this.tcpNoDelay = tcpNoDelay;
	}
	
	public String toString() {
		return getClass().getName() + " MaxTotalConns:" + maxTotalConns + " MaxRouteConns:" + maxRouteConns
				+ " ConnTimeout:" + connTimeout + " SoTimeout:" + soTimeout + " SoBuffSize:" + soBuffSize + " TcpNoDelay:" + tcpNoDelay;
	}

}
