package com.pkg1;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonTest3 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONObject jobj = new JSONObject();
		jobj.put("Novel name", "NovelName");
		jobj.put("Author", "AuthorName");

		JSONArray jarray = new JSONArray();
		jarray.add("Language:Hindi");
		jarray.add("Year of publication:1995");

		jobj.put("Novel Details", jarray);
		JsonTest4 jtest4 = new JsonTest4();
		jtest4.doGet(jobj);
		

	}

}
