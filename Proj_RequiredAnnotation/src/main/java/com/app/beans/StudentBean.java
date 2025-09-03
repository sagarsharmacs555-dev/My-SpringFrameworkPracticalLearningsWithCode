package com.app.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Required;

public class StudentBean {
	
	public String name;
	public String email;
	public Date date;
	
	public StudentBean(String name)
	{
		this.name = name;
	}
	
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Required // don't use required as it depreceated in 5.1x version instead use constructor injection
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "StudentBean [name=" + name + ", email=" + email + ", date=" + date + "]";
	}
	
	

}
