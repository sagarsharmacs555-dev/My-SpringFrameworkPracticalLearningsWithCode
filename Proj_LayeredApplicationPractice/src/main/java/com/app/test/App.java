package com.app.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.controller.StudentController;
import com.app.vo.StudentVo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter your Name");
    	String name = s.next();
    	System.out.println("Enter your EmailId");
    	String email = s.next();
    	System.out.println("Enter course Details");
    	String courseDetails= s.next();
    	System.out.println("Enter Grade");
    	String grade = s.next();
    	System.out.println("Enter Id");
    	String id = s.next();
    	
        ApplicationContext context  = null;
        context = new ClassPathXmlApplicationContext("com/app/config/config.xml");
        StudentVo studentVo = new StudentVo();
        studentVo.setCourseDetails(courseDetails);
        studentVo.setEmail(email);
        studentVo.setName(name);
        studentVo.setGrade(grade);
        studentVo.setId(id);
        
        StudentController studentController = context.getBean("studentController", StudentController.class);
        
        try {
			studentController.registerStudentRequest(studentVo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
