package com.app.controller;

import java.util.List;
import java.util.Map;

import com.app.service.StudentService;

public class StudentController {
	
	private StudentService studentService;
	
	public StudentController(StudentService studentService)
	{
		this.studentService = studentService;
	}

	public int countRequest()
	{
		return studentService.countTotalNoOfStundentsRequest();
	}
	
	public String countStudentRequestById(int id)
	{
		return studentService.getStudentById(id);
	}
	
	public Map<String, Object> getStudentDetailsByIdProcess(int id)
	{
		return studentService.getStudentDetailsByIdRequest(id);
	}
	
	public List<Map<String, Object>> getStudentListByIdProcess(String courseDetails)
	{
		return studentService.getStudentListByIdRequest(courseDetails);
	}
	
}
