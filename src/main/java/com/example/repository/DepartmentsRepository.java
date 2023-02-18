package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Departments;

public interface DepartmentsRepository extends JpaRepository<Departments, Long> {

}
