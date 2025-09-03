package com.app.dao;

import com.app.entity.StudentEntity;

public interface StudentDao {

	public StudentEntity getStudentRecord(int id) throws Exception;
}
