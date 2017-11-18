package com.careercup.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		String a[] = { "abcde" };
		String b[] = { "cdebsa" };
		System.out.println(a[0]);
		int max = a.length > b.length ? a.length : b.length;

		String[] result = new String[max];
		Arrays.fill(result, "No");

		for (int i = 0; i < max; i++) {

			String s1 = a[i];
			String s2 = b[i];

			String s1array[] = s1.split("");

			for (int x = 0; x < s1array.length - 2; x = x + 1) {

				if(s1.equals(s2)){
					result[i] = "YES";
					break;
				}

				String aa = s1array[x];
				s1array[x] = s1array[x + 2];
				s1array[x + 2] = aa;

				StringBuilder strBuilder = new StringBuilder();
				for (int ii = 0; ii < s1array.length; ii++) {
				   strBuilder.append(s1array[ii]);
				}
				String finalValue = strBuilder.toString();
				

				if (finalValue.equals(s2)) {
					result[i] = "YES";
					break;
				}
				System.out.println(finalValue);
			}
		}

		System.out.println(Arrays.toString(result));

	}

	private void test() {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		HashMap<Character, Integer> h = new HashMap<Character, Integer>();
		while (s != null && s.length() > 0) {

			loop: for (int i = 0; i < s.length(); i++) {
				if (h.containsKey(s.charAt(i))) {
					h.put(s.charAt(i), h.get(s.charAt(i)) + 1);
				} else {
					h.put(s.charAt(i), 1);
					break loop;
				}
			}

		s = in.nextLine();
		}
	}
}
