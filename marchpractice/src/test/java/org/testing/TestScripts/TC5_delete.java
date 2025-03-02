package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.Httpmethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC5_delete {
	@Test
	public void TC5() throws IOException
	{
		Properties p = PropertiesHandle.loadproperties("../marchpractice/URI.properties");
		Httpmethods http = new Httpmethods(p);
		http.delete("QA1", "PPIN773");
		
	}

}
