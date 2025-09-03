package com.app.test.Proj_AutowireAnnotationFromSetterAndConstruction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Amazon;
import com.app.beans.StudentDetails;

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
    	
    	Amazon amazon =context.getBean("amazon",Amazon.class);
    	amazon.trackOrder(12342);
    }
}
