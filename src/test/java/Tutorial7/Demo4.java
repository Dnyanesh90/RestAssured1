package Tutorial7;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class Demo4 {

	public static void main(String[] args) {
		JSONObject json = new JSONObject();
		json.put("FirstName", "Akash");
		json.put("LastName", "Kawde");
		json.put("Address", "Pune");
		json.put("Job", "test Engineer");

		RestAssured.baseURI = "http://localhost:3000/posts";

		Response resp = RestAssured.given().contentType(ContentType.JSON).body(json.toString()).when().post();

		System.out.println(resp.statusCode());
		System.out.println(resp.statusLine());
		System.out.println(resp.body().asString());

		Headers allheader = resp.headers();

		for (Header abc : allheader) {
			System.out.println(abc.getName());
			System.out.println(abc.getValue());
		}

	}

}
