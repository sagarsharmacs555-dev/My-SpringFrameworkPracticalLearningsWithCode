package com.app.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.app.example.dto.CustomerDto;
import com.app.example.entity.CustomerEntity;
import com.app.example.service.CustomerService;

@Controller("customerController")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	public void customerRequestProcees(CustomerDto customerDto)
	{
		Integer i = customerService.registerCustomer(customerDto);
		
		if (i!=null)
		{
			System.out.println("Record Inserted Successfully");
		}
		
		else
		{
			System.out.println("failed to insert the record");
		}
	}
	
	public Integer[] customerGroupRequestProcess(List<CustomerDto> customerDto)
	{
		return customerService.registerCustomerByGroup(customerDto);
	}
	
	public long countTotalOfCustomersRecord()
	{
		return customerService.getTotalNoOFCustomers();
	}
	
	public boolean customerExistByIdRequest(int id)
	{
		return customerService.customerExistsById(id);
	}
	
	public void deleteCustomerByIdRequest(int id)
	{
		customerService.deleteCustomerById(id);
	}
	
	public Optional<CustomerDto> getCustomerById(int id)
	{
		 return customerService.getCustomerById(id);
	}
	
	public String deleteCustomerByEntityIdRequest(int id) {
	
		return customerService.deleteCustomerByEntityId(id);
	}

}
