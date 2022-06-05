package API_Testing;
import org.testng.annotations.Test;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

 class Get_Method01 {
	
	@Test
   public void getcustomer()
	{
		
		given()
		.when()
			 .get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.assertThat().body("City",equalTo("Hyderabad"))
			.header("Content-type","application/json");
		
	}

	}
