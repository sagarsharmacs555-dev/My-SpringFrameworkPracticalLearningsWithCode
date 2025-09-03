package com.app.dao;

import java.util.List;
import java.util.Map;

public interface StudentDao {
	
	public int countTotalNoOfStudents();
	
	public String countStudentById(int id);
	
	public Map<String, Object> getStudentDetailsById(int id);
	
	public List<Map<String, Object>> getStudentListById(String courseDetails);
}
