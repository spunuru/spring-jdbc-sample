package com.sp.customer.domain;

import java.util.HashSet;
import java.util.Set;

public class Customer {

	
	private Integer id;

	private String name;

	private Set<Address> addresses = new HashSet<Address>();
	
	public Customer() {
	}
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void addAddress(Address address) {
		this.addresses.add(address);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Customer [id=%s, name=%s, addresses=%s]", id,
				name, addresses);
	}


}
