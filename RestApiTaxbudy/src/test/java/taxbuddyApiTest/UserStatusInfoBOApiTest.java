package taxbuddyApiTest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic_Utility.BaseClass;
import generic_Utility.ExtentTestManagerExtent;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class UserStatusInfoBOApiTest extends BaseClass
{
	@Test
	public void GetUserStatusInfoApiTest()
	{
		baseURI="https://api.taxbuddy.com";
		Response response = given()
				.when()
				.get("/user/status-info/9900476901");
		ValidatableResponse validateRes = response.then().assertThat().statusCode(200).log().all();

		if (response.jsonPath().getBoolean("success")==true) 
		{
			System.out.println("Testcase is pass");
		}
		else
		{
			System.out.println("Testcase is failed");
		}

		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Test Case Name :AgentAssignmentITRTest");
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response is : " + validateRes.extract().asString());

	}
}
