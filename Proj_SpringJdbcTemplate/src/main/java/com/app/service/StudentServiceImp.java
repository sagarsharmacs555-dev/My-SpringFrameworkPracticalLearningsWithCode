package com.app.service;

import com.app.dao.StudentDao;

public class StudentServiceImp implements StudentService {
	
	private StudentDao studentDao;
	
	public StudentServiceImp(StudentDao studentDao)
	{
		this.studentDao = studentDao;
	}

	@Override
	public int getTotalNoOfStudents() throws Exception {
		
		return studentDao.countStudentRows();
	}

}
