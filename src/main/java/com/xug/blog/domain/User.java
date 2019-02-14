package com.xug.blog.domain;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/** 
* @Description: 用户实体
* @Author: Xugui
* @Date: 19-1-27 
*/ 
@Entity // 实体
public class User implements UserDetails {

	private static final long serialVersionUID = 1L;

	@Id // 主键
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 自增长策略
	private Long id; // 实体一个唯一标识

	@NotEmpty(message = "姓名不能为空")
	@Size(min = 2, max = 20)
	@Column(nullable = false, length = 20)
	private String name;

	@NotEmpty(message = "邮箱不能为空")
	@Size(max = 50)
	@Email(message = "邮箱格式不正确")
	@Column(nullable = false, length = 50, unique = true)
	private String email;

	@NotEmpty(message = "账号不能为空")
	@Size(min = 3, max = 20)
	@Column(nullable = false, length = 20, unique = true)
	private String username;

	@NotEmpty(message = "密码不能为空")
	@Size(min = 6, max = 255)
	@Column(nullable = false, length = 30)
	private String password;

	@Column(length = 200)
	private String avatar;//头像图片地址

	@ManyToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinTable(name = "user_authority", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "authority_id", referencedColumnName = "id"))
	private List<Authority> authorities;

	protected User() { // 无参构造函数；设为 protected 防止直接使用
	}

	public User(Long id, String name, String username, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.username = username;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public void setAuthorities(List<Authority> authorities) {
		this.authorities = authorities;
	}

	@Override
	public String toString() {
		return String.format("User [id=%d, username='%s', name='%s', email='%s', authorities='%s']", id, username, name, email, authorities);
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		//要将grantedauthority转化为simplegrantedauthority，否则前端拿不到角色列表
		List<SimpleGrantedAuthority> simpleGrantedAuthorities = new ArrayList<>();
		for (GrantedAuthority authority : this.authorities) {
			simpleGrantedAuthorities.add(new SimpleGrantedAuthority(authority.getAuthority()));
		}
		return simpleGrantedAuthorities;
	}

	public void setEncodePassword(String password) {
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodePassword = encoder.encode(password);
		this.password = encodePassword;
	}

}
