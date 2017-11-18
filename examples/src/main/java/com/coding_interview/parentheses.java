package com.coding_interview;

import java.util.*;

public class parentheses {

	// method 1
	public static Set<String> generateParens(int remaining) {
		Set<String> set = new HashSet<String>();
		if (remaining == 0) {
			set.add("");
		} else {
			Set<String> prev = generateParens(remaining - 1);
			for (String str : prev) {
				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) == '(') {
						String s = insertInside(str, i);
						/*
						 * Add s to set if it's not already in there. Note:
						 * HashSet automatically checks for duplicates before
						 * adding, so an explicit check is not necessary.
						 */
						set.add(s);
					}
				}
				if (!set.contains("()" + str)) {
					set.add("()" + str);
				}
			}
		}
		return set;
	}

	public static String insertInside(String str, int leftIndex) {
		String left = str.substring(0, leftIndex + 1);
		String right = str.substring(leftIndex + 1, str.length());
		return left + "()" + right;
	}

	// method 2
	public void addParen(ArrayList<String> list, int leftRem, int rightRem,
			char[] str, int count) {
		if (leftRem < 0 || rightRem < leftRem)
			return; // invalid state

		if (leftRem == 0 && rightRem == 0) { /* no more parens left */
			String s = String.copyValueOf(str);
			list.add(s);
		} else {
			/* Add left paren, if there are any left parens remaining. */
			if (leftRem > 0) {
				str[count] = '(';
				System.out.println("l "+ count);
				addParen(list, leftRem - 1, rightRem, str, count + 1);
			}

			/* Add right paren., if expression is valid */
			if (rightRem > leftRem) {
				str[count] = ')';
				System.out.println("r "+ count);
				addParen(list, leftRem, rightRem - 1, str, count + 1);
			}
		}
	}

	public ArrayList<String> generateParens2(int count) {
		char[] str = new char[count * 2];
		ArrayList<String> list = new ArrayList<String>();
		addParen(list, count, count, str, 0);
		return list;
	}

	public static void main(String[] args) {
		/*System.out.println(generateParens(3));
		System.out.println((new parentheses()).generateParens2(3));*/
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println((long)Integer.MAX_VALUE);
		System.out.println(((long)Integer.MAX_VALUE) + 1);
	}
}
