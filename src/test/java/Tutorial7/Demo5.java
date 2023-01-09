package Tutorial7;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class Demo5 {

	public static void main(String[] args) throws JsonProcessingException {
		CreateEmployee createuser=new CreateEmployee();
		
		createuser.setFirstName("Aniket");
		createuser.setLastName("Patil");
		createuser.setAddress("Mumbai");
		createuser.setJob("Team Leader");
		
		
		
		ObjectMapper mapper =new ObjectMapper();
		
		String a=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(createuser);
		
		System.out.println(a);
		
	
		
		RestAssured.baseURI = "http://localhost:3000";

		Response resp = RestAssured.given().contentType(ContentType.JSON).body(a).when().post("/posts");

		System.out.println(resp.statusCode());
		System.out.println(resp.statusLine());
		System.out.println(resp.body().asString());

		Headers allheader = resp.headers();

		for (Header abc : allheader) {
			System.out.println(abc.getName());
			System.out.println(abc.getValue());
		}

	}

}