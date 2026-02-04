package Agilecrm_ApiAutomation;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ContactTestCases {

	public static void main(String[] args) {
		
		String fname=RandomStringUtils.randomAlphabetic(6);
		String lname=RandomStringUtils.randomAlphabetic(6);
		String Email=RandomStringUtils.randomAlphabetic(6)+"@gmail.com";

	Response resp=RestAssured.given().auth().basic("dubey@agilecrm.com", "dubey@123")
	.accept("application/json").get("https://agilecrmfree.agilecrm.com/dev/api/contacts");
	String respjson=resp.getBody().asPrettyString();
	System.out.println(respjson);
	
	
//	int getcontact=resp.statusCode();
	//System.out.println(getcontact);
	
	
	
	JSONArray jsonroot=new JSONArray(respjson);
	JSONObject jsonobj=jsonroot.getJSONObject(0);
	Number idnumber=jsonobj.getNumber("id");
	System.out.println(idnumber);
	
	
	String Createcontactjson="{\r\n"
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
			+ "            \"value\": \"{\\\"address\\\":\\\"225 bhadohi\\\",\\\"city\\\":\\\"NSW\\\",\\\"state\\\":\\\"Sydney\\\",\\\"zip\\\":\\\"2000\\\",\\\"country\\\":\\\"Australia\\\"}\"\r\n"
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
	
	Response respons=RestAssured.given().auth().basic("rkd@agilecrm.com", "rkd@123")
	.contentType("application/json").accept("application/json").body(Createcontactjson).post("https://rkdy.agilecrm.com/dev/api/contacts");
	String Createcontactresponsejson=respons.getBody().asPrettyString();
	System.out.println(Createcontactresponsejson);
	
	
	int responsecode=respons.statusCode();
	System.out.println(responsecode);
	
	
	
	
	
	
	
	
	}

}
