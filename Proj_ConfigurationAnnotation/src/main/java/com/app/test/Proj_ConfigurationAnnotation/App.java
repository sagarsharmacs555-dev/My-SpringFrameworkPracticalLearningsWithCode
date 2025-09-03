package com.app.test.Proj_ConfigurationAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.beans.Holiday;
import com.app.config.Date1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = null;
        
        context = new AnnotationConfigApplicationContext(Date1.class);
        
        Holiday holi =context.getBean("holiday", Holiday.class);
        holi.checkHoliday();
    }
}
