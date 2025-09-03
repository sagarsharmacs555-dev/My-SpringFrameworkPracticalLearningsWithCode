package com.app.example.dao;

import java.util.List;
import java.util.Map;

import com.app.entity.StudentEntity;

public interface StudentDao {
	
	public int countTotalNoOfStudents();
	
	public String countStudentById(int id);
	
	public Map<String, Object> getStudentDetailsById(int id);
	
	public List<Map<String, Object>> getStudentListById(String courseDetails);
	
	public StudentEntity getStudentById(int id) ;
	
	public List<StudentEntity> getStudentByCourseDetails(String course1,String course2, String course3);
	
}
