package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

public class TC_VideoGameAPITC {
	
	@Test(priority=1)
	public void test_getAllVideoGames() {
		
		given()
		
		  .when()
		  	  .get("http://localhost:8080/app/videogames")
		  	  
		  .then()
		  		.statusCode(200);
		
	}
	
	@Test(priority=2)
	public void test_addNewVideoGame() {
		
		HashMap data=new HashMap();
		data.put("id", "105");
		data.put("name", "Badri");
		data.put("releaseDate", "2022-05-13T08:55:58.510Z");
		data.put("reviewScore", "5");
		data.put("category", "Action");
		data.put("rating", "Universal");
		
		Response res=
			given()
				.contentType("application/json")
				.body(data)
			.when()
				.post("http://localhost:8080/app/videogames")
					
					.then()
						.statusCode(200)
						.log().body()
						.extract().response();
		
		String jsonString=res.asString();
		Assert.assertEquals(jsonString.contains("Record Added Successfully"), true);
	}
	
	@Test(priority=3)
	public void test_getVideoGame() {
		
		given()
			.when()
				.get("http://localhost:8080/app/videogames/105")
			.then()
				.statusCode(200)
				.log().body()
				.body("videoGame.id", equalTo("105"))
				.body("videoGame.name", equalTo("Badri"));
				
	}
	
	@Test(priority=4)
	public void test_UpdateVideoGame() {
		
		HashMap data=new HashMap();
		data.put("id", "105");
		data.put("name", "JamesBond");
		data.put("releaseDate", "2022-05-14T08:55:58.510Z");
		data.put("reviewScore", "5");
		data.put("category", "Action");
		data.put("rating", "Universal");
		
		given()
			  .contentType("application/json")
			  .body(data)
		 .when()
		 	  .put("http://localhost:8080/app/videogames/105")
		 .then()
		 	  .statusCode(200)
		 	  .log().body()
		 	  .body("videoGame.id", equalTo("105"))
		 	  .body("videoGame.name", equalTo("JamesBond"));
	}
	
	@Test(priority=5)
	public void test_DeleteVideoGame() throws InterruptedException {
		
		Response res=
		given()
			.when()
				.delete("http://localhost:8080/app/videogames/105")
			.then()
				.statusCode(200)
				.log().body()
				.extract().response();
		
		Thread.sleep(3000);
		String jsonString=res.asString();
		Assert.assertEquals(jsonString.contains("Record Deleted Successfully"), true);
	}

}
