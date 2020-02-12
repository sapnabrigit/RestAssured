package com.api.common;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.test.Get_AllEmployeeData;

import io.restassured.response.Response;

public class CommonTests extends Get_AllEmployeeData{

	
	@Test
	void checkResposeBody(Response response)
	{
		
		//logger.info("***********  Checking Respose Body **********");
		
		String responseBody = response.getBody().asString();
		//logger.info("Response Body==>"+responseBody);
		Assert.assertTrue(responseBody!=null);
		System.out.println(responseBody);
		
	}
		
	@Test
	void checkStatusCode()
	{
		//logger.info("***********  Checking Status Code **********");
		
		int statusCode = response.getStatusCode(); // Gettng status code
		//logger.info("Status Code is ==>" + statusCode); //200
		Assert.assertEquals(statusCode, 200);
		
	}
	 
	
	
}
