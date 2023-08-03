package practiceTaxbbuddyApiTest;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class AgentAssignment_ITRTest 
{
	@Test
	public void agentitrTest()
	{
	 
		RequestSpecification reqspec = RestAssured.given();
		//Base URL
		reqspec.baseUri("https://api.taxbuddy.com");

		//query parameters in the form of key and value
		reqspec.queryParam("userId", 803551);
		reqspec.queryParam("assessmentYear", 2023-2024);
		reqspec.queryParam("serviceType", "ITR");
		String bearertoken = reqspec.get().getHeader("Authorization");
		System.out.println(bearertoken);
		//reqspec.auth().oauth2(bearertoken);

		// sending the request 
		Response res = reqspec.when().get("/user/agent-assignment-new");

		// validating response
		ValidatableResponse validateRes = res.then();
		validateRes.assertThat().statusCode(200).log().all();

		
	
	}
}
