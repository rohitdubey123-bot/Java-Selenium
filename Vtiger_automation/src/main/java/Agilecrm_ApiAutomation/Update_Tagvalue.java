package Agilecrm_ApiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Update_Tagvalue {

	public static void main(String[] args) {
		
		String Edittag="{\r\n"
				+ "    \"id\": \"5144207213395968\",\r\n"
				+ "    \"tags\": [\r\n"
				+ "        \"bhadohi\",\r\n"
				+ "        \"aurai\"\r\n"
				+ "    ]\r\n"
				+ "}";
		
		Response edittagvalue=RestAssured.given().auth().basic("dubey@agilecrm.com", "dubey@123")
		.contentType("application/json").accept("application/json").body(Edittag).put("https://agilecrmfree.agilecrm.com/dev/api/contacts/edit/tags");

		String tagvalue=edittagvalue.getBody().asPrettyString();
		System.out.println(tagvalue);
		System.out.println(edittagvalue.statusCode());
	}

}
