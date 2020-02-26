package com.marcospds;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class ExampleResourceTest {

	@Test
	public void testHelloEndpoint() {
		given().when().get("/lines").then().statusCode(200);
	}
}