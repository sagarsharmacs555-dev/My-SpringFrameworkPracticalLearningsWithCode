package com.app.beans;

import java.util.Date;

public class User {
	
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
		return "User [name=" + name + ", date=" + date + "]";
	}
	
	public void myinit()
	{
		System.out.println("init method invoked");
	}
	
	public void mydestroy()
	{
		System.out.println("destroy method invoked");
	}
	
	
	

}
