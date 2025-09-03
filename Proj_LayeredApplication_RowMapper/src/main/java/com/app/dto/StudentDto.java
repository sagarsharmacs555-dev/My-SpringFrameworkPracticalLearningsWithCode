package com.app.dto;

public class StudentDto {
	
	private String name;
	private Integer id;
	private String email;
	private String courseDetails;
	private String grade;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourseDetails() {
		return courseDetails;
	}
	public void setCourseDetails(String courseDetails) {
		this.courseDetails = courseDetails;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "StudentDto [name=" + name + ", id=" + id + ", email=" + email + ", courseDetails=" + courseDetails
				+ ", grade=" + grade + "]";
	}
	
	

}
