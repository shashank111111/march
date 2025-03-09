package org.testing.testSteps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HttpMethods {
	Properties pr;
	public HttpMethods(Properties pr)
	{
		this.pr = pr;
	}
	
	public Response postMethod(String requestBody, String urikeyname )
	{
		String urivalue = pr.getProperty(urikeyname);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(requestBody)
		.when()
		.post(urivalue);
		System.out.println("Status code is");
		System.out.println(res.statusCode());
		System.out.println("Response data is ");
		System.out.println(res.asString());
		return res;
	}
	public Response getall(String urikeyname)
	{
		String urivalue = pr.getProperty(urikeyname);
		Response res=
				
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(urivalue);
		System.out.println("Status code is ");
		System.out.println(res.statusCode());
		System.out.println("Response data is "+res.asString());
		return res;
	}
	
	public Response getperticular(String urikeyname, String endpoint)
	
	{
		String urivalue = pr.getProperty(urikeyname)+"/"+endpoint;
		Response res=
				given()
				.when()
				.contentType(ContentType.JSON)
				.get(urivalue);
		System.out.println("Status code is "+res.statusCode());
		System.out.println("Response data is "+res.asString());
		return res;
	}
	public Response delete(String urikeyname, String endpoint)
	{
		String urivalue = pr.getProperty(urikeyname)+"/"+endpoint;
		Response res = 
				given()
				.when()
				.contentType(ContentType.JSON)
				.delete(urivalue);
		System.out.println("Status code is "+res.statusCode());
		System.out.println("Respose is "+res.asString());
		return res;
	}
	
	public Response putm(String requestbody,String urikeyname,String endpoint)
	{
		String urivalue = pr.getProperty(urikeyname)+"/"+endpoint;
		Response res = 
				given()
				.body(requestbody)
				.when()
				.contentType(ContentType.JSON)
				.put(urivalue);
		System.out.println("Status code is "+res.statusCode());
		System.out.println("code is "+res.asString());
		return res;
			}
	

	
}
