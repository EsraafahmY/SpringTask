package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Departments;
import com.example.service.DepartmentService;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/all-departments")
	public ResponseEntity<List<Departments>> getAllDepartments(){
		return ResponseEntity.ok().body(departmentService.getAllDepartments());
		
	}
	
	@GetMapping("/departments/{id}")
	public ResponseEntity<Departments> getDepartment(@PathVariable Long id){
		return ResponseEntity.ok().body(departmentService.getDepartmentbyId(id));
		
	}
	
	@PostMapping("/create-department")
	public ResponseEntity<Departments> createDepartment(@RequestBody Departments department){
		return ResponseEntity.ok().body(this.departmentService.createDepartment(department));
		
	}
	
	@PutMapping("/update-department/{id")
	public ResponseEntity<Departments> updateDepartment(@PathVariable Long id,@RequestBody Departments department){
		department.setDepartmentId(id);
		return ResponseEntity.ok().body(this.departmentService.updateDepartment(department));
		
	}
	
//	@DeleteMapping("/delete-department/{id")
//	public ResponseEntity<Departments> deleteDepartment(@PathVariable Long id){
//		this.departmentService.deleteDepartment(id);
//		return (ResponseEntity<Departments>) ResponseEntity.status(HttpStatus.OK);
//		
//	}

}
