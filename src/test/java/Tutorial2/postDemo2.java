package Tutorial2;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class postDemo2 {

	Response resp;
	RequestSpecification httpRequest;
	String id;

	@BeforeClass
	public void setUp() {
		RestAssured.baseURI = "http://localhost:3000/posts/";
		httpRequest = RestAssured.given();

		httpRequest.header("Content-Type", "application/json");

		//httpRequest.body(UtilsClass.addEmployeeFunctionalityData("Amit", "Sahu", "Pune", "Automation Tester"));

		resp = httpRequest.post();
	}

	@Test(priority = 1)
	public void validateStatusCode() {
		Assert.assertEquals(resp.getStatusCode(), 201);
	}

	@Test(priority = 2)
	public void validateStatusLine() {
		Assert.assertEquals(resp.getStatusLine().contains("Created"), true);
	}

	@Test(priority = 3)
	public void validateResponseBody() {
		Assert.assertEquals(resp.getBody().asString().contains("Amit"), true);
	}

	@Test(priority = 4)
	public void validateContentTypeHeader() {

		String a = resp.header("Content-Type");
		Assert.assertEquals(a, "application/json; charset=utf-8");
	}

	@Test(priority = 5)
	public void validateNewCreatedUserUsingGet() {
		System.out.println("Print all data using get Request................");
		String id = resp.jsonPath().getString("id");
		resp = httpRequest.get(id);

		Assert.assertEquals(resp.getStatusCode(), 200);
	}

	@Test(priority = 6)
	public void validateStatusLineUsingGet() {
		Assert.assertEquals(resp.getStatusLine().contains("OK"), true);
	}

	@Test(priority = 7)
	public void validateResponseBodyusingGet() {
	Assert.assertEquals(resp.getBody().asString().contains("Amit"), true);
	}

}
