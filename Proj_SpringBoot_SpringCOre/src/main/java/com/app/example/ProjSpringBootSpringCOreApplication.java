package com.app.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProjSpringBootSpringCOreApplication {

	public static void main(String[] args) {
		ApplicationContext context = null;
		
		context = SpringApplication.run(ProjSpringBootSpringCOreApplication.class, args);
		System.out.println("Welcome to springboot!!!!");
		
		System.out.println(context.getClass().getName());
		Student stu = context.getBean("student",Student.class);
		System.out.println(stu);
	}

}
