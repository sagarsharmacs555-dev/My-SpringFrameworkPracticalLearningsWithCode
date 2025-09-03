package com.app.beans;

import java.util.Date;

public class Employee {
	
	public String name;
	public Date date;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", date=" + date + "]";
	}
	
	public void init()
	{
		System.out.println("init method invoked");
	}
	
	public void destroy()
	{
		System.out.println("destroy method invoked");
	}
	
	
	

}
