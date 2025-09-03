package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.StudentDao;
import com.app.dto.StudentDto;
import com.app.entity.StudentEntity;

@Service
public class StudentServiceImp implements StudentService {
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public StudentDto getStudentDetailById(int id) throws Exception {
		
		StudentDto studentDto = new StudentDto();
	
		StudentEntity studentEntity = studentDao.getStudentRecord(id);
		
		studentDto.setName(studentEntity.getName());
		studentDto.setId(studentEntity.getId());
		studentDto.setEmail(studentEntity.getEmail());
		studentDto.setCourseDetails(studentEntity.getCourseDetails());
		studentDto.setGrade(studentEntity.getGrade());
		
		return studentDto;
		
		
		
		
	}

}
