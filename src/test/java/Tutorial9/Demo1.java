package Tutorial9;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {

	public static void main(String[] args) {
		RestAssured.baseURI ="http://localhost:3000/posts";
		RequestSpecification httpRequest =RestAssured.given();
		
		httpRequest.header("Content-Type", "application/json");
		
		JSONObject json =new JSONObject();
		json.put("FirstName", "Parmeshwar");
		json.put("LastName", "Kadam");
		json.put("Job", "Business Analyst");
		json.put("Addresse", "Pune");
		
		httpRequest.body(json.toString());
		Response resp =httpRequest.post();
		
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getStatusLine());
		System.out.println(resp.body().asString());
		
		
		

	}

}
