package Agilecrm_ApiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Delete_Tagvalue {

	public static void main(String[] args) {
	
		String Deletetagvalue="{\r\n"
				+ "    \"id\": \"5144207213395968\",\r\n"
				+ "    \"tags\": [\r\n"
				+ "        \"bhadohi\",\r\n"
				+ "        \"test2\"\r\n"
				+ "    ]\r\n"
				+ "}";
		
		Response deletetagvalue=RestAssured.given().auth().basic("dubey@agilecrm.com", "dubey@123")
				.contentType("application/json").accept("application/json").body(Deletetagvalue).put("https://agilecrmfree.agilecrm.com/dev/api/contacts/delete/tags");

				String deltagvalue=deletetagvalue.getBody().asPrettyString();
				System.out.println(deltagvalue);
				System.out.println(deletetagvalue.statusCode());
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
