package com.app.example.security;

import org.springframework.beans.factory.annotation.Autowired;
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
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
public class MySecurityConfig {
	
	public StaticAuthenticationFilter filter;
	
	public MySecurityConfig(StaticAuthenticationFilter filter)
	{
		this.filter = filter;
	}
	
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception
	{
		httpSecurity.httpBasic(Customizer.withDefaults());
		httpSecurity.addFilterBefore(new RequestValidationFilter(), BasicAuthenticationFilter.class);
		httpSecurity.addFilterAt(new RequestValidationFilter(), BasicAuthenticationFilter.class);
		httpSecurity.addFilterAfter(new RequestValidationFilter2(), BasicAuthenticationFilter.class);
		
		httpSecurity.authorizeHttpRequests(c -> c.anyRequest().authenticated());
		
		return httpSecurity.build();
	}
	
	
	@Bean
	public UserDetailsService userDetailsService()
	{
		
		UserDetails u1 = User.withUsername("Neymar")
								.password("Neymar123")
								.authorities("admin")
								.build();
		
		return new InMemoryUserDetailsManager(u1);
		
		
	}
	
	@Bean
	public PasswordEncoder passEncoder()
	{
		return NoOpPasswordEncoder.getInstance();
	}

}
