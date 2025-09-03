package com.app.test.Proj_SpringAOP_AroundAdvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.BankService;
import com.app.beans.BankService2;

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
       BankService2 bs = context.getBean("pfb",BankService2.class);
       
       bs.name();
       
       System.out.println(bs.getClass().getName());
       
    }
}
