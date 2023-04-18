package taxbuddyApiTest;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic_Utility.BaseClass;
import generic_Utility.ExtentTestManagerExtent;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class SmeManagementApiTest extends BaseClass
{
	@Test
	public void SmeManagementAssignedSmeTest() 
	{
		baseURI="https://api.taxbuddy.com";
		Response response = given()
				.queryParam("page", 0)
				.queryParam("pageSize", 30)
				.queryParam("assigned", true)
				.when()
				.get("/user/sme-details-new/1064");
		
		ValidatableResponse validateresponse = response.then().assertThat().statusCode(200).log().all();

		if (response.jsonPath().getBoolean("success")==true) 
		{
			System.out.println("Testcase is pass");
		}
		else
		{
			System.out.println("Testcase is failed");
		}    

		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Test Case Name :SmeManagementAssignedSmeTest");
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response is : " + validateresponse.extract().asString());
		
	}
}
