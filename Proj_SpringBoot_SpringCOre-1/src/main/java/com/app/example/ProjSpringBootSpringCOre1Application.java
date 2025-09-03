package com.app.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.app.example.beans.Student;

@SpringBootApplication
public class ProjSpringBootSpringCOre1Application {

	public static void main(String[] args) {
		ApplicationContext context = null;
		
		
		context = SpringApplication.run(ProjSpringBootSpringCOre1Application.class, args);
		System.out.println(context.getClass().getName());
		
		System.out.println("welcome to SpringBoot");
		
		Student stu =context.getBean("student", Student.class);
		System.out.println(stu);
	}

}
