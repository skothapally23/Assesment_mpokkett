package com.GenericUtils;

public interface Endpoints {

	public String getAllEmployee="/employees";
	public String getEmployees="/employee/{id}";
	public String postEmployees="/create";
	public String updateEmployees="/update/{id}";
	public String deleteEmployees="/delete/{id}";


}
