package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.Httpmethods;
import org.testing.utilities.Jsonhandle;
import org.testing.utilities.PropertiesHandle;
import org.testing.validation.ValidationStatus;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1post {
	@Test
	public void post() throws IOException
	{
		Properties pr = PropertiesHandle.loadproperties("../marchpractice/URI.properties");
		Httpmethods http = new Httpmethods(pr);
		String p = Jsonhandle.readjson("../marchpractice/src/test/java/org/testing/resources/resourse.json");
		Response res = http.postmethod("QA1", p);
		ValidationStatus.status(res, 201);
	}
}