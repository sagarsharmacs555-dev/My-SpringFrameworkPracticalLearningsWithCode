package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Company;
import com.app.beans.Employee;
import com.app.beans.Faculty;

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
       
       Company faculty = context.getBean("company", Company.class);
       
       System.out.println(faculty);
    }
}
