package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController  {
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("name", "Ankit Kumar Joshi");
		
		System.out.println("This is home url");
		
		List<String> friends = new ArrayList<String>();
		friends.add("Ankit");
		friends.add("Ram");
		friends.add("Himanshu");
		
		model.addAttribute("f", friends);
		
		return "index";
				
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("This is about url");
		
		return "about";
				
	}



}
