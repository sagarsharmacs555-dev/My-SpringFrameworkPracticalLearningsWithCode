package com.app.example.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.stereotype.Service;

@Service
public class UserManagementService {
	
	@Autowired
	private JdbcUserDetailsManager jdbcUserDetailsManager;
	
	//createUser
	public void createUser(String username, String password, String... authority)
	{
		UserDetails u1 = User.withUsername(username)
			.password(password)
			.authorities(authority)
			.build();
		
		jdbcUserDetailsManager.createUser(u1);
	}
	
	//deleteUser
	public void deleteUser(String username)
	{
		jdbcUserDetailsManager.deleteUser(username);
	}
	
	//UserExists
	public boolean userExists(String username)
	{
		return jdbcUserDetailsManager.userExists(username);
	}
	
	//ChangePassword
	public void changePassword(String oldPassword, String newPassword)
	{
		jdbcUserDetailsManager.changePassword(oldPassword, newPassword);
	}
	
	
	//UpdateUser
	public void updateUser(String username, String password, String... authority)
	{
		UserDetails u1 = User.withUsername(username)
				.password(password)
				.authorities(authority)
				.build();
			
			jdbcUserDetailsManager.updateUser(u1);
	}
	
	
	

}
