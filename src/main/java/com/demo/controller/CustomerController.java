package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Customer;
import com.demo.service.CustomerService;

@RestController
@RequestMapping("/v1/app")
public class CustomerController {
@Autowired
	private CustomerService service; 
@GetMapping("/customers")
public List<Customer> getAllCustomers(){

return service.getAllcustomers();

}
@PostMapping("/customers")
public void addCustomer(@RequestBody Customer customer) { 

service.addCustomer(customer);

}
@GetMapping("/customers/{id}")
public Customer getOneCustomer(@PathVariable int id) {
	return service.findOneById(id);
}
@PutMapping("/customers/{id}")
public void updateCustomer(@PathVariable int id, @RequestBody Customer customer) {
	service.updateCustomer(id, customer);
}
@DeleteMapping("/customers{id}")
public void deleteCustomer(@PathVariable int id) {
	service.deleteById(id);
}



}