package com.geeksforgeeks.array;

import java.util.Arrays;

public class A_ArrayRotation {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int n = 3;
		int d = 12;

		for (int i = 0; i < a.length; i++) {
			a[i] = ((a[i] + n) % d);
		}
		System.out.println(Arrays.toString(a));
		
	}
}
