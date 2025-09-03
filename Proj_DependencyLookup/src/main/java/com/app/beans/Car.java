package com.app.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car {
	
	public void musicSystem()
	{
		System.out.println("music System in on");
	}
	
	public void horn()
	{
		System.out.println("horn is blown");
	}
	
	public void journey(String start, String end)
	{
		ApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("com/app/config/config.xml");
		
		Engine engine = context.getBean("engine", Engine.class);
		
		engine.startEngine();
		System.out.println("journery started..... from " + start);
		System.out.println("now we reached at " + end);
		System.out.println("now our journey ends......");
		engine.stopEngine();
		
	}

}
