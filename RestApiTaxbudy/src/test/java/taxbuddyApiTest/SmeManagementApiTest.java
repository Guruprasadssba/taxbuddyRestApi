/*package taxbuddyApiTest;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic_Utility.ExtentTestManagerExtent;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class SmeManagementApiTest 
{
	@Test
	public void AssignedSmeTest()
	{
		baseURI="https://uat-api.taxbuddy.com";
		ValidatableResponse response = given()
				.queryParam("page", 0)
				.queryParam("pageSize", 30)
				.queryParam("assigned", "true")
				.when()
				.get("/user/sme-details-new/3000")
				.then()
				.assertThat().statusCode(200).log().all();
		
	
		
//		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Test Case Name :AssignedSmeTest");
//		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response is : " + response.extract().asString());
	}
	
	
	@Test
	public void UnAssignedSmeTest()
	{
		baseURI="https://uat-api.taxbuddy.com";
		ValidatableResponse response = given()
				.queryParam("page", 0)
				.queryParam("pageSize", 30)
				.queryParam("assigned", "false")
				.when()
				.get("/user/sme-details-new/3000")
				.then()
				.assertThat().statusCode(200).log().all();
		
//		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Test Case Name :UnAssignedSmeTest");
//		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response is : " + response.extract().asString());
	
	}
	
	@Test
	public void ReAssignedSmeTest()
	{
		baseURI="https://uat-api.taxbuddy.com";
		ValidatableResponse response = given()
				.queryParam("page", 0)
				.queryParam("pageSize", 20)
				.queryParam("active", "false")
				.when()
				.get("/user/sme-details-new/3000")
				.then()
				.assertThat().statusCode(200).log().all();
		
//		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Test Case Name :ReAssignedSmeTest");
//		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response is : " + response.extract().asString());
	
	}
}
*/