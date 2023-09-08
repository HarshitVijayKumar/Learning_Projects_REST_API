package com.rock.rock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rock.rock.entities.Customer;
import com.rock.rock.services.CustomerService;

@RestController
public class MyController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/get_customer_list")
	public List<Customer> getCustomer(){
		return this.customerService.getCustomer();
	}
	
	@GetMapping("/get_customer_table")
    public String getCustomerList(Model model) {
		List<Customer> customers = this.customerService.getCustomer();
	    model.addAttribute("customers", customers);
	    return "customer-list";
    }
	
	@PostMapping("/create")
	public ResponseEntity<HttpStatus> addCustomer(@RequestBody Customer customer){
		try {
			if((customer.getFirst_name()==null)||(customer.getLast_name()==null)) {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
			this.customerService.addCustomer(customer);
			return new ResponseEntity<>(HttpStatus.CREATED);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/delete/{C_Id}")
	public ResponseEntity<HttpStatus> deleteCustomer(@PathVariable String C_Id){
		try {
			this.customerService.deleteCustomer(Long.parseLong(C_Id));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/update/{C_Id}")
	public ResponseEntity<HttpStatus> updateCourse(@PathVariable String C_Id,@RequestBody Customer customer){
		try {
			if(customer.equals(null)){
				return new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
			}
			this.customerService.updateCourse(Long.parseLong(C_Id),customer);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
