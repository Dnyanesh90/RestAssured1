package Tutorial1;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
public class getDemo6 {

	public static void main(String[] args) {
        RestAssured.baseURI="https://reqres.in/api/users/2";

        given().get("posts/2")

        .then().assertThat().statusCode(200).statusLine("HTTP/1.1 200 OK").log().all();

	}

}
