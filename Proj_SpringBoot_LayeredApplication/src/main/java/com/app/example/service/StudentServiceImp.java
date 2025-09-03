package com.app.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.app.example.dao.StudentDao;
import com.app.example.dto.StudentDto;
import com.app.example.entity.Entity;

@Service("studentService")
public class StudentServiceImp implements StudentService {
	
	@Autowired
	@Qualifier("studentDao")
	private StudentDao studentDao;

	@Override
	public int getStudentDetails(StudentDto dto) throws Exception {
		
		Entity entity = new Entity();
		entity.setName(dto.getName());
		entity.setId(dto.getId());
		entity.setEmail(dto.getEmail());
		entity.setCourseDetails(dto.getCourseDetails());
		entity.setGrade(dto.getGrade());
		
		int i = studentDao.saveStudent(entity);
		
		return i;
	}

}
