package com.app.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("23")
	private String age;
	
	@Value("${stu.desgn}")
	private String designation;

	@Override
	public String toString() {
		return "Student [age=" + age + ", designation=" + designation + "]";
	}
	
	

}
