package com.api.test;

import com.api.base.BaseClass;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
 

public class Get_AllEmployeeData extends BaseClass{
	
		 
	 @Test
	 public void retrieveAllEmployee() {
	 
	  RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
	 
	  Response response = null;
	 
	  try {
	   response = RestAssured.given()
	    .when()
	    .get("/employees");
	  } catch (Exception e) {
	   e.printStackTrace();
	  }
	 
	  System.out.println("Response :" + response.asString());
	  System.out.println("Status Code :" + response.getStatusCode());
	  System.out.println("Does Reponse contains 'employee_salary'? :" + response.asString().contains("employee_salary"));
	 
	 
	  assertEquals(200, response.getStatusCode());
	 }
	 
	 
	 @Test
	    public void retrieveSpecificEmployee() {
	 
	        String id = "2";
	 
	        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employee/";
	 
	        Response response = null;
	 
	        try {
	            response = RestAssured.given()
	                                  .pathParam("id", id)
	                                  .when()
	                                  .get("/{id}");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	 
	        System.out.println("Response :" + response.asString());
	        System.out.println("Status Code :" + response.getStatusCode());
	        System.out.println("Does Reponse contains 'employee_salary-----'? :" + response.asString().contains("employee_salary"));
	 
	        assertEquals(200, response.getStatusCode());
	    }

}