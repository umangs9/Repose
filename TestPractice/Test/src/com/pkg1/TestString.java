package com.pkg1;
import java.io.File;
import org.springframework.boot.groovy.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class TestString {

	public static void main(String[] args) {

		/*
		 * String str = "Hello";
		 * System.out.println("Hashcode is of "+str+" is "+str.hashCode()); String str1
		 * = "Hello1";
		 * System.out.println("Hashcode is of "+str1+" is "+str1.hashCode()); String
		 * str2 = "Hello";
		 * System.out.println("Hashcode is of "+str2+" is "+str2.hashCode());
		 * 
		 * System.out.println(str.equals(str1)); System.out.println(str.equals(str2));
		 */

		//Get Contents of particular file
		File file = new File("C:\\Users\\admin\\Documents\\details.json");
		String[] files = file.list();
		System.out.println(file.getName());

		if (files != null) {
			for (int i = 0; i < 2; i++) {
				System.out.println(files[i]);
			}
		}else {
			System.out.println();
		}
		
		//Swapping by using two numbers	
		int a = 10,b=20;
		a ^= b;
		b ^= a;  
		a ^= b; 
		System.out.println("a= "+a+" b= "+b);
	}
}
