package com.app.test.Proj_LayeredApplication_RowMapper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.controller.StudentController;
import com.app.dto.StudentDto;

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
        
       StudentController studentController = context.getBean("studentController", StudentController.class);
       try {
		StudentDto dto = studentController.fetchStudentById(    7247827 );
		System.out.println(dto);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
}
