package Tutorial10;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/api/users";
		RequestSpecification httpRequest =RestAssured.given();
		Response resp =httpRequest.request(Method.GET);
		int a =resp.getStatusCode();
		System.out.println(a);
		
		String b =resp.getStatusLine();
		System.out.println(b);
		
		String c= resp.getBody().asString();
		System.out.println(c);

	}

}
