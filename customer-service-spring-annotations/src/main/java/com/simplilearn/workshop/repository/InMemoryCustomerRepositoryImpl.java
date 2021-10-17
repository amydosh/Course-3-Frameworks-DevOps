package com.simplilearn.workshop.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.simplilearn.workshop.model.Customer;

@Repository(value = "customerRepository")
// Note, the default bean name is the class name with lower-case first letter (inMemoryCustomerRepositoryImpl), but by setting the value above, we customize it
public class InMemoryCustomerRepositoryImpl implements CustomerRepository {
	
	private static List<Customer> customers = new ArrayList<>();
	
	
	
	static {
		customers.add(new Customer(1L, "Andie", "248-464-4155", "andie.mydosh@gmail.com"));
		customers.add(new Customer(2L, "Joe", "616-550-2071", "jmydosh@gmail.com"));
		customers.add(new Customer(3L, "Kyla", "248-550-3025", "kyla.mydosh@gmail.com"));
	}
	
	@Override
	public List<Customer> findAll() {
		return customers;
	}

}
