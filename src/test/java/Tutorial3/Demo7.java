package Tutorial3;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Demo7 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		RestAssured.baseURI = "http://localhost:3000";

		RequestSpecification httpRequest = RestAssured.given();

		Response resp = httpRequest.get("/posts/16");

		int actualStatusCode = resp.getStatusCode();
		System.out.println(actualStatusCode);

		String actualStatusLine = resp.getStatusLine();
		System.out.println(actualStatusLine);

		ResponseBody respbody = resp.getBody();

		boolean a = respbody.asString().contains("Parmeshwar");

		System.out.println(a);

		boolean b = respbody.asString().contains("Kadam");
		System.out.println(b);

		String c = respbody.jsonPath().getString("id");

		System.out.println(c);

		Headers allheader = resp.getHeaders();

		for (Header abc : allheader) {
			System.out.println(abc.getName());
		 System.out.println(abc.getValue());

			System.out.println(abc.getName() + " :: " + abc.getValue());
		}

		String d =resp.contentType();
		
		System.out.println(d);
		

	}

}
