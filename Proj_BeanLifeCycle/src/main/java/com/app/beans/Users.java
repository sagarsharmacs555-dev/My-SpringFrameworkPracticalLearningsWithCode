package com.app.beans;

import java.util.Date;

public class Users {
	
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
		return "Users [name=" + name + ", date=" + date + "]";
	}


	public void initialize()
	{
		System.out.println("init method invoked");
		if(date==null)
		{
			throw new IllegalArgumentException("Invalid input");
		}
	}
	
	public void destroy()
	{
		System.out.println("destroy method invoked");
		name = null;
		date = null;
		
	}
	

}
