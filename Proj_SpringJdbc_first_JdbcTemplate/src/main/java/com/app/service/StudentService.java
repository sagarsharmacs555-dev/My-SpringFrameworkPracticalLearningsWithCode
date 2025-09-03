package com.app.service;

import java.util.List;
import java.util.Map;

public interface StudentService {
	
	public int countTotalNoOfStundentsRequest();
	
	public String getStudentById(int id);
	public Map<String, Object> getStudentDetailsByIdRequest(int id);
	
	public List<Map<String, Object>> getStudentListByIdRequest(String courseDetails);
}
