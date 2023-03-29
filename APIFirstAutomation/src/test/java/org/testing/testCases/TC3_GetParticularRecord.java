package org.testing.testCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.Helper.JsonParsingUsingJsonPath;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC3_GetParticularRecord {
	
	@Test
	public void testcase3() throws IOException {
		
		Properties P= PropertiesLoad.handleProperties("../APIFirstAutomation/URI.properties");
		HTTPMethods http= new HTTPMethods(P);
		Response res= http.GetAllRequest("QA_URI");
		String returnidValue= JsonParsingUsingJsonPath.ExtractJson(res, "[4].id");
		http.GetParticular("QA_URI", returnidValue);
		
		
		
		
	}
	
	

}
