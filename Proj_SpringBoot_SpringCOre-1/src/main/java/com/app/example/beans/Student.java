package com.app.example.beans;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Student {
	
	public Student()
	{
		System.out.println("Student().Student");
	}

	@Override
	public String toString() {
		return "This is Student";
				
	}
	
	

}
