package com.xug.blog.util;

import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

/** 
* @Description: ConstraintViolationException 处理器
* @Author: Xugui
* @Date: 19-1-27 
*/ 
public class ConstraintViolationExceptionHandler {

	public static String getMessage(ConstraintViolationException e) {
		List<String> msgList = new ArrayList<>();
		for (ConstraintViolation<?> c : e.getConstraintViolations()) {
			msgList.add(c.getMessage());
		}
		String message = StringUtils.join(msgList.toArray(), ";");
		return message;
	}
}
