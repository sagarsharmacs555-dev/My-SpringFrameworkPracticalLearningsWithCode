package com.app.test.Proj_InitMethod_SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.CreditCard;
import com.app.beans.DebitCard;
import com.app.beans.Employee;
import com.app.beans.Student;
import com.app.beans.User;

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
    	
    	Employee emp = context.getBean("emp",Employee.class);
    	System.out.println(emp);
    	
    	Student stu = context.getBean("stu",Student.class);
    	System.out.println(stu);
    	
    	User user = context.getBean("user",User.class);
    	System.out.println(user);
    	
    	DebitCard debitCard = context.getBean("debitCard", DebitCard.class);
    	System.out.println(debitCard);
    	
    	CreditCard creditCard = context.getBean("creditCard", CreditCard.class);
    	System.out.println(creditCard);
    	
    	((AbstractApplicationContext)context).close();
    }
}
