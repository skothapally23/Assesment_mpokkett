package com.mpokket.employeepojolibrary;

public class EmployeeLib {

	
	String Name;
	String Salary;
	String age;
	int id;
	public EmployeeLib(String Name, String Salary , String Age, int id) {
	
		this.Name=Name;
		this.Salary=Salary;
		this.age=Age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
}
