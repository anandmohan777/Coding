package com.others;

import java.util.*;

public class Arraysquare {

	public static void main(String[] args) throws InterruptedException {

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

		List<Map.Entry<Character, Integer>> l = new ArrayList<Map.Entry<Character, Integer>>();
		l.addAll(h.entrySet());

		Collections.sort(l, new Comparator<Map.Entry<Character, Integer>>() {
			public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
				return o1.getValue() - o2.getValue();
			};

		});
		System.out.println(l);
	}

}
