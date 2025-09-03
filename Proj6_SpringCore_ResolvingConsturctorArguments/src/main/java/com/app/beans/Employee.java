package com.app.beans;

public class Employee {
	
	private String empName;
	private int id;
	private float salary;
	
	public Employee(String empName, int id, float salary)
	{
		this.empName = empName;
		this.id = id;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", id=" + id + ", salary=" + salary + "]";
	}

}
