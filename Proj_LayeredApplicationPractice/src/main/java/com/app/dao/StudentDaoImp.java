package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;



import com.app.entity.Entity;

public final class StudentDaoImp implements StudentDao {
	
	public static final String insertStudent = "Insert into studentDetails(name,id,email,coureDetails,grade) values (?,?,?,?,?)";

	private DataSource dataSource;
	
	public StudentDaoImp(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}
	
	
	
	@Override
	public int saveStudent(Entity entity) throws Exception {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		con = dataSource.getConnection();
		
		pstmt = con.prepareStatement(insertStudent);
		
		pstmt.setString(1, entity.getName());
		pstmt.setInt(2, entity.getId());
		pstmt.setString(3, entity.getEmail());
		pstmt.setString(4, entity.getCourseDetails());
		pstmt.setString(5, entity.getGrade());
		
		int i = pstmt.executeUpdate();
		
		if(i>=1)
		{
			System.out.println("Record Inserted Successfully");
		}
		
		else
		{
			System.out.println("failed");
		}
		
		return i;
	}

}
