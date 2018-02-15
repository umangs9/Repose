package com.pkg1;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public class JsonTest4 {
	
	public String doGet(JSONObject jobj4) {
		System.out.println(jobj4);
		return "done";
	}
	
	public static void main(String[] args) throws IOException, ParseException {
		System.out.println("Hello");
		JsonTest2 jtest2 = new JsonTest2();
		jtest2.doGet();
	}

}
