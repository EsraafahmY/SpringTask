package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Departments;
import com.example.model.Employees;
import com.example.repository.DepartmentsRepository;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentsRepository departmentsRepository;

	@Override
	public Departments createDepartment(Departments department) {
		return departmentsRepository.save(department);
	}

	@Override
	public Departments updateDepartment(Departments department) {
		Optional<Departments> dept = departmentsRepository.findById(department.getDepartmentId());
		if(dept.isPresent()) {
			Departments updatedDepartment = dept.get();
			
			updatedDepartment.setDepartmentName(department.getDepartmentName());
			updatedDepartment.setManagerId(department.getManagerId());
			departmentsRepository.save(updatedDepartment);
			return updatedDepartment;
		}else {
			return null;
		}
	}

	@Override
	public void deleteDepartment(Long id) {
		Optional<Departments> dept = departmentsRepository.findById(id);
		if(dept.isPresent()) {
			this.departmentsRepository.delete(dept.get());
		}
		
	}

	@Override
	public Departments getDepartmentbyId(Long id) {
		Optional<Departments> dept = departmentsRepository.findById(id);
		if(dept.isPresent()) {
			return dept.get();
		}else {
			return null;
		}
	}

	@Override
	public List<Departments> getAllDepartments() {
		return this.departmentsRepository.findAll();
	}

}
