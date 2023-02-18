package com.example.model;

import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="employees")
public class Employees {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "first_name" , nullable = false)
	private String firstName;
	
	@Column(name = "last_name" , nullable = false)
	private String LastName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone_number")
	private String phoneNumer;
	
	@Column(name = "hire_date")
	private Date hireDate;
	
	@Column(name = "salary")
	private Long salary;
	
	@Column(name = "manager_id")
	private Long managerId;
	
	@Column(name = "department_id")
	private Departments departmentId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumer() {
		return phoneNumer;
	}

	public void setPhoneNumer(String phoneNumer) {
		this.phoneNumer = phoneNumer;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public Long getManagerId() {
		return managerId;
	}

	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}

	public Departments getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Departments departmentId) {
		this.departmentId = departmentId;
	}
	
	

}
