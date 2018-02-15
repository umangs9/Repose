package com.pkg1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonTest2 {
	private static final String filepath = "C:\\Users\\admin\\Documents\\category.json";
	
	public String doGet()throws IOException, ParseException {
		FileReader filereader = new FileReader(filepath);
		JSONParser jparser = new JSONParser();
		JSONObject jobj = (JSONObject) jparser.parse(filereader);

		/*double id = (double) jobj.get("id");
		System.out.println("The id is " + id);

		String type = (String) jobj.get("type");
		System.out.println("The type is " + type);

		String path = (String) jobj.get("path");
		System.out.println("The name is " + path);

		double ppu = (double) jobj.get("ppu");
		System.out.println("The ppu is " + ppu);*/

		System.out.println("categories");
		JSONArray categories = (JSONArray) jobj.get("categories");
		/*Iterator itr = categories.iterator();
		while (itr.hasNext()) {
				//System.out.println("ID: " + jobj2.get("id") + " " + "Type: " + jobj2.get("name"));
		}
		System.out.println(categories);
		JSONArray child = (JSONArray) categories.get("children");*/
		JSONObject child = (JSONObject) categories.get(1);
		System.out.println(child);
		return "Done";
	}
	
	
}