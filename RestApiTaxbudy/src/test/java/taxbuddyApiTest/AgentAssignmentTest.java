/*package taxbuddyApiTest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic_Utility.BaseClass;
import generic_Utility.ExtentTestManagerExtent;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.hamcrest.Matchers;

public class AgentAssignmentTest extends BaseClass
{	

	@Test
	public void AgentAssignapiITRTest()
	{
		baseURI="https://api.taxbuddy.com";
		Response response = given()
				.queryParam("userId", 619930)
				.queryParam("assessmentYear", 2022-2023)
				.queryParam("serviceType", "ITR")
				.auth().oauth2("eyJraWQiOiJQcDloM0VtcjY5V09SdlByVWpuQXJZckxiaVVqXC9BUm5iM0pUdTIramRYVT0iLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiIxOGM2M2Y2ZC1lZjY2LTRkMTAtYTZmYy1hNzJkZWE2NGQzYTIiLCJldmVudF9pZCI6IjNlMWE0YTkyLWY2NmQtNGM0NC1hZDcyLTZkY2U0Njg3NjQyMCIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE2OTA4ODIwMDMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC5hcC1zb3V0aC0xLmFtYXpvbmF3cy5jb21cL2FwLXNvdXRoLTFfczQySGdZemFZIiwiZXhwIjoxNjkwODg1NjA0LCJpYXQiOjE2OTA4ODIwMDQsImp0aSI6ImQzZjc5NmYwLTUxNjgtNGI1MC04YzJhLTI2YWI2ODk5MWJjNSIsImNsaWVudF9pZCI6IjI4OWYwZnJoNG9qOXJwNXJoNnE5b3BvNHFuIiwidXNlcm5hbWUiOiIxOGM2M2Y2ZC1lZjY2LTRkMTAtYTZmYy1hNzJkZWE2NGQzYTIifQ.d65la4rEljzlFYIowLjbiwLUhMphVDmhx22WO151LgZb8Ba9BUaBDEMn7241XtM2LITjE92QWSPRszCHlOtf7pxrtaoTXyVcz2g6gqK11ahXWUVxem-bzDMIfGCSCaiaqM_C4pTHIQsY9-DuXOcteDiwRo8AZCgGkMaduCDZXNwV5p6SChw4Kb72fDF2RmuKlt525060_mq5sPfuqkLJ-LMIgkYBXOwUDhxg9FjCRdAiSyIom4SVzq4GZ6ywtonpjHL-dYUQgjieMsuxSmjRo_Sb7cOsq6Xg4asrH7XHqm0DG9WPa7n9p6HrGYl87A5zNYrLDCAaCGzjB7vncjsBkw")
				.when()
				.get("/user/sme/agent-assignment");
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

		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Test Case Name :AgentAssignmentITRTest");
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response time is in Ms : " + response.getTime());
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Status code is : " + response.getStatusCode());
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response is : " + validateresponse.extract().asString());

	}

	@Test
	public void AgentAssignapiGSTTest()
	{
		baseURI="https://api.taxbuddy.com";
		Response response = given()
				.queryParam("userId", 619930)
				.queryParam("assessmentYear", 2022-2023)
				.queryParam("serviceType", "GST")
				.auth().oauth2("eyJraWQiOiJQcDloM0VtcjY5V09SdlByVWpuQXJZckxiaVVqXC9BUm5iM0pUdTIramRYVT0iLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiIxOGM2M2Y2ZC1lZjY2LTRkMTAtYTZmYy1hNzJkZWE2NGQzYTIiLCJldmVudF9pZCI6IjNlMWE0YTkyLWY2NmQtNGM0NC1hZDcyLTZkY2U0Njg3NjQyMCIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE2OTA4ODIwMDMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC5hcC1zb3V0aC0xLmFtYXpvbmF3cy5jb21cL2FwLXNvdXRoLTFfczQySGdZemFZIiwiZXhwIjoxNjkwODg1NjA0LCJpYXQiOjE2OTA4ODIwMDQsImp0aSI6ImQzZjc5NmYwLTUxNjgtNGI1MC04YzJhLTI2YWI2ODk5MWJjNSIsImNsaWVudF9pZCI6IjI4OWYwZnJoNG9qOXJwNXJoNnE5b3BvNHFuIiwidXNlcm5hbWUiOiIxOGM2M2Y2ZC1lZjY2LTRkMTAtYTZmYy1hNzJkZWE2NGQzYTIifQ.d65la4rEljzlFYIowLjbiwLUhMphVDmhx22WO151LgZb8Ba9BUaBDEMn7241XtM2LITjE92QWSPRszCHlOtf7pxrtaoTXyVcz2g6gqK11ahXWUVxem-bzDMIfGCSCaiaqM_C4pTHIQsY9-DuXOcteDiwRo8AZCgGkMaduCDZXNwV5p6SChw4Kb72fDF2RmuKlt525060_mq5sPfuqkLJ-LMIgkYBXOwUDhxg9FjCRdAiSyIom4SVzq4GZ6ywtonpjHL-dYUQgjieMsuxSmjRo_Sb7cOsq6Xg4asrH7XHqm0DG9WPa7n9p6HrGYl87A5zNYrLDCAaCGzjB7vncjsBkw")
				.when()
				.get("/user/sme/agent-assignment");

		ValidatableResponse validateResponse = response.then().assertThat().statusCode(200).log().all(); 

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

		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Test Case Name :AgentAssigmentGSTTest ");
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response time is in Ms : " + response.getTime());
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Status code is : " + response.getStatusCode());
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response is : " + validateResponse.extract().asString());

	}

	@Test
	public void AgentAssignapiNoticeTest()
	{
		baseURI="https://api.taxbuddy.com";
		Response response = given()
				.queryParam("userId", 619930)
				.queryParam("assessmentYear", 2022-2023)
				.queryParam("serviceType", "NOTICE")
				.auth().oauth2("eyJraWQiOiJQcDloM0VtcjY5V09SdlByVWpuQXJZckxiaVVqXC9BUm5iM0pUdTIramRYVT0iLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiIxOGM2M2Y2ZC1lZjY2LTRkMTAtYTZmYy1hNzJkZWE2NGQzYTIiLCJldmVudF9pZCI6IjNlMWE0YTkyLWY2NmQtNGM0NC1hZDcyLTZkY2U0Njg3NjQyMCIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE2OTA4ODIwMDMsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC5hcC1zb3V0aC0xLmFtYXpvbmF3cy5jb21cL2FwLXNvdXRoLTFfczQySGdZemFZIiwiZXhwIjoxNjkwODg1NjA0LCJpYXQiOjE2OTA4ODIwMDQsImp0aSI6ImQzZjc5NmYwLTUxNjgtNGI1MC04YzJhLTI2YWI2ODk5MWJjNSIsImNsaWVudF9pZCI6IjI4OWYwZnJoNG9qOXJwNXJoNnE5b3BvNHFuIiwidXNlcm5hbWUiOiIxOGM2M2Y2ZC1lZjY2LTRkMTAtYTZmYy1hNzJkZWE2NGQzYTIifQ.d65la4rEljzlFYIowLjbiwLUhMphVDmhx22WO151LgZb8Ba9BUaBDEMn7241XtM2LITjE92QWSPRszCHlOtf7pxrtaoTXyVcz2g6gqK11ahXWUVxem-bzDMIfGCSCaiaqM_C4pTHIQsY9-DuXOcteDiwRo8AZCgGkMaduCDZXNwV5p6SChw4Kb72fDF2RmuKlt525060_mq5sPfuqkLJ-LMIgkYBXOwUDhxg9FjCRdAiSyIom4SVzq4GZ6ywtonpjHL-dYUQgjieMsuxSmjRo_Sb7cOsq6Xg4asrH7XHqm0DG9WPa7n9p6HrGYl87A5zNYrLDCAaCGzjB7vncjsBkw")
				.when()
				.get("/user/sme/agent-assignment");
		ValidatableResponse validateResponse = response.then().assertThat().statusCode(200).log().all();

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

		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Test Case Name : AgentAssignmentNoticeTest");
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response time is in Ms : " + response.getTime());
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Status code is : " + response.getStatusCode());
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response is : " + validateResponse.extract().asString());


	}

}
*/