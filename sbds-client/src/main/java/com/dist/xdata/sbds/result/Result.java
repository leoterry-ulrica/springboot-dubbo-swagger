package com.dist.xdata.sbds.result;

import java.io.Serializable;

public class Result implements Serializable {

	public static String SUCCESSS = "success";
	public static String FAIL = "fail";
	/**
	 * 
	 */
	private static final long serialVersionUID = -3006744497897395934L;

	private String status;
	private String msg;
	private Object data;

	public Result(String status, String msg, Object data) {
		this.status = status;
		this.msg = msg;
		this.data = data;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
