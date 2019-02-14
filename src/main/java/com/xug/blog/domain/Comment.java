package com.xug.blog.domain;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.sql.Timestamp;

/** 
* @Description: 评论实体
* @Author: Xugui
* @Date: 19-1-27 
*/ 
@Entity
public class Comment implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;//用户的唯一标识

	@NotEmpty(message = "评论不能为空")
	@Size(min = 2, max = 500)
	@Column(nullable = false)
	private String content;

	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;

	@Column(nullable = false)
	@CreationTimestamp//由数据库自动创建时间
	private Timestamp createTime;

	protected Comment() {
	}

	public Comment(User user, String content) {
		this.user = user;
		this.content = content;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}
}
