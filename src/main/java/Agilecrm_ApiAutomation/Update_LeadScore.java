package Agilecrm_ApiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Update_LeadScore {

	public static void main(String[] args) {
		
		String Updateleadscores="{\r\n"
				+ "    \"id\": \"5144207213395968\",\r\n"
				+ "    \"lead_score\": 20\r\n"
				+ "}"	;
	Response updateLeadscore=RestAssured.given().auth().basic("dubey@agilecrm.com", "dubey@123")
	.contentType("application/json").accept("application/json").body(Updateleadscores).put("https://agilecrmfree.agilecrm.com/dev/api/contacts/edit/lead-score");
	
	String Leadscore=updateLeadscore.getBody().asPrettyString();
	System.out.println(Leadscore);
	System.out.println(updateLeadscore.statusCode());

	}

}
