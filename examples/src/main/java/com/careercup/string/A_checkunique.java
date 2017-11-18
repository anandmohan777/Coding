package com.careercup.string;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 * 
 * @author anandmohan
 *
 */
public class A_checkunique {
	public boolean function(String input) {
		boolean isUnique = true;

		if (input != null && input.length() > 256) {
			isUnique = false;
		} else {
			boolean[] char_set = new boolean[256];
			for (int i = 0; i < input.length(); i++) {
				int ascii = input.charAt(i);
				if (char_set[ascii]) {
					isUnique = false;
					break;
				}
				char_set[ascii] = true;
			}
		}
		return isUnique;
	}

	public boolean function1(String input) {
		boolean isUnique = true;
		HashMap<String, String> hashMap = new HashMap<>();
		for (String c : input.split("")) {
			if (hashMap.get(c) == null) {
				hashMap.put(c, "1");
			} else {
				isUnique = false;
				break;
			}
		}
		return isUnique;
	}

}
