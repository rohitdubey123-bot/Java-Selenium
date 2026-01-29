package Agilecrm_ApiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Contact_id {

	public static void main(String[] args) {
	Response respjson=RestAssured.given().auth().basic("dubey@agilecrm.com", "dubey@123")
	.accept("application/json").get("https://agilecrmfree.agilecrm.com/dev/api/contacts/5033639185940480");

	String getbody=respjson.getBody().asPrettyString();
	System.out.println(getbody);
	System.out.println(respjson.getStatusCode());
	
	}

}
