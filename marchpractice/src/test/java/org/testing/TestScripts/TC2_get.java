package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.Httpmethods;
import org.testing.utilities.Jsonhandle;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC2_get {
	@Test
	public void get() throws IOException
	{
		Properties p = PropertiesHandle.loadproperties("../marchpractice/URI.properties");
		Httpmethods http = new Httpmethods(p);
		http.getmethod("QA1");
	}

}
