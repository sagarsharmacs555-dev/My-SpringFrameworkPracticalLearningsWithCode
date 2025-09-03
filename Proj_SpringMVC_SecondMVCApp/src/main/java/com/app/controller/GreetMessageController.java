package com.app.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.app.service.GreetService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GreetMessageController implements Controller {
	
	private GreetService greetService;
	
	public GreetMessageController(GreetService greetService)
	{
		this.greetService = greetService;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String msg =greetService.greetingMessage();
		ModelAndView mav = new ModelAndView("greet", "msgController", msg);
		
		return mav;
	}

}
