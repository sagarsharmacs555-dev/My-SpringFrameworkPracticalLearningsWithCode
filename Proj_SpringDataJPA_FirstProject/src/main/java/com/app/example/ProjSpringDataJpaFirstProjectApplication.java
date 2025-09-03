package com.app.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.app.example.controller.EmployeeController;
import com.app.example.vo.EmployeeVo;

@SpringBootApplication
public class ProjSpringDataJpaFirstProjectApplication {

	public static void main(String[] args) {
		
		EmployeeVo employeeVo = new EmployeeVo();
		employeeVo.setId(1005);
		employeeVo.setEmail("MohitKulkarni555@gmail.com");
		employeeVo.setName("MohitKulkarni");
		employeeVo.setSalary(6.8f);
		
		ApplicationContext context = null;
		context = SpringApplication.run(ProjSpringDataJpaFirstProjectApplication.class, args);
		
		EmployeeController controller = context.getBean("employeeController",EmployeeController.class);
		
		controller.registerEmployee(employeeVo);
	}

}
