package Tutorial1;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getDemo1 {

	public static void main(String[] args) {
		//Specificy the base url
        RestAssured.baseURI="https://reqres.in/api/users";
         //get the RequestSpecificatio object to hit the request
        RequestSpecification httpRequest =RestAssured.given();

        Response resp =httpRequest.request(Method.GET);
        //Status code
        //status line
        //response body
        //header
        //size

        int a =resp.getStatusCode();
        System.out.println(a);//200

        System.out.println(resp.getStatusLine());

        //return response body
        String c =resp.getBody().asString();

        System.out.println(c);


	}

}
