package com.xug.blog.vo;

/** 
* @Description: 统一返回实体
* @Author: Xugui
* @Date: 19-1-20 
*/ 
public class Response {

	//处理是否成功
	private boolean success;

	//处理得到的消息内容
	private String message;

	//处理得到的结果内容
	private Object body;

	public Response(boolean success, String message) {
		this.success = success;
		this.message = message;
	}

	public Response(boolean success, String message, Object body) {
		this.success = success;
		this.message = message;
		this.body = body;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getBody() {
		return body;
	}

	public void setBody(Object body) {
		this.body = body;
	}
}
