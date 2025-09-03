package com.app.test.Proj_factoryMethodPractice;

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
        
        String st = context.getBean("s2", String.class);
        System.out.println(st);
        
        String st1 = context.getBean("s4", String.class);
        System.out.println(st1);
    }
}
