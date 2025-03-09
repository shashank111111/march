package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ValidateResponse;
import org.testing.testSteps.HttpMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1_PostMethod {
	
	
	@Test
	public void TC1() throws IOException {
		
	
		Properties pr = PropertiesHandle.loadproperties("../DecFWAPI/URI.properties");
		String requestBody = JsonHandle.readjsonfile("../DecFWAPI/src/test/java/org/testing/resource/Requestbody.json");
		HttpMethods http = new HttpMethods(pr);
		Response res = http.postMethod(requestBody, "QA_URI1");
		ValidateResponse.status(res, 201);
		
	}
}
