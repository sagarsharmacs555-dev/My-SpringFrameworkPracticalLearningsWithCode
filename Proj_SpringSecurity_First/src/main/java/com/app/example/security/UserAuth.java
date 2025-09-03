package com.app.example.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class UserAuth {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
	{
		http.httpBasic(Customizer.withDefaults())
			.authorizeHttpRequests(c -> c.anyRequest().authenticated());
			
			return http.build();
		
	}
	
	@Bean
	public UserDetailsService userDetailsService()
	{
		UserDetails user =     User.withUsername("SagarSharma")
			                       .password("Sagar123")
			                       .authorities("admin")
			                       .build();
		
		UserDetails user2 =     User.withUsername("RaghavSharma")
                .password("Raghav123")
                .authorities("admin")
                .build();
		
		
		UserDetails user3 =     User.withUsername("ShamSharma")
                .password("Sham123")
                .authorities("admin")
                .build();
		
		UserDetails user4 =     User.withUsername("HoneySharma")
                .password("Honey123")
                .authorities("admin")
                .build();
		
		UserDetails user5 =     User.withUsername("VanshSharma")
                .password("Vansh123")
                .authorities("admin")
                .build();
		
		return new InMemoryUserDetailsManager(user,user2,user3,user4,user5);
	}
	
	@Bean
	public PasswordEncoder passEncoder()
	{
		return NoOpPasswordEncoder.getInstance();
	}

}
