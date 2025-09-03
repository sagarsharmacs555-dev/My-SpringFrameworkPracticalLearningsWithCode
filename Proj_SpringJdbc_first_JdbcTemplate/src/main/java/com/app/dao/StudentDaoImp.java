package com.app.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImp implements StudentDao {
	
	private static final String countStudents = "select count(*) from studentdetails";
	private static final String countStudentById = "select name from studentdetails where id = ?";
	private static final String getStudentDetail = "select name,email,coureDetails,grade from studentdetails where id = ?";
	private static final String getStudentList = "select name,id,email,grade from studentdetails where coureDetails = ?";
	
	private JdbcTemplate jdbcTemplate;
	
	public StudentDaoImp(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int countTotalNoOfStudents() {
		
		return jdbcTemplate.queryForObject(countStudents, Integer.class);
		
		
	}


	@Override
	public String countStudentById(int id) {
		// TODO Auto-generated method stub
		return  jdbcTemplate.queryForObject(countStudentById, String.class,id);
	}

	@Override
	public Map<String, Object> getStudentDetailsById(int id) {
		
		 return jdbcTemplate.queryForMap(getStudentDetail, id);
	}

	@Override
	public List<Map<String, Object>> getStudentListById(String courseDetail) {
		
		
		
		return jdbcTemplate.queryForList(getStudentList, courseDetail);
	}
}
