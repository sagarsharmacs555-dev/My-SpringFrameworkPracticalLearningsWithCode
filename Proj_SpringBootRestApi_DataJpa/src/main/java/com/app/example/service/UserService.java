package com.app.example.service;

import java.util.List;

import com.app.example.entity.User;

public interface UserService {

	

	public String saveUser(User userEntity);
	public String saveUserInBatch(List<User> userEntity);
}
