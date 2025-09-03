package com.app.test.Proj_MethodReplacer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.BankLoanInterestCalculator_SI;

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
        BankLoanInterestCalculator_SI si = context.getBean("si",BankLoanInterestCalculator_SI.class);
        float si1 = si.loanCalSi(123000, 2, 1);
        System.out.println(si1);
    }
}
