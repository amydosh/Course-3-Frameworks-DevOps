package com.simplilearn.workshop.repository;

import java.util.List;

import com.simplilearn.workshop.model.Customer;

public interface CustomerRepository {

	public List<Customer> findAll();

	public Integer findNoOfCustomers();

}
