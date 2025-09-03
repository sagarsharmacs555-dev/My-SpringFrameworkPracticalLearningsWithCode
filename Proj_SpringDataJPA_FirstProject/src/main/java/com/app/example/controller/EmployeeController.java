package com.app.example.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.app.example.dto.EmployeeDto;
import com.app.example.entity.EmployeeEntity;
import com.app.example.service.EmployeeService;
import com.app.example.vo.EmployeeVo;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	public void registerEmployee(EmployeeVo employeeVo)
	{
		
		EmployeeDto employeeDto = new EmployeeDto();
		BeanUtils.copyProperties(employeeVo, employeeDto);
		
		employeeService.registerEmployee(employeeDto);
		
		
	}


}
