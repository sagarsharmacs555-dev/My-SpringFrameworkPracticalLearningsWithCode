package com.app.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.example.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
