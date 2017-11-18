package com.careercup.string;

import java.util.Arrays;

public class G_Anagram {

	static final int MAX_CHAR = 26;

	static boolean isAnagram(String s1, String s2) {
		int[] count = new int[MAX_CHAR];
		Arrays.fill(count, 0);

		for (int i = 0; i < s1.length(); i++) {
			count[s1.charAt(i) - 'a']++;
		}

		for (int i = 0; i < s2.length(); i++) {
			count[s2.charAt(i) - 'a']--;
		}

		for (int i = 0; i < MAX_CHAR; i++) {
			if (count[i] != 0)
				return false;

		}

		return true;
	}

	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "ba";
		System.out.println(isAnagram(s1, s2));
	}
}
