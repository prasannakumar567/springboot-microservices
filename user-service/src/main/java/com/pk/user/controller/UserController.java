package com.pk.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pk.user.entity.User;
import com.pk.user.service.UserService;
import com.pk.user.vo.RestTemplateVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user){
		log.info("USERCONTROLLER ::: SAVE_USER");
		return userService.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public RestTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
		log.info("USERCONTROLLER ::: GET_USER_WITH_DEPARTMENT");
		return userService.getUserWithDepartment(userId);
	}
}
