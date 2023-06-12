package taxbuddyApiTest;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic_Utility.BaseClass;
import generic_Utility.ExtentTestManagerExtent;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class BO_GetNewUserListApiTest extends BaseClass
{
	@Test
	public void NewUserListBOApiTest()
	{
		baseURI="https://api.taxbuddy.com" ;
		Response response = given()
				.queryParam("page", 0)
				.queryParam("pageSize", 20)
				.when()
				.get("/report/1064/user-list-new");
		ValidatableResponse validateresponse = response.then().assertThat().statusCode(200).log().all();

		// Validate response time
		ApiValidationUtilsTest.validateResponseTimeNonCritical(response, 1000L);

		if (response.jsonPath().getBoolean("success")==true) 
		{
			System.out.println("Testcase is pass");
		}
		else
		{
			System.out.println("Testcase is failed");
		}

		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Test Case Name :NewUserListBOApiTest");
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response time is in Ms : " + response.getTime());
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Status code is : " + response.getStatusCode());
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response is : " + validateresponse.extract().asString());


	}
}
