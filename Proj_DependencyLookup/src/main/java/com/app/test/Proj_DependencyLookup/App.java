package com.app.test.Proj_DependencyLookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Car;

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
    	
    	Car car = context.getBean("car", Car.class);
    	car.musicSystem();
    	car.horn();
    	car.journey("Jammu", "Himachal");
    }
}
