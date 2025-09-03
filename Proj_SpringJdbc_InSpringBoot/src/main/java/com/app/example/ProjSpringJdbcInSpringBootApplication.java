package com.app.example;

import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.app.dto.StudentDto;
import com.app.example.controller.StudentController;

@SpringBootApplication
public class ProjSpringJdbcInSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = null;
		
		context = SpringApplication.run(ProjSpringJdbcInSpringBootApplication.class, args);
		
			StudentController controller =context.getBean("studentController", StudentController.class);
	       
	       int totalNoOfStudents = controller.countRequest();
	       System.out.println("The total No. of Students is " + totalNoOfStudents);
	       System.out.println("======================");
	       
	      String name = controller.countStudentRequestById(  534343);
	      System.out.println("The name of the Student is " + name);
	      
	       Map<String, Object> completeStudentDetail = controller.getStudentDetailsByIdProcess(511341314 );
	       System.out.println("----------------------");
	       
	       System.out.println("The details of the student is " + completeStudentDetail);
	       
	        List<Map<String, Object>> studentList =  controller.getStudentListByIdProcess("sharmaMedicos");
	        System.out.println("_-----------------------");
	        System.out.println("The List of student by course detail is " + studentList);
	        
	        System.out.println("--------------------------");
	        
	        StudentDto dto = controller.getStudentByIdProcess(511341314);
	        System.out.println(dto);
	        
	        System.out.println("-------------------------------------");
	        List<StudentDto> studentDtoList = controller.getStudentByCourseName("class4th", "SpringBootDeveloper", "springboot");
	        System.out.println(studentDtoList);
	}

}
