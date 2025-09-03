package com.app.service;

import com.app.dto.StudentDto;

public interface StudentService {
	
	public StudentDto getStudentDetailById(int id) throws Exception;

}
