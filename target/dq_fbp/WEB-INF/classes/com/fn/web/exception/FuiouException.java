package com.fn.web.exception;

import com.fn.web.enums.ResultType;





@SuppressWarnings("serial")
public class FuiouException extends Exception {

	protected String iErrCode;

	protected String iErrMessage = "";

	public FuiouException(String aMessage) {
		super(aMessage);
	}

	public FuiouException(String aCode, String aMessage) {
		super(aMessage);
		iErrCode = aCode;
		iErrMessage = aMessage.trim();
	}
	
	
	public FuiouException(ResultType rt) {
		super(rt.getMsg());
		iErrCode = rt.getCode();
		iErrMessage = rt.getMsg().trim();
	}
	
	public String getCode() {
		return iErrCode;
	}

	public String getMessage() {
		return super.getMessage();
	}

	public FuiouException(String aCode, String aMessage, String aDetailMessage) {
		super(aMessage.trim());
		iErrCode = aCode;
		iErrMessage = aDetailMessage.trim();
	}

	
}
