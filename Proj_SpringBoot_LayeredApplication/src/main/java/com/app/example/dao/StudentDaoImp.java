package com.app.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.example.entity.Entity;

@Repository("studentDao")
public class StudentDaoImp implements StudentDao {
	
	@Autowired
	private DataSource dataSource;
	
	public static final String details = "Insert into studentDetails(name,id,email,coureDetails,grade) values(?,?,?,?,?)";

	@Override
	public int saveStudent(Entity entity) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		con =dataSource.getConnection();
		
		pstmt = con.prepareStatement(details);
		
		pstmt.setString(1, entity.getName());
		pstmt.setInt(2, entity.getId());
		pstmt.setString(3, entity.getEmail());
		pstmt.setString(4, entity.getCourseDetails());
		pstmt.setString(5, entity.getGrade());
		
		int i = pstmt.executeUpdate();
		
		if(i>=1)
		{
			System.out.println("Record Inserted");
		}
		
		else
		{
			System.out.println("Record failed to Insert");
		}
		
		return i;
	}

}
