package com.app.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.app.entity.StudentEntity;

@Repository("studentDao")
public class StudentDaoImp implements StudentDao {
	
	private static final String countStudents = "select count(*) from studentdetails";
	private static final String countStudentById = "select name from studentdetails where id = ?";
	private static final String getStudentDetail = "select name,id,email,coureDetails,grade from studentdetails where id = ?";
	private static final String getStudentList = "select name,id,email,grade from studentdetails where coureDetails = ?";
	private static final String getStudentListByCourseName = "select name,id,email,coureDetails,grade from studentdetails where coureDetails IN(?,?,?)";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
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


	@Override
	public StudentEntity getStudentById(int id) {
		
		
		return jdbcTemplate.queryForObject(getStudentDetail, new BeanPropertyRowMapper<StudentEntity>(StudentEntity.class) , id);
	}
//	public StudentEntity getStudentById(int id) {
//		
//		
//		return jdbcTemplate.queryForObject(getStudentDetail, 
//				(rs, rowNum)->
//		{
//					StudentEntity studentEntity = new StudentEntity();
//					studentEntity.setName(rs.getString(1));
//					studentEntity.setId(rs.getInt(2));
//					studentEntity.setEmail(rs.getString(3));
//					studentEntity.setCoureDetails(rs.getString(4));
//					studentEntity.setGrade(rs.getString(5));
//
//					return studentEntity;
//		}
//					
//				, id);
//	}


	@Override
	public List<StudentEntity> getStudentByCourseDetails(String course1, String course2, String course3) {
		
		BeanPropertyRowMapper<StudentEntity> rowMapper = new BeanPropertyRowMapper<StudentEntity>(StudentEntity.class);
			
		
		
		return jdbcTemplate.query(getStudentListByCourseName, 
//				(rs)->{
//					List<StudentEntity> listStudentEntity = new ArrayList<StudentEntity>();
//					
//					while(rs.next())
//					{
//						StudentEntity studentEntity = new StudentEntity();
//						
//						studentEntity.setName(rs.getString(1));
//						studentEntity.setId(rs.getInt(2));
//						studentEntity.setEmail(rs.getString(3));
//						studentEntity.setCoureDetails(rs.getString(4));
//						studentEntity.setGrade(rs.getString(5));
//						
//						listStudentEntity.add(studentEntity);
//					}
//					
//					return listStudentEntity;
//				}
//				new ResultSetExtractor<List<StudentEntity>>() {
//			
//			@Override
//			public List<StudentEntity> extractData(ResultSet rs) throws SQLException, DataAccessException {
//			List<StudentEntity> listStudentEntity = new ArrayList<StudentEntity>();
//			
//			while(rs.next())
//			{
//				StudentEntity studentEntity = new StudentEntity();
//				
//				studentEntity.setName(rs.getString(1));
//				studentEntity.setId(rs.getInt(2));
//				studentEntity.setEmail(rs.getString(3));
//				studentEntity.setCoureDetails(rs.getString(4));
//				studentEntity.setGrade(rs.getString(5));
//				
//				listStudentEntity.add(studentEntity);
//			}
//			
//			return listStudentEntity;
//		}}
		
				new RowMapperResultSetExtractor<StudentEntity>(rowMapper)
		, course1,course2,course3);
		
	}
	
	
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
//			studentEntity.setCoureDetails(rs.getString(4));
//			studentEntity.setGrade(rs.getString(5));
//			
//			return studentEntity;
//		}
//	}
	
//	private static class StudentExtractor implements ResultSetExtractor<List<StudentEntity>>
//	{
//
//		@Override
//		public List<StudentEntity> extractData(ResultSet rs) throws SQLException, DataAccessException {
//			
//			List<StudentEntity> listStudentEntity = new ArrayList<StudentEntity>();
//			
//			while(rs.next())
//			{
//				StudentEntity studentEntity = new StudentEntity();
//				
//				studentEntity.setName(rs.getString(1));
//				studentEntity.setId(rs.getInt(2));
//				studentEntity.setEmail(rs.getString(3));
//				studentEntity.setCoureDetails(rs.getString(4));
//				studentEntity.setGrade(rs.getString(5));
//				
//				listStudentEntity.add(studentEntity);
//			}
//			
//			return listStudentEntity;
//		}
//		
		
		
		
	//}
	
}
