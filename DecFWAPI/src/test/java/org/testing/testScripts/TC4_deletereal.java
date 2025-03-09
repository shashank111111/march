package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ValidateResponse;
import org.testing.testSteps.HttpMethods;
import org.testing.utilities.PropertiesHandle;

import io.restassured.response.Response;

public class TC4_deletereal {
	
	public void TC4() throws IOException
	
	{
		Properties pr = PropertiesHandle.loadproperties("../DecFWAPI/URI.properties");
		HttpMethods http = new HttpMethods(pr);
		Response res = http.delete("QA_URI3", "110");
		ValidateResponse.status(res, 200);
		
		
		
		
	}

}
