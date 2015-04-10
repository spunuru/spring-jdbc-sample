package com.sp.customer.dao;

import java.util.List;

import com.sp.customer.domain.Customer;

public interface CustomerDAO {
	Customer findById(Integer customerId);
	List<Customer> listAll();
}
