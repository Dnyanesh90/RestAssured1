package Tutorial8;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo5 {

	public static void main(String[] args) {
		RestAssured.baseURI ="http://localhost:3000/posts";
		RequestSpecification httpRequest =RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		
		JSONObject json =new JSONObject();
		
		json.put("FirstName", "Ramakant");
		json.put("LastName", "Tumberphale");
		json.put("Job", "Teacher");
		json.put("Address", "Nanded");
		
		httpRequest.body(json.toString());
		
		Response resp =httpRequest.post();
		
		System.out.println(resp.jsonPath().getString("id"));
		
		System.out.println(resp.statusCode());
		System.out.println(resp.getStatusLine());
		System.out.println(resp.getBody().asString());

	}

}
