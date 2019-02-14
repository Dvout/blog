package com.xug.blog.controller;

import com.xug.blog.vo.Menu;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/** 
* @Description: 用户管理Controller
* @Author: Xugui
* @Date: 19-1-20 
*/ 
@RestController
@RequestMapping("/admins")
public class AdminController {

	/** 
	* @Description:  获取后台管理主界面
	* @Param: [model] 
	* @return: org.springframework.web.servlet.ModelAndView 
	*/
	@GetMapping
	public ModelAndView listUsers(Model model) {
		List<Menu> list = new ArrayList<>();
		list.add(new Menu("用户管理", "/users"));
		model.addAttribute("list", list);
		return new ModelAndView("admins/index", "menuList", model);
	}

}
