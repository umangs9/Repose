package com.pkg1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TestHash {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the key");
			int k = sc.nextInt();
			System.out.println("Enter the value");
			String val = sc.next();
			hmap.put(k, val);
		}
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.print("key is: " + mentry.getKey() + " & Value is: ");
			System.out.println(mentry.getValue());
		}
		System.out.println(hmap.size());
	}
}
