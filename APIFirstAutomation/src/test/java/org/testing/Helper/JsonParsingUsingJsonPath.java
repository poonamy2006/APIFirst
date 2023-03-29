package org.testing.Helper;

import io.restassured.response.Response;

public class JsonParsingUsingJsonPath {
	
public static String ExtractJson(Response res, String JsonPath) {
		String extractedValue = res.jsonPath().get(JsonPath);
		return extractedValue;
	}

}
