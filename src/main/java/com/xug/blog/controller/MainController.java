package com.xug.blog.controller;

import com.xug.blog.domain.Authority;
import com.xug.blog.domain.User;
import com.xug.blog.service.AuthorityService;
import com.xug.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

/** 
* @Description:  主页控制器
* @Author: Xugui
* @Date: 19-1-20 
*/ 
@Controller
public class MainController {

	//用户权限（博主）
	private static final Long ROLE_USER_AUTHORITY_ID = 2L;

	@Autowired
	private UserService userService;

	@Autowired
	private AuthorityService authorityService;

	@GetMapping("/")
	public String root() {
		return "redirect:/index";
	}

	@GetMapping("/index")
	public String index() {
		return "redirect:/blogs";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/login-error")
	public String loginError(Model model) {
		model.addAttribute("loginError", true);
		model.addAttribute("errorMsg", "登录失败，用户名或者密码错误！");
		return "login";
	}

	/**
	 * 注册用户界面
	 *
	 * @return
	 */
	@GetMapping("/register")
	public String register() {
		return "register";
	}

	/**
	 * 注册用户
	 *
	 * @param user
	 * @return
	 */
	@PostMapping("/register")
	public String registerUser(User user) {
		List<Authority> authorities = new ArrayList<>();
		authorities.add(authorityService.getAuthorityById(ROLE_USER_AUTHORITY_ID).get());
		user.setAuthorities(authorities);
		user.setEncodePassword(user.getPassword());
		userService.registerUser(user);
		return "redirect:/login";
	}

}
