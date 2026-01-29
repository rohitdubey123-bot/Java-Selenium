package Agilecrm_ApiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Restassured_Listing_Contact {

	public static void main(String[] args) {
		Response resp=RestAssured.given().auth().basic("dubey@agilecrm.com", "dubey@123")
		.accept("application/json").get("https://agilecrmfree.agilecrm.com/dev/api/contacts");
		
		String respons=resp.getBody().asPrettyString();
		System.out.println(respons);
		System.out.println(resp.statusCode());
			
	}

}
