package taxbuddyApiTest;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic_Utility.BaseClass;
import generic_Utility.ExtentTestManagerExtent;
import io.restassured.response.ValidatableResponse;

public class SignupNewUserTest  extends BaseClass
{

	@Test
	public void createNewuserTest()
	{
		String payload="{\"firstName\":\"Gurupr\","
				+ "\"lastName\":\"Test\","
				+ "\"email\":\"guruprasad.n@ssbainnovations.com\","
				+ "\"mobile\":\"2211448899\","
				+ "\"langKey\":\"en\","
				+ "\"authorities\":[\"ROLE_USER\"],"
				+ "\"cognitoId\":\"256f8ebe-d2ce-473f-a778-adaea56f2e42\","
				+ "\"source\":\"WEB\","
				+ "\"initialData\":\"mobile=2211448899&serviceType=ITR\","
				+ "\"serviceType\":\"ITR\","
				+ "\"countryCode\":\"+91\","
				+ "\"language\":\"English\"}";

		baseURI="https://api.taxbuddy.com";
		ValidatableResponse response = given()
				.header("content-type","application/json").body(payload)
				.when().post("/user/user_account")
				.then().assertThat().statusCode(201).log().all();

		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Test Case Name : SignupNewuserTest");
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response is : " + response.extract().asString());


	}
}
