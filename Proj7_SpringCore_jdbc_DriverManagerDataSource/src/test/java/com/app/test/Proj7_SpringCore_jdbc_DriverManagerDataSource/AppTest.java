package com.app.test.Proj7_SpringCore_jdbc_DriverManagerDataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest 
    
{

	public static void main(String[] args) {
		
		ApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("com/app/config/config.xml");
		
		Object obj = context.getBean("ds");
		
		System.out.println(obj);
	}
}
