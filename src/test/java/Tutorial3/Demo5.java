package Tutorial3;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo5 {

	public static void main(String[] args) {
        RestAssured.baseURI="http://localhost:3000/posts/16";
		
		RequestSpecification httpRequest =RestAssured.given();
		
		Response resp =httpRequest.request(Method.GET);
		
		System.out.println(resp.getStatusCode());
		
		System.out.println(resp.getStatusLine());
		
		System.out.println(resp.getBody().asString());
		

	}

}
