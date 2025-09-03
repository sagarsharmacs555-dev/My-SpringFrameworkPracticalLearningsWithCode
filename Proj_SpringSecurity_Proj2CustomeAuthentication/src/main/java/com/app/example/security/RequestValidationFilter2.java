package com.app.example.security;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RequestValidationFilter2 implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		   HttpServletRequest httpServletRequest =(HttpServletRequest)request;
		   HttpServletResponse httpServletResponse =(HttpServletResponse)response;
		   
		   String requestId = httpServletRequest.getHeader("user");
		   String requestId2 = httpServletRequest.getHeader("pass");
		   
		   if(!requestId.equals("SagarSharma") && !requestId2.equals("12345678"))
		   {
			   httpServletResponse.setStatus(httpServletResponse.SC_BAD_GATEWAY);
		   }
		   
		   chain.doFilter(httpServletRequest, httpServletResponse);
		
	}

}
