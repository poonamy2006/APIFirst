package org.testing.utilities;

import java.util.regex.Pattern;

//input-----string json data,replacement key , corresponding value
//purpose---to replace key with corresponding value
//output----string json data

public class JsonReplacement {
	
	public static String replaceJsonData(String JsonBody, String VariableKey, String VariableValue) {
		
		JsonBody =JsonBody.replaceAll(Pattern.quote("{{"+VariableKey+"}}"), VariableValue);
		
		return JsonBody;
	}

}
