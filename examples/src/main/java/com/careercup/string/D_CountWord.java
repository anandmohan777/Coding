package com.careercup.string;

public class D_CountWord {

	public static void main(String[] args) {
		final String input = " One two three\n    four\tfive  ";

		int size = 0;
		String last = "SPACE";
		for (int i = 0; i < input.length(); i++) {
			if (' ' == input.charAt(i) || '\n' == input.charAt(i) || '\t' == input.charAt(i)) {
				last = "SPACE";
			}

			else if (last.equals("SPACE")) {
				size++;
				last = "char";
			}

		}
		System.out.println(size);
	}
}
