package com.pract;

public class Lab002 {

	public static void main(String[] args) {

		//Count the total number of words

		int count = 0;
		String str = "Welcome to Java";
		String[] a = str.split(" ");
		for (String s : a) {
			System.out.println(s);
			count++;
			System.out.println(count);
		}
		//System.out.println(a);
	}
}
