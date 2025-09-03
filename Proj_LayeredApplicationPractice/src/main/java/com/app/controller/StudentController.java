package com.app.controller;

import com.app.dto.StudentDto;
import com.app.service.StudentService;
import com.app.vo.StudentVo;

public class StudentController {
	
	public StudentService studentService;
	
	public StudentController(StudentService studentService)
	{
		this.studentService = studentService;
	}
	
	public int registerStudentRequest(StudentVo studentVo) throws Exception
	{
		StudentDto studentDto = new StudentDto();
		
		studentDto.setName(studentVo.getName());
		studentDto.setId(Integer.parseInt(studentVo.getId()));
		studentDto.setEmail(studentVo.getEmail());
		studentDto.setCourseDetails(studentVo.getCourseDetails());
		studentDto.setGrade(studentVo.getGrade());
		
		int i = studentService.registerStudent(studentDto);
		return i;
		
		
		}

}
