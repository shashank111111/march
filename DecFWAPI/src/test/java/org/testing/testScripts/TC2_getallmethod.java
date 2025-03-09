package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ValidateResponse;
import org.testing.testSteps.HttpMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC2_getallmethod {

	@Test
	public void TC2() throws IOException
	{
		Properties pr = PropertiesHandle.loadproperties("../DecFWAPI/URI.properties");
		HttpMethods http = new HttpMethods(pr);
		Response res = http.getall("QA_URI1");
		ValidateResponse.status(res, 200);
		
	}
}
