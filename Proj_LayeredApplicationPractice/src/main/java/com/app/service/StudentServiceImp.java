package com.app.service;

import com.app.dao.StudentDao;
import com.app.dto.StudentDto;
import com.app.entity.Entity;

public class StudentServiceImp implements StudentService {
	
	StudentDao studentDao;
	
	public StudentServiceImp(StudentDao studentDao)
	{
		this.studentDao = studentDao;
	}

	@Override
	public int registerStudent(StudentDto studentDto) throws Exception {
		
		Entity entity = new Entity();
		
		entity.setName(studentDto.getName());
		entity.setCourseDetails(studentDto.getCourseDetails());
		entity.setEmail(studentDto.getEmail());
		entity.setGrade(studentDto.getGrade());
		entity.setId(studentDto.getId());
		
		int i = studentDao.saveStudent(entity);
		
	
		
		
		return i;
	}

}
