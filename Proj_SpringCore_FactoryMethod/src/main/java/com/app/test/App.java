package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context = null;
    	
    	context = new ClassPathXmlApplicationContext("com/app/config/config.xml");
    	
    	Object o1 = context.getBean("c3", Class.class);
    	
    	System.out.println(o1);
    }
}
