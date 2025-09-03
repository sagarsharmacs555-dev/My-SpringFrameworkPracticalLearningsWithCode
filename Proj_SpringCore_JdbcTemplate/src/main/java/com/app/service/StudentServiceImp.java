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
	public int getTotalNoOfStudents() throws Exception {
		
		int i = studentDao.getTotalNoOfStudents();
		
		return i;
	}

	@Override
	public String getStudentById(int id) throws Exception {
		
		return studentDao.getStudentNameById(id);
	}

	@Override
	public Map<String, Object> getCompleteStudentDetailById(int id) throws Exception {
		// TODO Auto-generated method stub
		return studentDao.getCompleteStudentDetailById(id);
	}

	@Override
	public List<Map<String, Object>> getCompleteStudentsDetailByCourse(String course) throws Exception {
		
		return studentDao.getCompleteStudentsDetailByCourse(course);
	}

}
