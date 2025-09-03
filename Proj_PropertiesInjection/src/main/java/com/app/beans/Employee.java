package com.app.beans;

import java.util.Properties;

public class Employee {
	
	private Properties name;

	public void setName(Properties name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
	

}
