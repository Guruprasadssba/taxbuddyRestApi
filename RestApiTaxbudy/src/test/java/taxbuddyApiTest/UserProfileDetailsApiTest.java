package taxbuddyApiTest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic_Utility.BaseClass;
import generic_Utility.ExtentTestManagerExtent;
import io.restassured.response.ValidatableResponse;

public class UserProfileDetailsApiTest extends BaseClass
{
	@Test
	public void GetUserProfileDetailsApiTest()
	{
		baseURI="https://api.taxbuddy.com";
		ValidatableResponse response = given()
				.when()
				.get("/user/profile/719913")
				.then().assertThat().statusCode(200).log().all();

		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Test Case Name :AgentAssignmentITRTest");
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response is : " + response.extract().asString());

	}
}
