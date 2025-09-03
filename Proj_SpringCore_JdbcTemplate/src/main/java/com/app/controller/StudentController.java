package com.app.controller;

import java.util.List;
import java.util.Map;

public interface StudentController {
	
	public int fetchTotalNoOfStudents() throws Exception;
	public String fetchStudentNameById(int id) throws Exception;
	public Map<String,Object> fetchCompleteStudentDetailById(int id) throws Exception;
	public List<Map<String, Object>> fetchCompleteStudentDetailByCourse(String course) throws Exception;
}
