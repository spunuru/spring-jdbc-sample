package com.sp.customer;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.customer.dao.CustomerDAO;
import com.sp.customer.dao.impl.CustomerDAOImpl;
import com.sp.customer.domain.Customer;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		CustomerDAO customerDAO = context.getBean(CustomerDAOImpl.class);
		
		List<Customer> customers = customerDAO.listAll();
		for (Customer customer : customers) {
			System.out.println(customer.toString());
		}
		
	}

}
