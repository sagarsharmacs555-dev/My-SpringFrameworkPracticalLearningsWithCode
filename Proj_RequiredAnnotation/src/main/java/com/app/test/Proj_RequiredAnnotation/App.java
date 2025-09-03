package com.app.test.Proj_RequiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.StudentBean;

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
        
       StudentBean stu = context.getBean("studentBean", StudentBean.class);
       System.out.println(stu);
    }
}
