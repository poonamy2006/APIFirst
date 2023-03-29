package org.testing.testCases;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.HandleJsonFile;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC6_PostEmployeeRecord {
	
	@Test
	public static void testcase6() throws IOException {
		Properties p = PropertiesLoad.handleProperties("..//APIFirstAutomation/URI.properties");
String BodyData= HandleJsonFile.readJson("..//APIFirstAutomation/src/main/java/org/testing/resources/EmployeeInputPayLoad.json");
		HTTPMethods hp= new HTTPMethods(p);
		Response res = hp.postRequest(BodyData,"RealTime_URI1");
	}

}
