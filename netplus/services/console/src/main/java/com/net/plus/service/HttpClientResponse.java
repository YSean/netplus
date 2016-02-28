package com.net.plus.service;

import java.io.Serializable;
import java.util.Map;


public class HttpClientResponse implements Serializable{

	/**
	 * 序列化ID
	 */
	private static final long serialVersionUID = 929406654606295012L;
	static final String SUCCESS_CODE = "000000";
	static final String FAIL_CODE = "E99999";
	
	private Map<String,Object>  reqData;
	private String startTime;
	private String endTime;
	private String jnlNo;
	private Map<String,Object>  resData;
	private String retCode;
	private String retMessage;
	
	
	public String getJnlNo() {
		return jnlNo;
	}
	public void setJnlNo(String jnlNo) {
		this.jnlNo = jnlNo;
	}
	public String getRetCode() {
		return retCode;
	}
	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}
	public String getRetMessage() {
		return retMessage;
	}
	public void setRetMessage(String retMessage) {
		this.retMessage = retMessage;
	}
	public Map<String, Object> getReqData() {
		return reqData;
	}
	public void setReqData(Map<String, Object> reqData) {
		this.reqData = reqData;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public Map<String, Object> getResData() {
		return resData;
	}
	public void setResData(Map<String, Object> resData) {
		this.resData = resData;
	}
	
	
}
