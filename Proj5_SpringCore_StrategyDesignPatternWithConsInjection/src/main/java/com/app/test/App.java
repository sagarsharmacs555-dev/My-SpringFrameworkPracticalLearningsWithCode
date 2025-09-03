package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Amazon;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = null;
        
        applicationContext = new ClassPathXmlApplicationContext("com/app/config/config.xml");
        
        Amazon amazon = applicationContext.getBean("amazon", Amazon.class);
        
        amazon.getOrderDetails(new String[] {"pen", "pencil"}, new Float[] {12.3f, 32.2f});
        
        amazon.dispatchOrder();
        amazon.trackOrder();
        amazon.returnOrder();
        
    }
}
