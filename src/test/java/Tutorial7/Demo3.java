package Tutorial7;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class Demo3 {

	public static void main(String[] args) {
        RestAssured.baseURI="http://localhost:3000";
		
		Response resp =RestAssured.given().when().get("/posts/2");
		
		System.out.println(resp.statusCode());
		System.out.println(resp.statusLine());
		
		System.out.println(resp.body().asString());
		
		Headers allheader =resp.headers();
		
		for(Header abc:allheader)
		{
			System.out.println(abc.getName());
			System.out.println(abc.getValue());
		}
	}

}
