package Tutorial5;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo2 {

	public static String testData(String fname,String lname,String job,String add)
	{
		JSONObject json =new JSONObject();
		json.put("FirstName", fname);
		json.put("LastName", lname);
		json.put("Job", job);
		json.put("Address", add);

		return json.toString();
		
	}

	public static void main(String[] args) {
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification httpRequest =RestAssured.given();
		httpRequest.contentType("application/json");
		
		httpRequest.body(Demo2.testData("vinod", "patil", "sr test engineer", "Pune"));
		
		Response resp =httpRequest.put("/posts/2");
		
		System.out.println(resp.statusCode());
		System.out.println(resp.statusLine());
		System.out.println(resp.body().asString());
		
		Headers allheaders =resp.headers();
		
		for(Header abc:allheaders)
		{
			System.out.println(abc.getName()+"::"+abc.getValue());
		}
		
	
	}

}
