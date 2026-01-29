package Agilecrm_ApiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Update_StarValue {

	public static void main(String[] args) {
		
		String UpdateStarValue="{\r\n"
				+ "    \"id\": \"4884325318983680\",\r\n"
				+ "    \"star_value\": 3\r\n"
				+ "}";
		
		Response updateStarvalues=RestAssured.given().auth().basic("dubey@agilecrm.com", "dubey@123")
		.contentType("application/json").accept("application/json").body(UpdateStarValue).post("https://agilecrmfree.agilecrm.com/dev/api/contacts");
		
		String Starvalue=updateStarvalues.getBody().asPrettyString();
		System.out.println(Starvalue);
		System.out.println(updateStarvalues.statusCode());

	}

}
