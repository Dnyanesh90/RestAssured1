package Tutorial3;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {

	public static void main(String[] args) {
		//Specific base url
		
				RestAssured.baseURI="http://localhost:3000/posts";
				
				//get Request Specifiction Object
				
				RequestSpecification httpRequest =RestAssured.given();
				
				//hit the Request
				
				Response resp =httpRequest.get();
				
				System.out.println(resp.getStatusCode());
				
				System.out.println(resp.getStatusLine());
				
	}

}
