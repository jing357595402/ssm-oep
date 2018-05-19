package com.yj.oep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yj.oep.entity.User;
import com.yj.oep.service.IUserService;

@Controller
public class UserController {
	@Autowired
	private IUserService userService;

	@RequestMapping("/users")
	@ResponseBody
	public List<User> getUsers() {
		List<User> users = userService.selectAllUsers();
		System.out.println(users);
		return users;
	}
}
