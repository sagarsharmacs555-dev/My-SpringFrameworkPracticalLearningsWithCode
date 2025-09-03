package com.app.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.example.dto.CustomerDto;
import com.app.example.entity.CustomerEntity;
import com.app.example.repo.EmployeeRepo;

@Service("customerService")
public class CustomerServiceImp implements CustomerService{
	
	@Autowired
	EmployeeRepo employeeRepo;

	@Override
	public Integer registerCustomer(CustomerDto customerDto) {
		
		CustomerEntity customerEntity = new CustomerEntity();
		BeanUtils.copyProperties(customerDto, customerEntity);
		CustomerEntity customerEntity1 = employeeRepo.save(customerEntity);
		
		return customerEntity.getId();
	}

	@Override
	public Integer[] registerCustomerByGroup(List<CustomerDto> customerDto) {
		
		List<CustomerEntity> listEntity = new ArrayList();
		
		customerDto.forEach((dto)->
		{
			CustomerEntity customerEntity = new CustomerEntity();
			BeanUtils.copyProperties(dto, customerEntity);
			listEntity.add(customerEntity);
		});
		
		List<CustomerEntity> customerEntityList  =(List<CustomerEntity>)employeeRepo.saveAll(listEntity);
		
		Integer ids[] = new Integer[customerEntityList.size()];
		
		for(int i = 0; i<customerEntityList.size(); i++)
		{
			ids[i] = customerEntityList.get(i).getId();
		}
		
		
		return ids;
	}

	@Override
	public long getTotalNoOFCustomers() {
		
		
		return employeeRepo.count();
	}

	@Override
	public boolean customerExistsById(int id) {
			
		
		return employeeRepo.existsById(id);
	}

	@Override
	public void deleteCustomerById(int id) {
		
		employeeRepo.deleteById(id);
		
	}

	@Override
	public Optional<CustomerDto> getCustomerById(int id) {
		
		Optional<CustomerEntity> customerEntityOptional = employeeRepo.findById(id);
		Optional<CustomerDto> customerDtoOptional = Optional.empty();
		
		if(customerEntityOptional.isPresent())
		{
			CustomerEntity customerEntity = customerEntityOptional.get();
			CustomerDto dto = new CustomerDto();
			BeanUtils.copyProperties(customerEntity, dto);
			
			 customerDtoOptional = Optional.of(dto);
		}
		
		return customerDtoOptional;
	}

	@Override
	public String deleteCustomerByEntityId(int id) {
		
		Optional<CustomerEntity> optionalCustomerEntity =  employeeRepo.findById(id);
		String status = "";
		
		if(optionalCustomerEntity.isPresent())
		{
			employeeRepo.delete(optionalCustomerEntity.get());
			status = "Customer deleted successfully";
		}
		
		else {
			status = "failed";
		}
		
		return status;
	}

	
		
		
	
	
	

}
