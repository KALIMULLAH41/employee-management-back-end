package com.react.employee.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.react.employee.entities.Employee;
import com.react.employee.services.EmployeeService;

@CrossOrigin("*")
@RestController

public class EmployeeControlle {

	

	@Autowired
	EmployeeService service;
	
	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee e) {
		service.addEmployee(e);
		return "added";
	}

	
	@PostMapping("/updateEmployee")
	public String updateEmployee(@RequestBody Employee e) {
		service.updateEmployee(e);
		return "updated";
	}
	
	
	@GetMapping("/getEmployee")
	public Employee getEmployee(@RequestParam Long id) {
		 return service.getEmployee(id);
		
	}
	
	
	
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee() {
		 return service.getAllEmployee();
		
	}
	
	
}
