package com.app.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Repository(value = "student")
@Lazy(true)
public class Student {
	
	public String sName;
	public String eMailId;
	
	public Student()
	{
		System.out.println("Studetn().student");
	}
	
	
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	@Override
	public String toString() {
		return "Student [sName=" + sName + ", eMailId=" + eMailId + "]";
	}
	
	public void seteMailId(String eMailId) {
		this.eMailId = eMailId;
	}
	

}
