package Re_assuredDemo;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class TC_01POST {

	
	@Test
	void test_01p() {
		Map<String, Object> val= new HashMap<String, Object>() ;
		val.put("name", "samsur");
		val.put("job", "tech");
		
		JSONObject r=new JSONObject(val);
		//System.out.println(r.toJSONString());
		
		given().
		body(r.toJSONString()).
		when().post("https://reqres.in/api/users")
		.then().statusCode(201).log().all();
	}
	@Test
	void test_02p() {
		Map<String, Object> val= new HashMap<String, Object>() ;
		val.put("name", "sams3ur");
		val.put("job", "tech");
		
		JSONObject r=new JSONObject(val);
		//System.out.println(r.toJSONString());
		
		given().
		body(r.toJSONString()).
		when().put("https://reqres.in/api/users/2")
		.then().statusCode(200).log().all();
	}
	@Test
	void test_03p() {
		//delete
		
		
		when().delete("https://reqres.in/api/users/2")
		.then().statusCode(204).log().all();
	}
	
}
