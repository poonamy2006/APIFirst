package org.testing.testSteps;

import static io.restassured.RestAssured.*;
import java.util.Properties;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

//input data-----request body and uri key
//purpose -------to hit post request 
//output---void 

public class HTTPMethods {
  Properties pr;
	public HTTPMethods (Properties pr)
	 {
	  this.pr=pr;
    	}
	
public Response postRequest(String bodyData, String uriKey)
{
String uriValue = pr.getProperty(uriKey);	
Response res = 
given()
.contentType(ContentType.JSON)
.body(bodyData)
.when()
 .post(uriValue);
System.out.println("The status code is ");
System.out.println(res.statusCode());
return res;
}
	

public Response GetAllRequest(String uriKey) {
String uriValue=  pr.getProperty(uriKey);
Response res =
given()
.contentType(ContentType.JSON)
.when() 
.get(uriValue);
System.out.println("The status code is ");
System.out.println(res.statusCode());

System.out.println("response is "+res.asString());

return res;
	}
	



public Response GetParticular(String uriKey, String endpoint) {
String uriValue=  pr.getProperty(uriKey)+"/"+ endpoint;
Response res =
given()
.contentType(ContentType.JSON)
.when() 
.get(uriValue);
System.out.println("The status code is ");
System.out.println(res.statusCode());
System.out.println("response is "+res.asString());
return res;
	}



public Response PutRequest(String bodyData , String URIKey,String endpoint) {
	String UriValue = pr.getProperty(URIKey) + "/" + endpoint;
	Response res=
	given()
	.contentType(ContentType.JSON)
	.body(bodyData)
	.when()
	.put(UriValue);
	System.out.println("The Status code is " +res.getStatusCode());
	System.out.println(res.asString());
	return res;
	
}



public void DeleteRequest(String urikey, String endpoint) {
String uriValue = pr.getProperty(urikey) + "/" + endpoint;	
Response res = 
given()
.contentType(ContentType.JSON)
.when()
.delete(uriValue);
System.out.println("The status code is ");
System.out.println(res.statusCode());
System.out.println(res.asString());
	}



}