package Tutorial8;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class Demo1 {

	public static void main(String[] args) {
        RestAssured.baseURI="http://localhost:3000";
		
		Response resp =RestAssured.given().when().delete("/posts/18");
		System.out.println(resp.statusCode());
		System.out.println(resp.statusLine());
		
		Headers allheader =resp.headers();
		for(Header abc:allheader)
		{
			System.out.println(abc.getName()+":::"+abc.getValue());
			
		}
		
		
	}

}
