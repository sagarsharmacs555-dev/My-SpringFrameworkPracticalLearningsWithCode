package com.app.example.security;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class StaticAuthenticationFilter implements Filter {
	
	@Value("${Authorization.key}")
	public String authKey;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		   HttpServletRequest httpServletRequest =(HttpServletRequest)request;
		   HttpServletResponse httpServletResponse =(HttpServletResponse)response;
		   
		   String authorizationKey = httpServletRequest.getHeader("Authorizationn");
		   
		   if(authorizationKey.equals(authKey))
		   {
			   chain.doFilter(httpServletRequest, httpServletResponse);
		   }
		   
		   httpServletResponse.setStatus(httpServletResponse.SC_BAD_REQUEST);
		   
		
	}
	
	

}
