package com.app.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.app.example.dto.StudentDto;
import com.app.example.service.StudentService;
import com.app.example.vo.StudentVo;

@Controller("studentController")
public class StudentControllerImp implements StudentController {
	
	@Autowired
	@Qualifier("studentService")
	private StudentService studentService;

	@Override
	public int getStudentRequest(StudentVo studentVo) throws Exception {
		
		StudentDto studentDto = new StudentDto();
		
		studentDto.setName(studentVo.getName());
		studentDto.setId(Integer.parseInt(studentVo.getId()));
		studentDto.setEmail(studentVo.getEmail());
		studentDto.setCourseDetails(studentVo.getCourseDetails());
		studentDto.setGrade(studentVo.getGrade());
		
		int i =studentService.getStudentDetails(studentDto);
		
		return i;
	}

}
