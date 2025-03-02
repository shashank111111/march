package org.testing.TestSteps;

import java.util.Properties;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class Httpmethods {
	Properties pr;
	public Httpmethods(Properties pr)
	{
		this.pr = pr;
	}
	
	public Response postmethod(String urikeyname, String requestbody)
	{
		
		String urivalue = pr.getProperty(urikeyname);	
				Response res=
						given()
		.contentType(ContentType.JSON)
		.body(requestbody)
		.when()
		.post(urivalue);
		System.out.println("Status code is"+res.statusCode());
		System.out.println("Status code ");
		System.out.println("Response data is "+res.asString());	
		return res;
	}
	public void getmethod(String urikeyname)
	{
		String uriValue = pr.getProperty(urikeyname);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uriValue);
		System.out.println("Status code is"+res.statusCode());
		System.out.println("response data is "+res.asString());	
	}
	public void getperticular(String usikeyname, String endpoint)
	{
		String urivalue = pr.getProperty(usikeyname)+"/"+endpoint;
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(urivalue);
		System.out.println("Status code is "+res.statusCode());
		System.out.println("response data is "+res.asString());
		
	
		}
	public void putm(String urikeyname, String endpoint, String reuestbody)
	{
		String urivalue = pr.getProperty(urikeyname)+"/"+endpoint;
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.body(reuestbody)
				.when()
				.put(urivalue);
		System.out.println("Status code is "+res.statusCode());
		System.out.println("response data is "+res.asString());	
	}
	public void delete(String urikeyname, String endpoint)
	{
		String urivalue = pr.getProperty(urikeyname)+"/"+endpoint;
		Response res =
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete(urivalue);
		System.out.println("Status code is "+res.statusCode());
		System.out.println("Response data is "+res.asString());
	}

}
