package com.app.controller;

import java.util.List;
import java.util.Map;

import com.app.service.StudentService;

public class StudentControllerImp implements StudentController {
	
	StudentService studentService;
	
	public StudentControllerImp(StudentService studentService)
	{
		this.studentService = studentService;
	}

	@Override
	public int fetchTotalNoOfStudents() throws Exception {
		
		int i=  studentService.getTotalNoOfStudents();
		return i;
		
	}

	@Override
	public String fetchStudentNameById(int id) throws Exception {
		
		return studentService.getStudentById(id);
	}

	@Override
	public Map<String, Object> fetchCompleteStudentDetailById(int id) throws Exception {
		
		return studentService.getCompleteStudentDetailById(id);
	}

	@Override
	public List<Map<String, Object>> fetchCompleteStudentDetailByCourse(String course) throws Exception {
		
		return studentService.getCompleteStudentsDetailByCourse(course);
	}

}
