package com.ahlexports.springbootstarter.users;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/users")
	public List<User> getUsers(){
		return userService.getAllUsers();
	}
	
	@RequestMapping(value="/user/{id}")
	public User getUser(@PathVariable String id) {
		return userService.getUser(id);
	}
}
