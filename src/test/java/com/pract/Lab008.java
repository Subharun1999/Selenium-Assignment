package com.pract;

public class Lab008 {

	public static void main(String[] args) {

		int[] a = {20, 10, 15, 313, -55, 87, 92};

		int max = a[0];
		int min = a[0];

		for (int i = 1; i < a.length; i++) {
			if (max > a[i]) {
				max = a[i];
			} else if (min < a[i]) {
				min = a[i];
			}

		}
		System.out.println("Max is: "+max);
		System.out.println("Min is: "+min);
	}
}
