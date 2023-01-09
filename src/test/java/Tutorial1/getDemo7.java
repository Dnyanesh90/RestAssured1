package Tutorial1;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getDemo7 {

	 @Test
     public void abc() {

            RestAssured.baseURI="https://reqres.in/api/users";

            RequestSpecification httpRequest =RestAssured.given();

            Response resp =httpRequest.get();

            int a=resp.getStatusCode();

            Assert.assertEquals(a, 200);
        System.out.println(resp.getStatusLine());


       String b =resp.getBody().asString();
       System.out.println(b);
       boolean c=b.contains("Ajit");
       System.out.println(c);
      // Assert.assertEquals(c, true);


	}

}
