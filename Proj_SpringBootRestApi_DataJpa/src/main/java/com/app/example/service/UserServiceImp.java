package com.app.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.example.entity.User;
import com.app.example.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public String saveUser(User userEntity) {
		
		  User userEntity1 = userRepository.save(userEntity);
		
		return "User Saved successfully";
	}

	@Override
	public String saveUserInBatch(List<User> userEntity) {
		
		userRepository.saveAll(userEntity);
		
		return null;
	}


}
