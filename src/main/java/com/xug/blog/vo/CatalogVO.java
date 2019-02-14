package com.xug.blog.vo;

import com.xug.blog.domain.Catalog;

/** 
* @Description: Catalog
* @Author: Xugui
* @Date: 19-1-27 
*/ 
public class CatalogVO {

	private String username;
	private Catalog catalog;

	public CatalogVO() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Catalog getCatalog() {
		return catalog;
	}

	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}

}
