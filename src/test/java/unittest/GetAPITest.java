package unittest;

import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;

public class GetAPITest {
	@Test
	public void getTestInLine() {
		
		RestAssured.given().log().all().get("https://fakestoreapi.com/products").then().log().all();
		
		
		
		
		
	}

}
