package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmployeeModel {
       @Id
       private int id;
       private String EmployeeName;
       private int employeeAge;
       private long salary;
	public EmployeeModel(int id, String employeeName, int employeeAge, long salary) {
		super();
		this.id = id;
		EmployeeName = employeeName;
		this.employeeAge = employeeAge;
		this.salary = salary;
	}
	public EmployeeModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
       
}
