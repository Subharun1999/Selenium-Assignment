package com.pract;

import java.util.Arrays;

public class Lab006 {

	//Anagrams Strings
	public static void main(String[] args) {

		String str1 = "Rolce";
		String str2 = "Olrec";

		char[] c1 = str1.toLowerCase().toCharArray();
		char[] c2 = str2.toLowerCase().toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		if(Arrays.equals(c1, c2)){
			System.out.println("Arrays are anagram");
		}else{
			System.out.println("Arrays are not Anagram");
		}
	}
}
