package com.react.employee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.react.employee.entities.Employee;

public interface EmployeeRepository   extends JpaRepository<Employee,Long> {

}
