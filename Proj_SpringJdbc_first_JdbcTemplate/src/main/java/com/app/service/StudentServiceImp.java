package com.app.service;

import java.util.List;
import java.util.Map;

import com.app.dao.StudentDao;

public class StudentServiceImp implements StudentService {

	private StudentDao studentDao;
	
	public StudentServiceImp(StudentDao studentDao)
	{
		this.studentDao = studentDao;
	}
	
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
	
	

}
