package com.pract;

import java.util.HashMap;
import java.util.Map;

public class Lab_011 {

	public static void main(String[] args) {

		//Find Duplicate word in a sentence

		String str = "Go home please go please";
		String lw = str.toLowerCase();
		Map<String, Integer> map = new HashMap();
		String[] arr = lw.split(" ");
		int count = 1;

		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			} else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
		}
		System.out.println(map);
		for (String key : map.keySet()) {
			if (map.get(key) > 1) {
				System.out.println(key + ":" + map.get(key));
			}

		}
	}
}
