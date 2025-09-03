package com.app.dao;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.app.entity.StudentEntity;

@Repository
public class StudentDaoImp implements StudentDao {
	
	private static final String studentRecordFromId = "Select * from studentDetails where id = ?";
	
	
	
	private JdbcTemplate jdbcTemplate;
	
	public StudentDaoImp(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public StudentEntity getStudentRecord(int id) throws Exception {
		StudentEntity entity =jdbcTemplate.queryForObject(studentRecordFromId, new BeanPropertyRowMapper<StudentEntity>(StudentEntity.class) , id);
		return entity;
	}
	
	
	
	
//	@Override
//	public StudentEntity getStudentRecord(int id) throws Exception {
//		
//		StudentEntity se =jdbcTemplate.queryForObject(
//				studentRecordFromId, 
//				new  RowMapper<StudentEntity>()
//				{
//
//					@Override
//					public StudentEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
//						StudentEntity studentEntity = new StudentEntity();
//					studentEntity.setName(rs.getString(1));
//						studentEntity.setId(rs.getInt(2));
//						studentEntity.setEmail(rs.getString(3));
//						studentEntity.setCourseDetails(rs.getString(4));
//						studentEntity.setGrade(rs.getString(5));
//						
//						
//						return studentEntity;
//
//					}
//					
//				}, 
//				id);
//		
//		return se;
//	}
//	
//	private static class StudentMapper implements RowMapper<StudentEntity>
//	{
//
//		@Override
//		public StudentEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
//			
//			StudentEntity studentEntity = new StudentEntity();
//			studentEntity.setName(rs.getString(1));
//			studentEntity.setId(rs.getInt(2));
//			studentEntity.setEmail(rs.getString(3));
//			studentEntity.setCourseDetails(rs.getString(4));
	
//			studentEntity.setGrade(rs.getString(5));
//			
//			
//			return studentEntity;
//		}
//
//		
//		
//	}

}
