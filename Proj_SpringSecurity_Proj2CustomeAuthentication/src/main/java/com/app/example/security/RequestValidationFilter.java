package com.app.example.security;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RequestValidationFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		   HttpServletRequest httpServletRequest =(HttpServletRequest)request;
		   HttpServletResponse httpServletResponse =(HttpServletResponse)response;
		   
		   String requestId = httpServletRequest.getHeader("Request-Id");
		   
		   if(requestId == null || requestId.isEmpty())
		   {
			   httpServletResponse.setStatus(httpServletResponse.SC_BAD_REQUEST);
		   }
		   
		   chain.doFilter(httpServletRequest, httpServletResponse);
		
	}

}
