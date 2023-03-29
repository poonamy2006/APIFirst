package org.testing.testCases;

import java.io.IOException;
import java.util.Properties;
import org.testing.Helper.JsonParsingUsingJsonPath;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesLoad;
import org.testing.utilities.HandleJsonFile;
import org.testing.utilities.JsonParseUsingOrgJson;
import org.testng.annotations.Test;

import io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.response.Response.*;



 
public class TC2_GetAllRequest {

	@Test
	public static void testcase2() throws IOException {
		Properties P = PropertiesLoad.handleProperties("../APIFirstAutomation/URI.properties");
		HTTPMethods http = new HTTPMethods(P);
		Response res= http.GetAllRequest("QA_URI");
		System.out.println("All ids are here...");
		JsonParseUsingOrgJson.ExtractData(res.asString(), "id");

		
	}

}
