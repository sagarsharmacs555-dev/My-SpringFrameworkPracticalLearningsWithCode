package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Employee;

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
        Employee employee = context.getBean("employee", Employee.class);
        
        System.out.println(employee);
    }
}
