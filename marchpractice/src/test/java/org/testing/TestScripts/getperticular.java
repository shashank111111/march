package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.Httpmethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class getperticular {
	@Test
	public void getperticular() throws IOException
	
	{
		Properties p = PropertiesHandle.loadproperties("../marchpractice/URI.properties");
		Httpmethods http = new Httpmethods(p);
		http.getperticular("QA1", "PPIN773");
		
	}

}
