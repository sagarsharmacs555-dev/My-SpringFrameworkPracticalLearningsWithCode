package com.app.beans;

import java.util.Date;



public class StudentDetails {
	
	public String name;
	public String emailId;
	public Date dob;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return "StudentDetails [name=" + name + ", emailId=" + emailId + ", dob=" + dob + "]";
	}
	
	

}
