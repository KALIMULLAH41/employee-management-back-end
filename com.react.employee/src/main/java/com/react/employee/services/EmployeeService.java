package com.react.employee.services;

import java.util.List;

import com.react.employee.entities.Employee;

public interface EmployeeService {

	
void addEmployee(Employee e);
	
	void updateEmployee(Employee e);
	
	Employee getEmployee(Long id);
	
	List<Employee>getAllEmployee();
	
}
