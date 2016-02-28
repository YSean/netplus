package com.net.plus.service;

import java.util.Map;

public class HttpClientRequest {

	public static final String PARAM_FILE_NAME = "FileName";
	public static final String PARAM_FILE_FIELD = "FileField";
	public static final String PARAM_CONTENT_TYPE = "FileContentType";
	public static final String PARAM_CONTENT_ENCODING = "FileContentEncoding";
	public static final String req_json = "json";
	public static final String req_files = "files";
	public static final String req_xml = "xml";
	public static final String req_default = "default";

	String url;
	String type;
	Map<String, Object> params;
	String encoding;
	String contentType;
	Object content;

	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Map<String, Object> getParams() {
		return params;
	}

	public void setParams(Map<String, Object> params) {
		this.params = params;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}

}
