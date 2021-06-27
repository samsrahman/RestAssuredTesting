package Re_assuredDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class TC_01_GET {

	@Test
	public void test1() {
	Response r=RestAssured.get("https://reqres.in/api/users?page=2");
		
		System.out.println(r.getStatusCode());
		System.out.println(r.getBody().asString());
		// Verify Status code 
		int sc=r.getStatusCode();
		Assert.assertEquals(sc, 200);
		System.out.println("done");
	}
	
	@Test
	void test02() {
		
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.id[0]", equalTo(6));
		
	}
}
