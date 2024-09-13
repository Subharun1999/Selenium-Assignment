package com.pract;

import java.util.HashMap;
import java.util.Map;

public class Lab003 {

	public static void main(String[] args) {

		//Count the occurrence of each words

		String str = "Welcome to the world the to Java";

		String[] s = str.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String st : s) {
			Integer old = map.get(st);

			if (old == null) {
				old = 0;
			}
			map.put(st, old + 1);
		}
			System.out.println(map);

	}
}
