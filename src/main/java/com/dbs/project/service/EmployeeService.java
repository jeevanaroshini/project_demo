package com.dbs.project.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dbs.project.model.Customers;
import com.dbs.project.model.Employee;
import com.dbs.project.repo.CustomerRepo;
import com.dbs.project.repo.EmpRepo;
import com.dbs.project.repo.LoginRepo;

public class EmployeeService {

	@Autowired
	CustomerRepo cr;
	EmpRepo er;
	
	public String checkUser(String username) {
		// TODO Auto-generated method stub
		Customers cust=cr.findByUsername(username);
		Employee emp=er.findByUsername(username);
		if(emp.getUsername()==username) {
			return "employee";
		}
		if(cust.getUsername()==username) {
			return "customer";
		}
		
		return null;
	}

	
}
