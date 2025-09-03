package com.app.example.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.example.entity.EmployeeEntity;

@Repository
public interface EmployeeRepo extends CrudRepository<EmployeeEntity, Integer> {

}
