package com.app.example.Proj1_SpringIocContainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/app/config/config.xml");
    	System.out.println(context);
    	
    	Student student =   context.getBean("Student", Student.class);
    	
    	student.showDetails();
    	
    	student.showValues();
    }
}
