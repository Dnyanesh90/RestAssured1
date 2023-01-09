package Tutorial6;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {

	public static void main(String[] args) {
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification httpRequest =RestAssured.given();
		httpRequest.contentType("application/json");
		
		JSONObject json =new JSONObject();
		json.put("Address", "Latur");
		
		httpRequest.body(json.toString());
		
		Response resp =httpRequest.patch("/posts/5");
		
		System.out.println(resp.statusCode());
		System.out.println(resp.statusLine());
		System.out.println(resp.body().asString());
	
	}

}
