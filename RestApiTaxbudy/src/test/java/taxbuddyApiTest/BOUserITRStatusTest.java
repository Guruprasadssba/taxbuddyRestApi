package taxbuddyApiTest;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic_Utility.BaseClass;
import generic_Utility.ExtentTestManagerExtent;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class BOUserITRStatusTest extends BaseClass
{
	@Test
	public void UpdateUserITRStatusTest()
	{
		String payload="{ \"statusId\": 18, \r\n"
				+ "    \"userId\": 719913,\r\n"
				+ "    \"assessmentYear\": \"2023-2024\",\r\n"
				+ "    \"completed\": true,\r\n"
				+ "    \"serviceType\": \"ITR\"}";

		baseURI="https://api.taxbuddy.com";
		ValidatableResponse response = given()
				.header("content-type","application/json").body(payload)
				.when()
				.post("/user/itr-status")
				.then().assertThat().statusCode(201).log().all();
		
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Test Case Name : UpdateUserITRStatusTest");
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response is : " + response.extract().asString());

	}


}
