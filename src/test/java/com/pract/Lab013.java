package com.pract;

import java.util.HashMap;
import java.util.Map;

public class Lab013 {

	public static void main(String[] args) {

		String str = "programming";
		findOcc(str);
	}

	public static void findOcc(String str){

		Map<Character, Integer> charMap = new HashMap<>();
		char[] array = str.toCharArray();
		for(char ch : array)
		{
			charMap.put(ch, charMap.getOrDefault(ch,0)+1);
		}
		System.out.println(charMap);

		for(Map.Entry<Character,Integer> entry : charMap.entrySet()){
			if(entry.getValue() > 1)
			{
				System.out.println(entry.getKey());
			}
		}
	}

}
