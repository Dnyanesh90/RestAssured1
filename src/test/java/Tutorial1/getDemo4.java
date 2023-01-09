package Tutorial1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getDemo4 {

	public static void main(String[] args) {

		RestAssured.baseURI="https://reqres.in/api/users/2";

        RequestSpecification httpRequest=RestAssured.given();

        Response resp =httpRequest.get("/posts/3");

        System.out.println(resp.getStatusCode());

        System.out.println(resp.getStatusLine());

        System.out.println(resp.getBody().asString());

	}

}
