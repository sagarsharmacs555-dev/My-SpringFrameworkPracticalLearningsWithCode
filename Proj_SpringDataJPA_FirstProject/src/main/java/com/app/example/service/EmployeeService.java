package com.app.example.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.example.dto.EmployeeDto;
import com.app.example.entity.EmployeeEntity;
import com.app.example.repo.EmployeeRepo;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public Integer registerEmployee(EmployeeDto employeeDto)
	{
		
		EmployeeEntity employeeEntity = new EmployeeEntity();
		BeanUtils.copyProperties(employeeDto, employeeEntity);
		
		EmployeeEntity saveEntity = employeeRepo.save(employeeEntity); 	
		
		return saveEntity.getId();
	}

}
