package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Employees;

public interface EmployeeRepository extends JpaRepository<Employees, Long>{

}
