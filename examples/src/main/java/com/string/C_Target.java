package com.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class C_Target {

	public static void main(String[] args) {
		C_Target t = new C_Target();
		t.check();
	}

	private void check() {
		String s = "shivam oberoi";
		Map<String, Long> countMap = Arrays.stream(s.split("")).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(countMap);
		List<String> list = new ArrayList<>();
		list.add("s");
		list.add("o");
		for (String s3 : list) {
			if (countMap.containsKey(s3)) {
				System.out.println(s3 + "------" + countMap.get(s3));
			} else {
				System.out.println(s3 + "------" + 0);
			}

		}
	}
}
