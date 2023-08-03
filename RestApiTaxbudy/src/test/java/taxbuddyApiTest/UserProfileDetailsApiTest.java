package taxbuddyApiTest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic_Utility.BaseClass;
import generic_Utility.ExtentTestManagerExtent;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class UserProfileDetailsApiTest extends BaseClass
{
	@Test
	public void GetUserProfileDetailsApiTest()
	{
		baseURI="https://api.taxbuddy.com";
		Response response = given()
				.auth().oauth2("wxdM4LaOmh")
				.when()
				.get("/user/profile/803551");
		ValidatableResponse validateResp = response.then().assertThat().statusCode(200).log().all();

		// Validate response time 
		ApiValidationUtilsTest.validateResponseTimeNonCritical(response, 1000L);

		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Test Case Name :GetUserProfileDetailsApiTest");
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response time is in Ms : " + response.getTime());
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Status code is : " + response.getStatusCode());
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response is : " + validateResp.extract().asString());

	}
}
