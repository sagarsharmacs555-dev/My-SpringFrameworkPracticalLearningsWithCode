package com.app.dto;

public class StudentDto {
	
	private String name;
	private int id;
	private String email;
	private String coureDetails;
	private String grade;
	
	
	
	@Override
	public String toString() {
		return "StudentDto [name=" + name + ", id=" + id + ", email=" + email + ", coureDetails=" + coureDetails
				+ ", grade=" + grade + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCoureDetails() {
		return coureDetails;
	}
	public void setCoureDetails(String coureDetails) {
		this.coureDetails = coureDetails;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	

}
