package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        
//        Student student = context.getBean("student", Student.class);
//        
////        //System.out.println(student);
//        student.setsName("SagarSharma");
//        student.seteMailId("sagarsharmacs555@gmail.com");
//        System.out.println(student);
//    
    }
}
