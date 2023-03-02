package taxbuddyApiTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class SampleAssignmentApiTest 
{
	//https://api.taxbuddy.com/user/sme/agent-assignment?userId=619930&assessmentYear=2022-2023&serviceType=ITR
	
		@Test (groups = "smokeTest")
		public void agentAssignmentITRTest()
		{
			RequestSpecification reqspec = RestAssured.given();
			
			//Base URL
			reqspec.baseUri("https://api.taxbuddy.com");

			//query parameters in the form of key and value
			reqspec.queryParam("userId", 619930);
			reqspec.queryParam("assessmentYear", 2022-2023);
			reqspec.queryParam("serviceType", "ITR");

			// sending the request for ITR
			Response res = reqspec.when().get("/user/sme/agent-assignment");

			// validating response
			ValidatableResponse validateRes = res.then();
			validateRes.assertThat().contentType(ContentType.JSON).statusCode(200).log().all();


		}

		@Test(groups = "smokeTest")
		public void agentAssignmentGSTTest()
		{
			RequestSpecification reqspec = RestAssured.given();
			//Base URL
			reqspec.baseUri("https://api.taxbuddy.com");

			//query parameters in the form of key and value
			reqspec.queryParam("userId", 619930);
			reqspec.queryParam("assessmentYear", 2022-2023);
			reqspec.queryParam("serviceType", "GST");

			// sending the request for GST
			Response res = reqspec.when().get("/user/sme/agent-assignment");

			// validating response
			ValidatableResponse validateRes = res.then();
			validateRes.assertThat().contentType(ContentType.JSON).statusCode(200).log().all();

		}

		@Test(groups = "smokeTest")
		public void agentAssignmentNoticeTest()
		{
			RequestSpecification reqspec = RestAssured.given();
			//Base URL
			reqspec.baseUri("https://api.taxbuddy.com");

			//query parameters in the form of key and value
			reqspec.queryParam("userId", 619930);
			reqspec.queryParam("assessmentYear", 2022-2023);
			reqspec.queryParam("serviceType", "NOTICE");

			// sending the request for Notice 
			Response res = reqspec.when().get("/user/sme/agent-assignment");

			// validating response
			ValidatableResponse validateRes = res.then();
			validateRes.assertThat().contentType(ContentType.JSON).statusCode(200).log().all();

		}
}
