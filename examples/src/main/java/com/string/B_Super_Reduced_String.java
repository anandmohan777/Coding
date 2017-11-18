package com.string;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class B_Super_Reduced_String {

	static String super_reduced_string(String s) {
		Map<String, Long> countMap = Arrays
				.stream(s.split(""))
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
		System.out.println(countMap);
		final StringBuffer sb = new StringBuffer();

		for (Map.Entry<String, Long> entry : countMap.entrySet()) {

			if (entry.getValue() % 2 != 0) {
				sb.append(entry.getKey());
			} else if (entry.getValue() == 1) {
				sb.append(entry.getKey());
			}
		}
		return sb.toString().isEmpty() ? "Empty String" : sb.toString();
	}

	public static void main(String[] args) {
		/*
		 * Scanner in = new Scanner(System.in); String s = in.next();
		 */
		String result = super_reduced_string("zztqooauhujtmxnsbzpykwlvpfyqijvdhuhiroodmuxiobyvwwxupqwydkpeebxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh");
		System.out.println(result);
	}
}
