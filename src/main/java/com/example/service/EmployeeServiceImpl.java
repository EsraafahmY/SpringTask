package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Employees;
import com.example.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employees createEmployee(Employees employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employees updateEmployee(Employees employee) {
		Optional<Employees> emp = employeeRepository.findById(employee.getId());
		if(emp.isPresent()) {
			Employees updatedEmployee = emp.get();
			
			updatedEmployee.setDepartmentId(employee.getDepartmentId());
			updatedEmployee.setFirstName(employee.getFirstName());
			updatedEmployee.setLastName(employee.getLastName());
			updatedEmployee.setPhoneNumer(employee.getPhoneNumer());
			updatedEmployee.setEmail(employee.getEmail());
			updatedEmployee.setManagerId(employee.getManagerId());
			employeeRepository.save(updatedEmployee);
			return updatedEmployee;
		}else {
			return null;
		}
	}

	@Override
	public void deleteEmployee(Long id) {
		Optional<Employees> emp = employeeRepository.findById(id);
		if(emp.isPresent()) {
			this.employeeRepository.delete(emp.get());
		}
		
	}

	@Override
	public Employees getEmployeebyId(Long id) {
		Optional<Employees> emp = employeeRepository.findById(id);
		if(emp.isPresent()) {
			return emp.get();
		}else {
			return null;
		}
	}

	@Override
	public List<Employees> getAllEmployees() {
		return this.employeeRepository.findAll();
	}

}
