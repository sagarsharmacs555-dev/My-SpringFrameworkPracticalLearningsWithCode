package com.app.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.example.entity.User;
import com.app.example.service.UserService;

@RestController
@RequestMapping("/student")
public class RestControllerTest {

	@Autowired
	UserService userService;
	
	@PostMapping("/save")
	public String saveUserRequest(@RequestBody User userEntity)
	{
		userService.saveUser(userEntity);
		
		return "User Saved successfully";
	}
	
	@PostMapping("/saveAll")
	public String saveUserRequests(@RequestBody List<User> userEntity)
	{
		userService.saveUserInBatch(userEntity);
		
		return "User Saved successfully";
	}
	
	@PostMapping("/just/{id}")
	public String justMethod(@PathVariable int id)
	{
		
		return "The Id is " + id;
	}
	
	
}
