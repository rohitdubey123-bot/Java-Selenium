import org.json.JSONArray;
import org.json.JSONObject;

public class Getjson {

	public static void main(String[] args)  {
		
		JSONObject jsonroot=new JSONObject();
		jsonroot.put("firstname", "Rohit");
		jsonroot.put("Lastname", "Dubey");
		System.out.println(jsonroot);
		
		JSONObject jsonobj=new JSONObject();
		jsonobj.put("Mothername", "Shivdevi");
		jsonobj.put("Fathername", "Ramesh Dubey");
		jsonobj.put("Address", "Kansraipur");
		jsonobj.put("Personal", "jsonobj");
		System.out.println(jsonobj);
		
		
		
		
		
		
	}

}
