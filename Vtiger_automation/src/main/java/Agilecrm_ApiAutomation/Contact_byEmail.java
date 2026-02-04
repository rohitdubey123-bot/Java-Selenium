package Agilecrm_ApiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Contact_byEmail {

	public static void main(String[] args) {
		Response contactmail=RestAssured.given().auth().basic("dubey@agilecrm.com", "dubey@123")
				.contentType("application/x-www-form-urlencoded").accept("application/json").formParam("email_ids", "rohit@walt.ltd").when().get("https://agilecrmfree.agilecrm.com/dev/api/contacts/search/email");
						

		String email=contactmail.getBody().asPrettyString();
		System.out.println(email);
		System.out.println(contactmail.statusCode());
	}

}
