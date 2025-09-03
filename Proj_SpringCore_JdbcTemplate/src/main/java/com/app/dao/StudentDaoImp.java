package com.app.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImp implements StudentDao {
	
	public static final String countStudents = "Select count(*) from studentDetails";
	public static final String countStudentById = "Select name from studentDetails where id = ?";
	public static final String getCompleteStudentDetail = "Select name,id,email,coureDetails,grade from studentDetails where id = ?";
	public static final String getCompleteStudentsDetail = "Select name,id,email,coureDetails,grade from studentDetails where coureDetails = ?";
	
	private JdbcTemplate jdbcTemplate;
	
	public StudentDaoImp(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int getTotalNoOfStudents() throws Exception {
		
		int totalNoOfStudents = 0;
		totalNoOfStudents = jdbcTemplate.queryForObject(countStudents, Integer.class);
		return totalNoOfStudents;
	}

	@Override
	public String getStudentNameById(int id) throws Exception {
		
		
		return jdbcTemplate.queryForObject(countStudentById, String.class, id);
	}

	@Override
	public Map<String,Object> getCompleteStudentDetailById(int id) throws Exception {
		
		
		return  jdbcTemplate.queryForMap(getCompleteStudentDetail, id);
	}

	@Override
	public List<Map<String, Object>> getCompleteStudentsDetailByCourse(String course) throws Exception {
		
		return jdbcTemplate.queryForList(getCompleteStudentsDetail, course);
	}

}
