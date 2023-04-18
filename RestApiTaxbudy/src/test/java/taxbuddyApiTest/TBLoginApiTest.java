/*package taxbuddyApiTest;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic_Utility.BaseClass;
import generic_Utility.ExtentTestManagerExtent;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class TBLoginApiTest extends BaseClass
{
	@Test
	public void TbUserLoginApiTest()
	{
		String payload="{ \"tbPlatform\": \"website\",\r\n"
				+ "    \"uniqueId\": \"GA1.1.176377889.1680670581\",\r\n"
				+ "    \"userId\": 719913}";

		baseURI="https://api.taxbuddy.com";  
		Response response = given()
				.header("content-type","application/json").body(payload)
				.when()
				.post("/user/user-login-details");
		ValidatableResponse validateRes = response.then().assertThat().statusCode(200).log().all();

		if (response.jsonPath().getBoolean("success")==true) 
		{
			System.out.println("Testcase is pass");
		}
		else
		{
			System.out.println("Testcase is failed");
		}

		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Test Case Name : TbUserLoginApiTest");
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response is : " + validateRes.extract().asString());
	}
}
*/