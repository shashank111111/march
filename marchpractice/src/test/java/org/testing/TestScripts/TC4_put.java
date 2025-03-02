package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.Httpmethods;
import org.testing.utilities.Jsonhandle;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC4_put {
	@Test
	public void put() throws IOException
	{
		Properties p = PropertiesHandle.loadproperties("../marchpractice/URI.properties");
		Httpmethods http = new Httpmethods(p);
		String req = Jsonhandle.readjson("../marchpractice/src/test/java/org/testing/resources/resourcetoupdate");
		http.putm("QA1", "PPIN773", req);
	}
	

}
