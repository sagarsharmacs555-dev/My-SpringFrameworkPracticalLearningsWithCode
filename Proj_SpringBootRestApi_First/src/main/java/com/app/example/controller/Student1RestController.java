package com.app.example.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Address;
import com.app.entity.StudentEntity;

@RestController
@RequestMapping("/student")
public class Student1RestController {
	
	@GetMapping("/get-name")
	public StudentEntity getName()
	{
		return new StudentEntity(1001, "SagarSharma", "SagarSharmacs555@gmail.com","bhanu765", new Address("8", "Near National Public School", 1900001));
	}
	
	@GetMapping("/get-list")
	public List<String> getStudentList()
	{
		return Arrays.asList("Sagar", "Ram", "Himanshu", "Somya");
	}
	
	@GetMapping("/get-set")
	public Set<String> getStudentSet()
	{
		return Set.of("Ankit", "Batishta", "Kutta");
	}
	
	@GetMapping("/get-student-list")
	public List<StudentEntity> getStudentEntityList()
	{
		return Arrays.asList(new StudentEntity(1002, "NavneetVerma", "NavneetVerma123@gmail.com", "bhanu7321", new Address("7", "AshaGasAgency", 180001)),
				new StudentEntity(1003, "AshishVerma", "AshishVerma123@gmail.com", "bhanu7321", new Address("7", "AshaGasAgency", 1280001)),
				new StudentEntity(1004, "PranavSharma", "PranavVerma123@gmail.com", "bhanu7321", new Address("9", "AshaGasAgency", 1380001)),
				new StudentEntity(1004, "HimanshuPrajapati", "HimanshuVerma123@gmail.com", "bhanu7321", new Address("10", "AshaGasAgency", 1580001))
				);
	}
	
	@PostMapping("/getStudentRequest")
	public String getStudentRequest(@RequestBody StudentEntity studentEntity)
	{
		return "The Student Entity is " + studentEntity;
	}
}
