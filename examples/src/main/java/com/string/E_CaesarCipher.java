package com.string;

import java.util.Scanner;

public class E_CaesarCipher {

	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		String input = scanner.next();
		int number = scanner.nextInt();*/

		E_CaesarCipher c = new E_CaesarCipher();
		System.out.println(c.functionCaesarCipher("zZ9", 2));
	}

	private String functionCaesarCipher(String s, int number) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				int asciValue = s.charAt(i) + number;
				if (Character.isLetter((char) (s.charAt(i) + number))) {
					sb.append((char) asciValue);
				} else {
					if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'))
						sb.append((char) (asciValue - 26));
					else if ((s.charAt(i) >= '0' && s.charAt(i) <= '9'))
						sb.append((char) (asciValue - 9));
					else
						sb.append(s.charAt(i));
				}
			} else {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}
}
