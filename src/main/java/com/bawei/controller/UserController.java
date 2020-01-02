package com.bawei.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bawei.entity.User;
import com.bawei.service.UserService;
import com.github.pagehelper.PageInfo;

@Controller
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping("selects")
	public String selects(Model model,
			@RequestParam(defaultValue = "1")Integer page,
			@RequestParam(defaultValue = "3")Integer pageSize) {
		PageInfo<User> info = userService.selects(page, pageSize);
		model.addAttribute("info",info);
		return "list";
		
	}
}
