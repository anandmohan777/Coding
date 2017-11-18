package com.string;


public class A_bruteforce {

	public int findMatch(String t[], String p[]) {
		int matchIndex = -1;
		for (int i = 0; i <= t.length - p.length; i++) {
			for (int j = 0; j < p.length && t[i + j].equalsIgnoreCase(p[j]);) {
				j++;
				if (j == p.length) {
					matchIndex = i;
					break;
				}
			}
		}
		return matchIndex;
	}
}
