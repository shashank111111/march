package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ValidateResponse;
import org.testing.testSteps.HttpMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.PropertiesHandle;

import io.restassured.response.Response;

public class TC5_putreal {
	
	public void TC5() throws IOException
	{
		Properties pr = PropertiesHandle.loadproperties("../DecFWAPI/URI.properties");
		String requestbody = JsonHandle.readjsonfile("../DecFWAPI/src/test/java/org/testing/resource/Requestbodyforupdate.json");
		HttpMethods http = new HttpMethods(pr);
		Response res = http.putm(requestbody, "QA_URI3", "8");
		ValidateResponse.status(res, 200);
	}
	

}
