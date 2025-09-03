package com.app.example.security;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserServiceImp implements UserDetailsService {
	
	private List<UserDetails> userDetails;
	
	
	public UserServiceImp(List<UserDetails> userDetails)
	{
		this.userDetails = userDetails;
	}
	
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return userDetails.stream()
				.filter(
						
						u -> u.getUsername().equals(username)
						)
				.findFirst()
				.orElseThrow(()-> new UsernameNotFoundException("username not found"));
	}
	
	
	

}
