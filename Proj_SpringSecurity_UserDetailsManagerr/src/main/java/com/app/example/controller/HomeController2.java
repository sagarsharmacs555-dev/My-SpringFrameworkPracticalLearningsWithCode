package com.app.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController2 {
	
	@GetMapping("/home")
	public String home()
	{
		return "home";
				
	}

}
