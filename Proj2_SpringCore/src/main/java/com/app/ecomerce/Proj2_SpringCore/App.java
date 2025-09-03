package com.app.ecomerce.Proj2_SpringCore;

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
    	ApplicationContext context = null;
        context = new ClassPathXmlApplicationContext("com/app/config/config.xml");
        
        Amazon amazon = context.getBean("amazon", Amazon.class);
        
        System.out.println(amazon.amazonDispatchOrder(0));
       System.out.println(amazon.amazonReturnOrder(0)); 
        System.out.println(amazon.amazonTrackOrder(0));
    }
}
