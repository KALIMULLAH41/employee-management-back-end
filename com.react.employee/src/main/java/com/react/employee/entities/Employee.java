package com.react.employee.entities;




import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int salary;
	private List<String>assets;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Long id, String name, int salary, List<String> assets) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.assets = assets;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public List<String> getAssets() {
		return assets;
	}
	public void setAssets(List<String> assets) {
		this.assets = assets;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", assets=" + assets + "]";
	}
	
	
	
	
}
