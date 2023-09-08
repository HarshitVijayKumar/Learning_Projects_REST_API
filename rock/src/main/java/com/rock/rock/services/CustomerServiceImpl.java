package com.rock.rock.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.rock.rock.entities.Customer;
import com.rock.rock.dao.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;
	
	

	@Override
	public List<Customer> getCustomer() {
		return customerDao.findAll();
	}

	@Override
	public void addCustomer(Customer customer) {
		customerDao.save(customer);
	}

	@Override
	public void deleteCustomer(long parseLong) {
		Customer entity = customerDao.getOne(parseLong);
		customerDao.delete(entity);
	}

	@Override
	public void updateCourse(long parseLong,Customer customer) {
		Customer entity = customerDao.getOne(parseLong);
		customerDao.delete(entity);
		entity.setC_Id(customer.getC_Id());
		entity.setFirst_name(customer.getFirst_name());
		entity.setLast_name(customer.getLast_name());
		entity.setAddress(customer.getAddress());
		entity.setState(customer.getState());
		entity.setEmail(customer.getEmail());
		entity.setPhone(customer.getPhone());
		entity.setStreet(customer.getStreet());
		customerDao.save(entity);
	}
	
	
}
