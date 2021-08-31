package com.mpokket.employeepojolibrary;

public class Employee {
	String status;
	EmployeeLib data;

	public Employee(String status, EmployeeLib data) {
		super();
		this.status = status;
		this.data = data;
	}

	public Employee() {
		super();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public EmployeeLib getData() {
		return data;
	}

	public void setData(EmployeeLib data) {
		this.data = data;
	}


}


