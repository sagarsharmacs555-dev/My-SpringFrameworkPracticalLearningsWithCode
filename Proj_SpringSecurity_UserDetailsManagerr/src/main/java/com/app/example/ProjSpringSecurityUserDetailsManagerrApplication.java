package com.app.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.app.example.security.UserManagementService;

@SpringBootApplication
public class ProjSpringSecurityUserDetailsManagerrApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = null;
		
		context = SpringApplication.run(ProjSpringSecurityUserDetailsManagerrApplication.class, args);
		
		UserManagementService user = context.getBean(UserManagementService.class);
		
		 user.createUser("SagarSharma", "Bhanu7654!", "admin");
		
	}

}
