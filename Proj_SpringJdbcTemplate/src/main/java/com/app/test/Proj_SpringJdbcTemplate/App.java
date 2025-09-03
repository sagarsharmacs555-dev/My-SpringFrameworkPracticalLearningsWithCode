package com.app.test.Proj_SpringJdbcTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.controller1.StudentController;

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
       
       StudentController controller = context.getBean("studentController", StudentController.class);
       
       try {
		int i = controller.fetchTotalNoOfStudents();
		System.out.println("The total No. of record is " + i);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
}
