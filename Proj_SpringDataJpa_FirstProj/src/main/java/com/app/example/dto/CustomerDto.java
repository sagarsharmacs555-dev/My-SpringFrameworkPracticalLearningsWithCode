package com.app.example.dto;

import jakarta.persistence.Column;


public class CustomerDto {

    private Integer id;
	private String name;
	private String email;
	private Float salary;
	
	
	
	@Override
	public String toString() {
		return "CustomerDto [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}

	public CustomerDto()
	{}
	
	public CustomerDto(Integer id, String name, String email, Float salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	
	
}
