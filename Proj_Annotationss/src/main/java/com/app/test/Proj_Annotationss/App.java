package com.app.test.Proj_Annotationss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Amazon;
import com.app.beans.Employee;
import com.app.beans.Student;

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
    	
    	Amazon amazon = context.getBean(Amazon.class);
    	amazon.trackOrder(12345);
    	
    
    }
}
