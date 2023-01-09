package Tutorial2;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostDemo1 {

	
	public static void main(String[] args) {
		
		RestAssured.baseURI = "http://localhost:3000/posts";

		RequestSpecification httpRequest = RestAssured.given();

		httpRequest.header("Content-Type", "application/json");

		JSONObject json = new JSONObject();
		json.put("First Name", "Vrushali");
		json.put("Last Name", "Solanke");
		json.put("Address", "Pune");
		json.put("Job", "Automation Tester");

		httpRequest.body(json.toString());

		Response resp = httpRequest.post();

		System.out.println(resp.getStatusCode());

		System.out.println(resp.getStatusLine());

		System.out.println(resp.body().asString());

		Headers allheaders = resp.headers();

		for (Header abc : allheaders) {
			System.out.println(abc.getName() + ":: " + abc.getValue());
		}

		System.out.println("----------------------------------------------");
		String  id =resp.jsonPath().getString("id");
	
		System.out.println("new created user emp id is "+id);
		
		
		

	}

}
