package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Customer;
import com.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repo;

	
public List<Customer> getAllcustomers(){
	List<Customer> customers = new ArrayList<>();
	repo.findAll().forEach(customers::add);
	return customers;
}
public Customer findOneById(int id) {
	return repo.findById(id).orElseThrow();
}
public void addCustomer(Customer customer) {
repo.save(customer);

}
public void updateCustomer(int id, Customer customer) {
	repo.save(customer);
}

public void deleteById(int id) {
	repo.deleteById(id);
}




}
