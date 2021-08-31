package com.APIScripting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.GenericUtils.BaseAPIClass;
import com.GenericUtils.Endpoints;
import com.GenericUtils.JavaUtility;
import com.mpokket.deserialize.EmployeeResponse;
import com.mpokket.deserialize.GetEmployeeResponse;
import com.mpokket.employeepojolibrary.Employee;
import com.mpokket.employeepojolibrary.EmployeeLib;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateAnEmployeeDataTest extends BaseAPIClass {

	@Test			
		public void createEmplyoeeTest() {
		JavaUtility javaUtility = new JavaUtility();
		 EmployeeLib employeeObject = new EmployeeLib("test"+ javaUtility.randomNumber(),"123","26",25);

			Employee employee = new Employee("success",employeeObject);

			Response response = RestAssured.given()
					.contentType(ContentType.JSON)
					.body(employee)
					.when()
					.post(Endpoints.postEmployees);
			response.then()
			.log().all();

			int empId=response.jsonPath().get("data.id");
			EmployeeResponse employeeRes = response.getBody().as(EmployeeResponse.class);
			Assert.assertEquals(employeeRes.getMessage(),"Successfully! Record has been added.");
			Assert.assertEquals(employeeRes.getStatus(),employee.getStatus());


			Response getResponse = RestAssured.given()
					.pathParam("id", empId)
					.get(Endpoints.getEmployees);
			getResponse.then().log().all();

			GetEmployeeResponse getEmployeeData = getResponse.getBody().as(GetEmployeeResponse.class);
			Assert.assertEquals(getEmployeeData.getStatus(),employee.getStatus());
			Assert.assertEquals(getEmployeeData.getMessage(),"Successfully! Record has been generated.");


			RestAssured.given()
			.pathParam("id", empId)
			.delete(Endpoints.deleteEmployees)
			.then()
			.log().all();

		}
		

	}	

