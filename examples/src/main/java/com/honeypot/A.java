package com.honeypot;

import java.util.*;

public class A {
	static int[] getOneBits(int n) {
		String output = Integer.toString(n, 2);
		int count = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < output.length(); i++) {

			if (output.charAt(i) == '1') {
				count++;
				list.add(i + 1);
			}
		}
		int[] newGuess = new int[count + 1];
		newGuess[0] = count;
		for (int j = 0; j < list.size(); j++) {
			{
				newGuess[j + 1] = list.get(j);

			}
		}

		return newGuess;
	}

}
