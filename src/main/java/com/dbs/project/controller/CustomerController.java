package com.dbs.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.project.model.Customers;
import com.dbs.project.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/all")
	public List<Customers> display(){
		return customerService.run();
	}
	
	@GetMapping("/test")
	public String display1(){
		return "Working!!!";
	}

}
