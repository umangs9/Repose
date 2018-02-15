package com.pkg2;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.pkg1.JsonTest2;


public class Snippet {
	public static void main(String[] args) throws IOException, ParseException {
		JsonTest2 jtest2 = new JsonTest2();
		System.out.println(jtest2.doGet());
	}
}

