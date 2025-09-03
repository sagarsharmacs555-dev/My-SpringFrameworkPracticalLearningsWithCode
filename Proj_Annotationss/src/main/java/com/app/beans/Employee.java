package com.app.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy(false)
@Scope("prototype")   // you can take singleton or prototype
public class Employee {
	
	public Employee()
	{
		System.out.println("Employee.Employee()");
	}

}
