package Re_assuredDemo;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class TC_02GET {
	
	@Test
	public void test01() {
		
		given()
		.get("https://reqres.in/api/users?page=2")
		.then().statusCode(200).body("data.email[0]", equalTo("michael.lawson@reqres.in"))
		.body("data.first_name", hasItem("George"))
		.log().all();
		
	}

}
