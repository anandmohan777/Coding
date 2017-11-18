package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class D_CamelCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();

		StringBuffer sb = new StringBuffer();
		// 65 to 90

		char firstChar = s.charAt(0);
		int result = isUpperCase(firstChar) ? 0 : 1;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (isUpperCase(c)) {
				++result;
				sb.setLength(0);
				sb.append(c);
			} else
				sb.append(c);
		}
		System.out.println(result);

	}

	static boolean isDigit(char ch) {
		return ch >= '0' && ch <= '9';
	}

	static boolean isLowerCase(char ch) {
		return ch >= 'a' && ch <= 'z';
	}

	static boolean isUpperCase(char ch) {
		return ch >= 'A' && ch <= 'Z';
	}
}
