package com.app.beans;

import java.util.Properties;

public class Employee {
	
	private Properties employeeName;

	public void setEmployeeName(Properties employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + "]";
	}
	
	

}
