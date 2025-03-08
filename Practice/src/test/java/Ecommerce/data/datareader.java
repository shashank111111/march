package Ecommerce.data;
import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class datareader {

	
	
	public HashMap<String, String> readdata() throws IOException
	{
		
		//json to string
		File f = new File("../Practice/src/test/java/Ecommerce/data/purchasedata.json");
	String JsonCont=	FileUtils.readFileToString(f,StandardCharsets.UTF_8);
	//String to HashMap
	
	ObjectMapper obj = new ObjectMapper();
	HashMap<String, String > data = obj.readValue(JsonCont, HashMap.class);
	return data;
		
		
		
	}
}
