package com.pkg1;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class JsonTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONObject jobj = new JSONObject();
		jobj.put("Novel name", "NovelName");
		jobj.put("Author", "AuthorName");

		JSONArray jarray = new JSONArray();
		jarray.add("Language:Hindi");
		jarray.add("Year of publication:1995");

		jobj.put("jarray", jarray);
		System.out.print(jobj);
	}
}
