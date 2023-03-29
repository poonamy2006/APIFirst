package org.testing.testCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.HandleJsonFile;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.Test;


public class TC4_UpdateRequest {
	
@Test
public static void testcase4() throws IOException {
Properties P = PropertiesLoad.handleProperties("../APIFirstAutomation/URI.properties");
String bodyData = HandleJsonFile.readJson("..//APIFirstAutomation/src/main/java/org/testing/resources/PutPayLoad.json");
String replaceBody=JsonReplacement.replaceJsonData(bodyData, "id", TC1_PostRequest.returnidValue);

HTTPMethods http = new HTTPMethods(P);

http.PutRequest(replaceBody, "QA_URI", TC1_PostRequest.returnidValue);
	
	}
	
	
	
	
}
