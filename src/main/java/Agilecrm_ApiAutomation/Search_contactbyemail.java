package Agilecrm_ApiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Search_contactbyemail {

	public static void main(String[] args) {
		Response emailcontact=RestAssured.given().auth().basic("dubey@agilecrm.com", "dubey@123")
		.accept("application/json").get("https://agilecrmfree.agilecrm.com/dev/api/contacts/search/email/rohit@walt.ltd");
				 
		
		String contactemail=emailcontact.getBody().asPrettyString();
		System.out.println(contactemail);
		System.out.println(emailcontact.statusCode());
	}

}
