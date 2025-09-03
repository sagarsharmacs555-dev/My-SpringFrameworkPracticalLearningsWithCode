package com.app.test.Proj_Aspectajop_SpringTransaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.service.BankService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = null;
        context = new ClassPathXmlApplicationContext("com/app/config/ApplicationContext.xml");
        
        BankService bs =context.getBean("bankService",BankService.class);
        
        try {
			String transfer = bs.transferMonney(123456789, 123456788, 500.0f);
			System.out.println(transfer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
}
