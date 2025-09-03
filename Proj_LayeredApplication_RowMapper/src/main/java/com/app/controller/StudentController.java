package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.app.dto.StudentDto;
import com.app.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	public StudentDto fetchStudentById(int id) throws Exception {
		
		
		return studentService.getStudentDetailById(id);
	}
	{
		
	}
	

}
