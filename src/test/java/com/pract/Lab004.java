package com.pract;

public class Lab004 {

	public static void main(String[] args) {

		//Occurrence of each character in a given string

		String str = "Testing to be honest";

		int count = str.length() - str.replaceAll("e","").length();
		System.out.println(str.length());
		System.out.println(count);
	}
}
