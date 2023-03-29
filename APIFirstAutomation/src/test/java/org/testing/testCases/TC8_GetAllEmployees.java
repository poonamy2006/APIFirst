package org.testing.testCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC8_GetAllEmployees {
	
	
	@Test
	public static void testcase8() throws IOException {
		Properties p = PropertiesLoad.handleProperties("..//APIFirstAutomation/URI.properties");

		HTTPMethods hp= new HTTPMethods(p);
	 hp.GetAllRequest("RealTime_URI3");
	}

}



