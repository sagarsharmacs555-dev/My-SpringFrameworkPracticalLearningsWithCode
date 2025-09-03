package com.app.example.security;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class MyConfig {
	
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception
	{
		httpSecurity.httpBasic(Customizer.withDefaults())
					.authorizeHttpRequests( c -> c.anyRequest().permitAll());
		
		return httpSecurity.build();
	}
	
	@Bean
	public UserDetailsService userDetails()
	{
		
		 UserDetails u1   = new MyUser("Neymar", "Neymar123", "read");
		 List<UserDetails> userDetailsList = List.of(u1);
		
		
		return new UserServiceImp(userDetailsList);
		
	}
	
	@Bean
	public PasswordEncoder passEncoder()
	{
		return NoOpPasswordEncoder.getInstance();
	}
	
	
	
	
	

}
