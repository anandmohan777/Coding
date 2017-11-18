package com.geeksforgeeks.string;

public class A_StringMaxOcc {

	static final int ASCII_SIZE = 256;

	public static void main(String[] args) {
		String input = "anand mohanhhhkkkk";

		int count[] = new int[ASCII_SIZE];

		for (int i = 0; i < input.length(); i++) {
			++count[input.charAt(i)];
		}

		int max = count[0];
		char maxChar = 0;

		for (int i = 1; i < input.length(); i++) {
			if (max < count[input.charAt(i)]) {
				max = count[input.charAt(i)];
				maxChar = input.charAt(i);
			}
		}

		System.out.println("max: " + max);
		System.out.println("char: " + (char) maxChar);

	}
}
