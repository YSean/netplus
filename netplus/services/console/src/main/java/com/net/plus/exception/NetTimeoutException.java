package com.net.plus.exception;

public class NetTimeoutException extends NetRuntimeException {

	public NetTimeoutException(){
		super();
	}
	public NetTimeoutException(String message){
		super(message);
	}
}
