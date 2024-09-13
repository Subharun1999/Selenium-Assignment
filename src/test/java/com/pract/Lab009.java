package com.pract;

public class Lab009 {

	public static void main(String[] args) {

		//Pallindrome String

		String str = "nitin";
		String lc = str.toLowerCase();
		String new_str = "";

		for(int i = lc.length()-1; i>=0; i--)
		{
			new_str = new_str + lc.charAt(i);
		}
		System.out.println(new_str);
		if(str.equals(new_str)){
			System.out.println("Pallindrome String");
		}else{
			System.out.println("Not Pallindrome String");
		}
	}
}
