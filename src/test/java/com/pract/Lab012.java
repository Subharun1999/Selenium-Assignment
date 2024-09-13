package com.pract;

public class Lab012 {

	public static void main(String[] args) {

		String str1 = "Hey";
		String str2 = "Hello";

		System.out.println("Before swapping: ");
		System.out.println("Value of str1 is: "+str1);
		System.out.println("Value of str2 is: "+str2);
		System.out.println("---------------------");

		str1 = str1+str2;
		System.out.println(str1);

		str2 = str1.substring(0, str1.length()-str2.length());
		System.out.println("Str2 =" +str2);

		str1 = str1.substring(str2.length());
		System.out.println("Str1 =" +str1);
	}
}
