package com.app.test.Proj_SingletonAndPrototype_SpringCore;

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
        ApplicationContext context  = null;
        
        context = new ClassPathXmlApplicationContext("com/app/config/config.xml");
        
        Student stu1 = context.getBean("s1", Student.class);
        System.out.println(stu1.hashCode());
        Student stu2 = context.getBean("s1", Student.class);
        System.out.println(stu2.hashCode());
        Student stu3 = context.getBean("s1", Student.class);
        System.out.println(stu3.hashCode());
    }
}
