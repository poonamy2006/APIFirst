package  org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

//input data-----response body data
//output data ----only id values of all objects
//purpose-----extract only id values from response

public class JsonParseUsingOrgJson {
	
	public static void ExtractData(String ResponseBody, String keyName) {
		
JSONArray ja= new JSONArray(ResponseBody);
int L= ja.length();
for(int i=0; i<L; i=i+1) {
JSONObject jo=ja.getJSONObject(i);
System.out.println(jo.get(keyName));
			
	
}
		
		
	}
	
	
	

}
