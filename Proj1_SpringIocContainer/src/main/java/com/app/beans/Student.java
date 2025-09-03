package com.app.beans;

public class Student {
	
	private String name;
	private String address;
	private int id;
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
	public Student()
	{
		System.out.println("Student conss...");
	}
	
	public void showDetails()
	{
		System.out.println("StudentDetails");
	}
	
	public void showValues()
	{
		
		System.out.println("Name: " + name + ", Adress: " + address + ", Id: " + id);
	}

}
