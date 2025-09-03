package com.app.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.app.dto.StudentDto;
import com.app.entity.StudentEntity;
import com.app.example.dao.StudentDao;

@Service("studentService")
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	
	@Override
	public int countTotalNoOfStundentsRequest() {
		
		return studentDao.countTotalNoOfStudents();
	}

	@Override
	public String getStudentById(int id) {
			
		return studentDao.countStudentById(id);
	}

	@Override
	public Map<String, Object> getStudentDetailsByIdRequest(int id) {
			
		return studentDao.getStudentDetailsById(id);
	}

	@Override
	public List<Map<String, Object>> getStudentListByIdRequest(String courseDetails) {
		// TODO Auto-generated method stub
		return studentDao.getStudentListById(courseDetails);
	}

	@Override
	public StudentDto getStudentByIdRequest(int id) {
		
		StudentEntity studentEntity = studentDao.getStudentById(id);
		
		StudentDto studentDto = new StudentDto();
		BeanUtils.copyProperties(studentEntity, studentDto);
		
		return studentDto;
	}

	@Override
	public List<StudentDto> getStudentsByCourseNameRequest(String course1, String course2, String course3) {
		
		List<StudentDto> studentDtoList = new ArrayList();
		List<StudentEntity> studentEntity = studentDao.getStudentByCourseDetails(course1, course2, course3);
		
		for(StudentEntity s1:studentEntity)
		{
			StudentDto studentDto = new StudentDto();
			BeanUtils.copyProperties(s1, studentDto);
			studentDtoList.add(studentDto);
		}
		
		return studentDtoList;
	}
	
	

}
