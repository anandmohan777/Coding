package com.others;

import java.util.*;
import java.io.*;

public class Solution1 {
	private static final Scanner scan = new Scanner(System.in);

	static String mergeStrings(String a, String b) {

		StringBuffer sb = new StringBuffer();

		if (a != null && a.length() > 25000) {
			a = a.substring(0, 25000);
		}
		if (b != null && b.length() > 25000) {
			b = b.substring(0, 25000);
		}

		for (int i = 0; a != null && b != null && (i < a.length() || i < b.length()); i++) {
			if (i < a.length() && i < b.length()) {
				sb.append(String.valueOf(a.charAt(i)) + String.valueOf(b.charAt(i)));
			} else if (i < a.length()) {
				sb.append(a.substring(i + 1));
				break;
			} else if (i < b.length()) {
				sb.append(b.substring(i));
				break;
			}

		}

		if (a == null) {
			sb.append(b);
		} else if (b == null) {
			sb.append(a);
		}
		return sb.toString();
	}

	public static void main(String args[]) throws Exception {

		System.out.println(mergeStrings("zf", "abcdef"));
		/*
		 * String filename;
		 * 
		 * List<String> orriginal = new ArrayList<String>(); while (true) {
		 * filename = scan.nextLine(); System.out.println("io : "+filename); if
		 * (filename.equals("")) break; orriginal.add(filename);
		 * 
		 * }
		 * 
		 * Map<String, Integer> data = new LinkedHashMap<String, Integer>();
		 * 
		 * try(BufferedReader br = new BufferedReader(new FileReader(filename)))
		 * { for(String line; (line = br.readLine()) != null; ) {
		 * orriginal.add(line); } }
		 * 
		 * for(String listData : orriginal){ if(data.containsKey(listData)) {
		 * data.put(listData.split("-")[0].trim(),
		 * data.get(listData.split("-")[0].trim()) + 1); } else {
		 * data.put(listData.split("-")[0].trim(), 1); } }
		 * 
		 * data.forEach((key, value) -> { System.out.println(key + " " + value);
		 * });
		 */}
}