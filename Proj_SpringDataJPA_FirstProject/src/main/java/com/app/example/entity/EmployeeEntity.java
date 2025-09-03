package com.app.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employeeRecord")
public class EmployeeEntity {
	
	@Id
	@Column(name = "eid")
	private Integer id;
	
	@Column(name = "ename")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "esalary")
	private Float salary;

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
