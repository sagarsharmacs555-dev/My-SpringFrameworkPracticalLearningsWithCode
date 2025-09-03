package com.app.test.Proj_SpringCore_JdbcTemplate;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.controller.StudentController;

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
		int i = studentController.fetchTotalNoOfStudents();
		String j =studentController.fetchStudentNameById( 511341314 );
		Map z = studentController.fetchCompleteStudentDetailById(511341314 );
		List a = studentController.fetchCompleteStudentDetailByCourse("java");
		System.out.println("------------------------");
		System.out.println("The Total No fo Students: " + i);
		System.out.println("--------------------------");
		System.out.println("The Student Name : " + j);
		System.out.println("--------------------");
		System.out.println("The Complete Detail is " + z);
		System.out.println("The Complete Detail of Student by course name " + a);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
}
