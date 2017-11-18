package com.careercup.string;


public class H_ReverseWords {

	public static void main(String[] args) {
		String s1 = "This is a good  question \n              hhh";
		StringBuffer sb = new StringBuffer();
		for (String s : s1.split(" |  ")) {
			sb.insert(0, s.trim() + " ");
		}
		System.out.println(sb.toString());
	}
}
