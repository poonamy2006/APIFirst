package org.testing.testCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.Test;

public class TC5_DeleteRequest {
	
	@Test
	public static void testcase5() throws IOException {
		
		Properties P = PropertiesLoad.handleProperties("../APIFirstAutomation/URI.properties");
		HTTPMethods http = new HTTPMethods(P);
		http.DeleteRequest("QA_URI", TC1_PostRequest.returnidValue);
		
		
	}

}
