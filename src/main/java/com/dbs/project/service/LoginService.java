package com.dbs.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.project.model.Customers;
import com.dbs.project.model.Employee;
import com.dbs.project.model.Login;
import com.dbs.project.repo.CustomerRepo;
import com.dbs.project.repo.EmpRepo;
//import com.dbs.project.repo.CustomerRepo;
import com.dbs.project.repo.LoginRepo;

@Service
public class LoginService {
	
	@Autowired
	LoginRepo lr;
	
	EmployeeService es;
	/*
	public List<Customers> run() {
		return lr.findAll();
	}
*/
	public String validateUser(String username, String password) {
		// TODO Auto-generated method stub
		String status="";
		String role="";
		Login login=lr.findByUsername(username);
		if(login.getUserName()!=null && login.getPassword().equals(password)) {
			status="Success";
		}
		
		
		if(status=="Success")
		{	
			role=es.checkUser(username);
			return role;
		}
		return "Fail";
	}

}
