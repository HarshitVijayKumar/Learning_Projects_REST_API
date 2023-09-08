package com.rock.rock.services;

import java.util.List;

import org.springframework.ui.Model;

import com.rock.rock.entities.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomer();

	public void addCustomer(Customer customer);

	public void deleteCustomer(long parseLong);

	public void updateCourse(long parseLong,Customer customer);
	
}
