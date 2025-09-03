package com.app.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.app.example.controller.StudentController;
import com.app.example.vo.StudentVo;

@SpringBootApplication
public class ProjSpringBootLayeredApplication {

	public static void main(String[] args) {
		StudentVo studentVo = new StudentVo();
		studentVo.setName("kushal");
		studentVo.setId("112321");
		studentVo.setEmail("kushal232@gmail.com");
		studentVo.setCourseDetails("SpringbootDeveloper");
		studentVo.setGrade("A");
		
		
		ApplicationContext context = null;
		
		context = SpringApplication.run(ProjSpringBootLayeredApplication.class, args);
		
		StudentController controller = context.getBean("studentController", StudentController.class);
		
		try {
			controller.getStudentRequest(studentVo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
