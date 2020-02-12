package com.api.test;


import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
 
public class Put_UpdateEmployeeData {

  @Test
    public void updateEmployee() {
 
        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
 
        String requestBody = "{\r\n" +
            " \"name\":\"put_test_employee\",\r\n" +
            " \"salary\":\"1123\",\r\n" +
            " \"age\":\"23\"\r\n" +
            "}";
 
 
        Response response = null;
 
        try {
            response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .put("/update/21");
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        System.out.println("Response :" + response.asString());
        System.out.println("Status Code :" + response.getStatusCode());
        System.out.println("Does Reponse contains 'tammy'? :" + response.asString().contains("tammy"));
 
 
        assertEquals(200, response.getStatusCode());
    }
}