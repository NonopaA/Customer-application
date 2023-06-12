package com.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	
	//findAll, findById, DeleteById- we don't need to provide implementation for these methods because the framework already provides the implementation for them.

}
