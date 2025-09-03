package com.app.test.Proj_StereotypeAnnotationsss;

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
        
        Student stu = context.getBean("stu", Student.class);
        stu.setName("SagarSharma");
        
        System.out.println(stu);
    }
}
