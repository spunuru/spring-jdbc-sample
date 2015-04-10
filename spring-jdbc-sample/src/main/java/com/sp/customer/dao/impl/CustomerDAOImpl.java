package com.sp.customer.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sp.customer.dao.CustomerDAO;
import com.sp.customer.domain.Customer;
import com.sp.customer.mapper.CustomerMapper;

/**
 * 
 * @Repository enables following - 
 * 
 * <ul>
 * 		<li>Registers this class as spring bean</li>
 * 		<li>Translates persistence specific (for e.g. JDBC, JPA, JDO) exceptions to technology agnostic Spring DAO exception hierarchy </li>
 * </ul>
 * @author spunuru
 *
 */
@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
    private final static String SQL_FIND_BY_ID = "SELECT id, name FROM CUSTOMER WHERE id = ?";
    private final static String SQL_FIND_ALL = "SELECT id, name FROM CUSTOMER";

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void init(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

	@Override
	public Customer findById(Integer customerId) {		
		Customer customer = this.jdbcTemplate.queryForObject(SQL_FIND_BY_ID, new CustomerMapper(), customerId);		
		return customer;
	}

	@Override
	public List<Customer> listAll() {
        List<Customer> customerList = jdbcTemplate.query(SQL_FIND_ALL, new CustomerMapper());
        return customerList;
    }

}
