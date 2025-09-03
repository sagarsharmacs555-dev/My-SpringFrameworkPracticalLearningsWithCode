package com.app.example.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.app.dto.StudentDto;
import com.app.example.service.StudentService;

@Controller("studentController")
public class StudentController {
	
	@Autowired
	private StudentService studentService;


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
	
	public StudentDto getStudentByIdProcess(int id)
	{
		return studentService.getStudentByIdRequest(id);
	}
	
	public List<StudentDto> getStudentByCourseName(String course1, String course2, String course3)
	{
		return studentService.getStudentsByCourseNameRequest(course1, course2, course3);
	}
	
}
