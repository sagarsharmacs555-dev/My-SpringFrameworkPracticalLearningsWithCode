package com.app.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImp implements StudentDao {
	
	private JdbcTemplate jdbcTemplate;
	
	private static final String  countRow = "Select Count(*) from studentDetails";
	
	public StudentDaoImp(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int countStudentRows() throws Exception {
		
		int totalNoStudents = 0;
		
		totalNoStudents = jdbcTemplate.queryForObject(countRow, Integer.class);
		
		return totalNoStudents;
	}

}
