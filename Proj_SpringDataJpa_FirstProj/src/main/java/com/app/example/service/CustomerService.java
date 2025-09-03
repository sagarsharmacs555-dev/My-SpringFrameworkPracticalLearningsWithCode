package com.app.example.service;

import java.util.List;
import java.util.Optional;

import com.app.example.dto.CustomerDto;
import com.app.example.entity.CustomerEntity;

public interface CustomerService {
	
	public Integer registerCustomer(CustomerDto customerDto);
	
	public Integer[] registerCustomerByGroup(List<CustomerDto> customerDto);
	
	public long getTotalNoOFCustomers();
	
	public boolean customerExistsById(int id);
	
	public void deleteCustomerById(int id);
	
	public Optional<CustomerDto> getCustomerById(int id);
	
	public String deleteCustomerByEntityId(int id);

}
