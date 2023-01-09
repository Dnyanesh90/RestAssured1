package Tutorial3;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo4 {

	public static void main(String[] args) {
        RestAssured.baseURI="http://localhost:3000";
		
		RequestSpecification httpRequst =RestAssured.given();
		
		Response resp =httpRequst.get("/posts/16");
		
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getStatusLine());
		
		System.out.println(resp.getBody().asString());
		
		

	}

}
