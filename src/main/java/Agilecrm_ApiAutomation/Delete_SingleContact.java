package Agilecrm_ApiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Delete_SingleContact {

	public static void main(String[] args) {
		Response Delsinglecontact=RestAssured.given().auth().basic("dubey@agilecrm.com", "dubey@123")
		.contentType("application/json").accept("application/json").delete("https://agilecrmfree.agilecrm.com/dev/api/contacts/5144207213395968");

		String deletecontact=Delsinglecontact.getBody().asPrettyString();
		System.out.println(deletecontact);
		System.out.println(Delsinglecontact.statusCode());
	}

}
