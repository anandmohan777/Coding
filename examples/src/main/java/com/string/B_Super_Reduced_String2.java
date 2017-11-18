package com.string;

public class B_Super_Reduced_String2 {

	static String super_reduced_string(String s) {
		final StringBuilder sb = new StringBuilder(s);
		for (int i = 1; i < sb.length(); i++) {
			if (sb.charAt(i) == sb.charAt(i - 1)) {
				sb.delete(i - 1, i + 1);
				i = 0;
			}
		}
		return sb.toString().isEmpty() ? "Empty String" : sb.toString();
	}

	public static void main(String[] args) {
		String result = super_reduced_string("baab");
		System.out.println(result);
	}
}
