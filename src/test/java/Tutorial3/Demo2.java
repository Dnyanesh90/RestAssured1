package Tutorial3;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo2 {

	public static void main(String[] args) {
          //Specific base url
		
		RestAssured.baseURI="https://reqres.in/api/users/2";
		
		//get Request Specifiction Object
		
		RequestSpecification httpRequest =RestAssured.given();
		
		//hit the Request
		
		Response resp =httpRequest.request(Method.GET);
		
		System.out.println(resp.getStatusCode());
		
		System.out.println(resp.getStatusLine());
		

	}

}
