package Tutorial2;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostDemo3 {
	
	static Response resp;
	static RequestSpecification httpRequest;

	public static void main(String[] args) {
		RestAssured.baseURI = "https://reqres.in/api/users/2";
		httpRequest = RestAssured.given();

		httpRequest.header("Content-Type", "application/json");

		ExcelReader excel = new ExcelReader("C:\\Users\\kadam\\OneDrive\\Desktop\\Desktop\\Interview Exel update.xlsx");

		String fname = excel.getData(0, 1, 0);

		String lname = excel.getData(0, 1, 1);

		String add = excel.getData(0, 1, 2);

		String job = excel.getData(0, 1, 3);

		String abc = UtilsClass.addEmployeeFunctionalityData(fname, lname, add, job);

		httpRequest.body(abc);

		resp = httpRequest.post();

		System.out.println(resp.getStatusCode());
		System.out.println(resp.getStatusLine());

		System.out.println(resp.getBody().asString());


	}

}
