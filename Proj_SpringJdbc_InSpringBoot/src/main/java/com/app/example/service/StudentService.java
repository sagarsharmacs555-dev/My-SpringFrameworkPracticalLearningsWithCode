package com.app.example.service;

import java.util.List;
import java.util.Map;

import com.app.dto.StudentDto;

public interface StudentService {
	
	public int countTotalNoOfStundentsRequest();
	
	public String getStudentById(int id);
	public Map<String, Object> getStudentDetailsByIdRequest(int id);
	
	public List<Map<String, Object>> getStudentListByIdRequest(String courseDetails);
	public StudentDto getStudentByIdRequest(int id);
	
	public List<StudentDto> getStudentsByCourseNameRequest(String course1, String course2, String course3);
	
}
