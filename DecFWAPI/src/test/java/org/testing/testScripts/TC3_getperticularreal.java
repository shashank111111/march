package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ValidateResponse;
import org.testing.testSteps.HttpMethods;
import org.testing.utilities.PropertiesHandle;

import io.restassured.response.Response;

public class TC3_getperticularreal {
	
	public void TC3_real() throws IOException
	
	{
		Properties pr = PropertiesHandle.loadproperties("../DecFWAPI/URI.properties");
		HttpMethods http = new HttpMethods(pr);
		Response res = http.getperticular("QA_URI3", "110");
		ValidateResponse.status(res, 200);
		
		
		
		
	}

}
