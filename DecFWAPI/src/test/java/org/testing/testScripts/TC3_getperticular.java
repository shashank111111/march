package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ValidateResponse;
import org.testing.testSteps.HttpMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC3_getperticular {
	@Test
	public void TC3() throws IOException
	
	{
		Properties pr = PropertiesHandle.loadproperties("../DecFWAPI/URI.properties");
		HttpMethods http = new HttpMethods(pr);
		Response res = http.getperticular("QA_URI1", "12");
		ValidateResponse.status(res, 200);
		
		
		
		
	}

}
