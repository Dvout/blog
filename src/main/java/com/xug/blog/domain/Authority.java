package com.xug.blog.domain;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

/** 
* @Description: 用户认证实体
* @Author: Xugui
* @Date: 19-1-27 
*/ 
@Entity
public class Authority implements GrantedAuthority {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getAuthority() {
		return name;
	}
}
