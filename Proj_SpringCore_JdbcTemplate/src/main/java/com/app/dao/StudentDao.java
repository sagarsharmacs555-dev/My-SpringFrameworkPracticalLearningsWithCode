package com.app.dao;

import java.util.List;
import java.util.Map;

public interface StudentDao {
	
	public int getTotalNoOfStudents() throws Exception;
	public String getStudentNameById(int id) throws Exception;
	public Map<String, Object> getCompleteStudentDetailById(int id) throws Exception;
	public List<Map<String,Object>> getCompleteStudentsDetailByCourse(String course) throws Exception;

}
