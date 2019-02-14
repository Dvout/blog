package com.xug.blog.vo;

/** 
* @Description: 用户管理的菜单项
* @Author: Xugui
* @Date: 19-1-27 
*/ 
public class Menu {

	private String name;//菜单名称

	private String url;//菜单URL

	public Menu(String name, String url) {
		this.name = name;
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
