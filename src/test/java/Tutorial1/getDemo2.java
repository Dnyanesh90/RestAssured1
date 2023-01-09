package Tutorial1;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getDemo2 {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/api/users";

        RequestSpecification httpRequest =RestAssured.given();

        Response resp =httpRequest.request(Method.GET);

        System.out.println(resp.getStatusCode());

        System.out.println(resp.getStatusLine());
             String a=resp.getBody().asString();
            System.out.println(a);

	}

}
