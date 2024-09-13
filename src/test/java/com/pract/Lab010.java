package com.pract;

public class Lab010 {

	public static void main(String[] args) {

		String str = "How are you";
		String new_str ="";
		String[] ns = str.split(" ");

		for(int i = ns.length-1; i>=0 ; i--){

			new_str = new_str + ns[i]+ " ";
		}
		System.out.println(new_str);
	}
}
