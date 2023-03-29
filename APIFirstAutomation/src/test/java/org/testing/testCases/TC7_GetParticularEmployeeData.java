package org.testing.testCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.HandleJsonFile;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC7_GetParticularEmployeeData {
	
		
		@Test
		public static void testcase7() throws IOException {
			Properties p = PropertiesLoad.handleProperties("..//APIFirstAutomation/URI.properties");
			HTTPMethods hp= new HTTPMethods(p);
		 hp.GetParticular("RealTime_URI2", "1");
		}

	}


