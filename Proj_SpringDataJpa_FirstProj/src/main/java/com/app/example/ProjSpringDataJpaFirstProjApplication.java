package com.app.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.app.example.controller.CustomerController;
import com.app.example.dto.CustomerDto;

@SpringBootApplication
public class ProjSpringDataJpaFirstProjApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = null;
		context = SpringApplication.run(ProjSpringDataJpaFirstProjApplication.class, args);
		//singleinsertion
//		CustomerDto customerDto = new CustomerDto();
//		customerDto.setId(3);
//		customerDto.setEmail("7bha7kar@gmail.com");
//		customerDto.setName("BhaskarSharma");
//		customerDto.setSalary(44.2f);
		
		CustomerController customerController = context.getBean("customerController", CustomerController.class);
		
//		customerController.customerRequestProcees(customerDto);
		
		// Batch Insertion
//		Integer[] ids = customerController.customerGroupRequestProcess(
//				
//				
//				List.of(new CustomerDto(14, "RahulYadav", "RahulYadav@gmail.com", 3.4f),
//						new CustomerDto(15, "RahulKumar", "RahulYadav@gmail.com", 2.4f),
//						new CustomerDto(16, "RahulRanjan", "RahulYadav@gmail.com", 1.4f),
//						new CustomerDto(17, "RahulPrasad", "RahulYadav@gmail.com", 5.4f),
//						new CustomerDto(18, "RahulRajput", "RahulYadav@gmail.com", 7.4f)
//						
//						));
//		
//		System.out.println("List of ids is " + Arrays.toString(ids));
		
		long totalNoOfCustomers = customerController.countTotalOfCustomersRecord();
		System.out.println("The total no of customers is " + totalNoOfCustomers);
		
		Boolean exists = customerController.customerExistByIdRequest(2);
		System.out.println("The id of the customer exists in by db is " + exists);
		
		System.out.println("-------------------------");
		customerController.deleteCustomerByIdRequest(1);
		
		System.out.println("----------------------------");
		
		Optional<CustomerDto> customerId = customerController.getCustomerById(7);
		System.out.println("The Details of the customer is " + customerId);
		
		System.out.println("----------------------------------------");
		String status = customerController.deleteCustomerByEntityIdRequest(18);
		System.out.println(status);
	}
	
	
       
}
