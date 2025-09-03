package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Users;

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
       
       Users users = context.getBean("users", Users.class);
       System.out.println(users);
       
       
    }
}
