package taxbuddyApiTest;

/*import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic_Utility.BaseClass;
import generic_Utility.ExtentTestManager;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;


public class AgentAssignmentTest 
{

	@Test
	public void AgentAssignapiITRTest()
	{
		baseURI="https://api.taxbuddy.com";
		ValidatableResponse response = given()
				.queryParam("userId", 619930)
				.queryParam("assessmentYear", 2022-2023)
				.queryParam("serviceType", "ITR")
				.when()
				.get("/user/sme/agent-assignment")
				.then()
				.assertThat().statusCode(200).log().all();

	

		//ExtentTestManager.getTest().log(LogStatus.INFO, "Test Case Name :AgentAssignmentITRTest");
		//ExtentTestManager.getTest().log(LogStatus.INFO, "Response is : " + response.extract().asString());


	}
	
	@Test
	public void AgentAssignapiGSTTest()
	{
		baseURI="https://api.taxbuddy.com";
		ValidatableResponse response = given()
				.queryParam("userId", 619930)
				.queryParam("assessmentYear", 2022-2023)
				.queryParam("serviceType", "GST")
				.when()
				.get("/user/sme/agent-assignment")
				.then()
				.assertThat().statusCode(200).log().all(); 


		//ExtentTestManager.getTest().log(LogStatus.INFO, "Test Case Name :AgentAssigmentGSTTest ");
		//ExtentTestManager.getTest().log(LogStatus.INFO, "Response is : " + response.extract().asString());

	}

	@Test
	public void AgentAssignapiNoticeTest()
	{
		baseURI="https://api.taxbuddy.com";
		ValidatableResponse response = given()
				.queryParam("userId", 619930)
				.queryParam("assessmentYear", 2022-2023)
				.queryParam("serviceType", "NOTICE")
				.when()
				.get("/user/sme/agent-assignment")
				.then()
				.assertThat().statusCode(200).log().all();


		//ExtentTestManager.getTest().log(LogStatus.INFO, "Test Case Name : AgentAssignmentNoticeTest");
		//ExtentTestManager.getTest().log(LogStatus.INFO, "Response is : " + response.extract().asString());


	}

}
*/