package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Loads;
import com.springrest.springrest.services.LoadService;

@RestController
public class MyController {
	
	@Autowired
	private LoadService loadService;
	//Mappings
	@GetMapping("/home")
	public String home() {
		return "This is Home Page!";
	}
	//Get the loads
	@GetMapping("/load")
	public List<Loads> getLoads(){
		//List<Load> temp; //STORE THE DATA FROM THE DATABASE
		//List<Load> temp1; //RETURN THE DATA THAT MATCHES THE SHIPPERID
		//temp1 = new ArrayList();
		//Scanner sc = new Scanner(System.in);
		//int s_Id;
		//GETTING THE SHIPPERID
		//System.out.println("Enter the shipperId : ");
		//s_Id = sc.nextInt();
		//String shipperString = "shipper:"+String.valueOf(s_Id);
		
		//IMPORT THE DATA
		return this.loadService.getLoads();
		
		//CHECK IF THE SHIPPERID MATCHES
		//for (Load i:temp) {
		//	if(shipperString.equals(i.getShipperId())) {
		//		temp1.add(i);
		//	}
		//}
	}
	
	@GetMapping("/load/{loadId}")
	public Loads getParticularLoad(@PathVariable String loadId) {
		return this.loadService.getParticularLoad(Long.parseLong(loadId));
	}
	
	@PostMapping("/load")
	public String AddLoads(@RequestBody Loads load) {
		
		return this.loadService.AddLoads(load);
	}
	
	@PutMapping("/load/{loadId}")
	public Loads updateLoad(@PathVariable String loadId,@RequestBody Loads load) {
		return this.loadService.updateLoad(Long.parseLong(loadId),load);
	}
	@DeleteMapping("/load/{loadId}")
	public String DeleteLoad(@PathVariable String loadId) {
		return this.loadService.DeleteLoad(Long.parseLong(loadId));
	}
}
