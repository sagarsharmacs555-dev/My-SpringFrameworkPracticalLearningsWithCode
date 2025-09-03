package com.app.test.Proj_SpringJdbc_first_JdbcTemplate;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.controller.StudentController;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = null;
        
        context = new ClassPathXmlApplicationContext("com/app/config/config.xml");
        
       StudentController controller = context.getBean("studentController", StudentController.class);
       
       int totalNoOfStudents = controller.countRequest();
       System.out.println("The total No. of Students is " + totalNoOfStudents);
       System.out.println("======================");
       
      String name = controller.countStudentRequestById( 7247827);
      System.out.println("The name of the Student is " + name);
      
       Map<String, Object> completeStudentDetail = controller.getStudentDetailsByIdProcess(511341314 );
       System.out.println("----------------------");
       
       System.out.println("The details of the student is " + completeStudentDetail);
       
        List<Map<String, Object>> studentList =  controller.getStudentListByIdProcess("java");
        System.out.println("_-----------------------");
        System.out.println("The List of student by course detail is " + studentList);
    }
}
