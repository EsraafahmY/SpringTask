package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Departments;
import com.example.model.Employees;
import com.example.service.EmployeeService;

@RestController
public class EmployeeControler {

	@Autowired
	private EmployeeService employeeService;
	
	public ResponseEntity<List<Employees>> getAllEmplpoyees(){
		return ResponseEntity.ok().body(employeeService.getAllEmployees());
		
	}
	
	public ResponseEntity<Employees> getAllEmplpoyees(@PathVariable Long id){
		return ResponseEntity.ok().body(employeeService.getEmployeebyId(id));
		
	}
	
	@PostMapping("/create-empolyee")
	public ResponseEntity<Employees> createDepartment(@RequestBody Employees employee){
		return ResponseEntity.ok().body(this.employeeService.createEmployee(employee));
		
	}
	
	@PutMapping("/update-employee/{id)")
	public ResponseEntity<Employees> updateDepartment(@PathVariable Long id,@RequestBody Employees employee){
		employee.setId(id);
		return ResponseEntity.ok().body(this.employeeService.updateEmployee(employee));
		
	}
	
//	@DeleteMapping("/delete-employee/{id)")
//	public ResponseEntity<Employees> deleteDepartment(@PathVariable Long id){
//		this.employeeService.deleteEmployee(id);
//		return (ResponseEntity<Employees>) ResponseEntity.status(HttpStatus.OK);
//	}
}
