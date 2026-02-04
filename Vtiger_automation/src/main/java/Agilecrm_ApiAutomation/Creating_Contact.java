package Agilecrm_ApiAutomation;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Creating_Contact {

	public static void main(String[] args) {

		String fname=RandomStringUtils.randomAlphabetic(6);
		String lname=RandomStringUtils.randomAlphabetic(6);
		String Email=RandomStringUtils.randomAlphabetic(12)+"@gmail.com";


		String CreatingContact="{\r\n"
				+ "    \"star_value\": \"4\",\r\n"
				+ "    \"lead_score\": \"92\",\r\n"
				+ "    \"tags\": [\r\n"
				+ "        \"Lead\",\r\n"
				+ "        \"Likely Buyer\"\r\n"
				+ "    ],\r\n"
				+ "    \"properties\": [\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"SYSTEM\",\r\n"
				+ "            \"name\": \"first_name\",\r\n"
				+ "            \"value\": \""+fname+"\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"SYSTEM\",\r\n"
				+ "            \"name\": \"last_name\",\r\n"
				+ "            \"value\": \""+lname+"\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"SYSTEM\",\r\n"
				+ "            \"name\": \"email\",\r\n"
				+ "            \"subtype\": \"work\",\r\n"
				+ "            \"value\": \""+Email+"\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"SYSTEM\",\r\n"
				+ "            \"name\": \"address\",\r\n"
				+ "            \"value\": \"{\\\"address\\\":\\\"225 Rajpura Bhadohi\\\",\\\"city\\\":\\\"NSW\\\",\\\"state\\\":\\\"Sydney\\\",\\\"zip\\\":\\\"2000\\\",\\\"country\\\":\\\"Australia\\\"}\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"phone\",\r\n"
				+ "            \"value\": \"8888888889\",\r\n"
				+ "            \"subtype\": \"work\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"phone\",\r\n"
				+ "            \"value\": \"8888888889\",\r\n"
				+ "            \"subtype\": \"home\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"website\",\r\n"
				+ "            \"value\": \"www.youtube.com\",\r\n"
				+ "            \"subtype\": \"YOUTUBE\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"website\",\r\n"
				+ "            \"value\": \"www.linkedin.com\",\r\n"
				+ "            \"subtype\": \"LINKEDIN\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"website\",\r\n"
				+ "            \"value\": \"www.mywebsite.com\",\r\n"
				+ "            \"subtype\": \"URL\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"My custom field of type text\",\r\n"
				+ "            \"type\": \"CUSTOM\",\r\n"
				+ "            \"value\": \"My name is ghanshyam\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"My custom field of type date\",\r\n"
				+ "            \"type\": \"CUSTOM\",\r\n"
				+ "            \"value\": 1479580200\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"My custom field of type checkbox\",\r\n"
				+ "            \"type\": \"CUSTOM\",\r\n"
				+ "            \"value\": \"on\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"My custom field of type list\",\r\n"
				+ "            \"type\": \"CUSTOM\",\r\n"
				+ "            \"value\": \"lemon\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"My custom field of type companies\",\r\n"
				+ "            \"type\": \"CUSTOM\",\r\n"
				+ "            \"value\": \"[\\\"5767466600890368\\\",\\\"5114076984246272\\\",\\\"5746725247516672\\\"]\"\r\n"
				+ "        }\r\n"
				+ "    ]\r\n"
				+ "}";


		Response CreateResponse=RestAssured.given().auth().basic("dubey@agilecrm.com", "dubey@123")
		.contentType("application/json").accept("application/json").body(CreatingContact).post("https://agilecrmfree.agilecrm.com/dev/api/contacts");
		String createrespbody=CreateResponse.getBody().asPrettyString();
		
		if(CreateResponse.getStatusCode()==200) {
			System.out.println("Passed status code is correct");
		}else {
			System.out.println("Failed status code is incorrect");

		}

		JSONObject jsonobj=new JSONObject(createrespbody);
		JSONArray jsonpropsArray=jsonobj.getJSONArray("properties");
		JSONObject	fnameobj =jsonpropsArray.getJSONObject(0);
		String respfname=fnameobj.getString("value");

		JSONObject	lnameobj =jsonpropsArray.getJSONObject(1);
		String resplname=lnameobj.getString("value");

		JSONObject	Emailobj =jsonpropsArray.getJSONObject(2);
		String respemail=Emailobj.getString("value");

		if(respfname.equalsIgnoreCase(fname)) {
			System.out.println("Passed.First name is Matching -actual-"+respfname+",expected--"+fname);
		}else {
			System.out.println("Failed.First name is not matching -actual-"+respfname+",expected--"+fname);
		}

		if(resplname.equalsIgnoreCase(lname)) {
			System.out.println("Passed.Last name is Matching -actual-"+resplname+"expected--"+lname);
		}else {
			System.out.println("Failed.Last name is not matching -actual-"+resplname+",expected--"+lname);

		}

		if(respemail.equalsIgnoreCase(Email)) {
			System.out.println("Passed.Email name is Matching -actual-"+respemail+",expected--"+Email);
		}else {
			System.out.println("Failed.First name is not matching -actual-"+respemail+",expected--"+Email);
		}

	}

}
