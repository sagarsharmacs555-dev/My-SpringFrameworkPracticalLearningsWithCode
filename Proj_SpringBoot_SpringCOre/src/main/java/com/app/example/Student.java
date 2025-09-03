package com.app.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class Student {
	
	public Student()
	{
		System.out.println("Student().student");
	}

}
