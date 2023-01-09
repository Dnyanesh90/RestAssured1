package Tutorial5;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {

	public static void main(String[] args) {
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification httpRequest =RestAssured.given();
		httpRequest.contentType("application/json");
		
		JSONObject json =new JSONObject();
		json.put("FirstName", "Amit");
		json.put("LastName", "Patil");
		json.put("Job", "Test Lead");
		json.put("Address", "Pune");

		httpRequest.body(json.toString());
		
		Response resp =httpRequest.put("/posts/22");
		
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
