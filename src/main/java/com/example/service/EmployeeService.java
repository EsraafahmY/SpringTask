package com.example.service;

import java.util.List;

import com.example.model.Employees;

public interface EmployeeService {
	Employees createEmployee(Employees employee);
	
	Employees updateEmployee(Employees employee);
	
	void deleteEmployee(Long id);
	
	Employees getEmployeebyId(Long id);
	
	List<Employees> getAllEmployees();

}
