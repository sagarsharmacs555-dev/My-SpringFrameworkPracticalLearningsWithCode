package com.app.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.app")
public class Date1 {
	
	@Bean
	public Date date()
	{
		return new Date();
	}
	
	@Bean
	public Date date2()
	{
		return new Date();
	}

}
