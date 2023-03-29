package org.testing.testCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.Helper.JsonParsingUsingJsonPath;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.HandleJsonFile;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesLoad;
import org.testing.utilities.RandomData;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class TC1_PostRequest {
	static String returnidValue;

	@Test
public static void testcase1() throws IOException {
	
	Properties P = PropertiesLoad.handleProperties("../APIFirstAutomation/URI.properties");
	String Body = HandleJsonFile.readJson("..//APIFirstAutomation/src/main/java/org/testing/resources/InputPayload.json");
	String ReplacedBody=JsonReplacement.replaceJsonData(Body, "id", RandomData.GenerateRandomData());
	HTTPMethods http= new HTTPMethods(P);
	Response res= http.postRequest(ReplacedBody, "QA_URI");
	returnidValue = JsonParsingUsingJsonPath.ExtractJson(res,"id");
	

}
}
