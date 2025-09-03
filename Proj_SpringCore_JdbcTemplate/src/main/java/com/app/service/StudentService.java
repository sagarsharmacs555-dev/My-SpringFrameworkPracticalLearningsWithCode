package com.app.service;

import java.util.List;
import java.util.Map;

public interface StudentService {
	
	public int getTotalNoOfStudents() throws Exception;
	public String getStudentById(int id) throws Exception;
	public Map<String, Object> getCompleteStudentDetailById(int id) throws Exception;
	public List<Map<String, Object>> getCompleteStudentsDetailByCourse(String course) throws Exception;

}
