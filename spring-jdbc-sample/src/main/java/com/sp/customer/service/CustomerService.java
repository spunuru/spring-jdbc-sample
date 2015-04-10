package com.sp.customer.service;

import java.util.List;

import com.sp.customer.domain.Address;
import com.sp.customer.domain.Customer;

public interface CustomerService {
	
	/**
	 * Registers a new <code>customer</code> in database
	 * @param customer new customer object whose id is not set yet.
	 * @return new customer object with id set.
	 */
	public Customer registerCustomer(Customer customer);

	/**
	 * Updates <code>customer</code> in database
	 * @param customer the customer object to be updated.
	 * @return new customer object with updated info.
	 */
	public Customer updateCustomer(Customer customer);
	
	public List<Customer> findAllCustomers();
	
	/**
	 * Deletes <code>customer</code> in database.
	 * @param customer the customer to be deleted
	 */
	public void deleteCustomer(Customer customer);	

	/**
	 * Adds <code>address</code> to the <code>customer</code>
	 * @param customer the customer to whom address need to be added.
	 * @param address the new address to be added to customer.
	 * @return customer object that includes newly added address.
	 */
	public Customer addCustomerAddress(Customer customer, Address address);	
	
	/**
	 * Deletes <code>address</code> from <code>customer</code>
	 * @param customer the customer whose address need deletion.
	 * @param address the address to be deleted
	 * @return customer object with address removed.
	 */
	public Customer deleteCustomerAddress(Customer customer, Address address);
}
