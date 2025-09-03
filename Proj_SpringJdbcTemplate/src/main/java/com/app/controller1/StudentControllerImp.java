package com.app.controller1;

import com.app.service.StudentService;

public class StudentControllerImp implements StudentController {
	
	private StudentService studentService;
	
	public StudentControllerImp(StudentService studentService)
	{
		this.studentService = studentService;
	}

	@Override
	public int fetchTotalNoOfStudents() throws Exception {
		
		return studentService.getTotalNoOfStudents();
	}

}
