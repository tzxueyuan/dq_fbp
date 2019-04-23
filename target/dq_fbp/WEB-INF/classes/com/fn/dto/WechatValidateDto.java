package com.fn.dto;

public class WechatValidateDto {
	
	private String signature;
	
	private String timestamp;
	
	private String nonce;
	
	private String echostr;
	
	private String sysNm;

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getNonce() {
		return nonce;
	}

	public void setNonce(String nonce) {
		this.nonce = nonce;
	}

	public String getEchostr() {
		return echostr;
	}

	public void setEchostr(String echostr) {
		this.echostr = echostr;
	}

	public String getSysNm() {
		return sysNm;
	}

	public void setSysNm(String sysNm) {
		this.sysNm = sysNm;
	}

	@Override
	public String toString() {
		return "WechatValidateDto [signature=" + signature + ", timestamp="
				+ timestamp + ", nonce=" + nonce + ", echostr=" + echostr
				+ ", sysNm=" + sysNm + "]";
	}

	
}
