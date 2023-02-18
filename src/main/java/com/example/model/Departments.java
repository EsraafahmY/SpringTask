package com.example.model;


import javax.persistence.*;

@Entity
@Table(name="departments")
public class Departments {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long departmentId;
	
	@Column(name = "department_name")
	private String departmentName;
	
	@Column(name = "manager_id")
	private Employees managerId;
	
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Employees getManagerId() {
		return managerId;
	}
	public void setManagerId(Employees managerId) {
		this.managerId = managerId;
	}
	
	

}
