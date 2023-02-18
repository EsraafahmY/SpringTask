package com.example.service;

import java.util.List;

import com.example.model.Departments;

public interface DepartmentService {
	
	Departments createDepartment(Departments department);
		
    Departments updateDepartment(Departments department);
	
	void deleteDepartment(Long id);
	
	Departments getDepartmentbyId(Long id);
	
	List<Departments> getAllDepartments();

}
