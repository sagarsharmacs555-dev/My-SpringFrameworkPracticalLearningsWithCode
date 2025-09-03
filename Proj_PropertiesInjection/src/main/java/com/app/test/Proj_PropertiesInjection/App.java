package com.app.test.Proj_PropertiesInjection;

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
        ApplicationContext context  = null;
        
        context = new ClassPathXmlApplicationContext("com/app/config/config.xml");
        
        Employee emp =context.getBean("employee", Employee.class);
        System.out.println(emp);
    }
}
