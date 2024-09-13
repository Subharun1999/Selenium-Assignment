package com.pract;

public class Lab007 {

	public static void main(String[] args) {

		String str = "Villian";

		StringBuffer br = new StringBuffer(str).reverse();
		System.out.println(br);

		String dw= "";
		for (int i=str.length()-1; i>=0; i--){
			dw= dw+str.charAt(i);
		}
		System.out.println(dw);

	}
}
