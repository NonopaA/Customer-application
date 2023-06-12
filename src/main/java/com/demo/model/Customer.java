package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String name;
	private long phoneNumber;
	private String address;
	
	public Customer() {
		super();
	}

	public Customer(int id, String name, long phoneNumber, String address) {
		super();
		Id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	

	public Customer(String name, long phoneNumber, String address) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}

	
	
	
	
	
	
}
