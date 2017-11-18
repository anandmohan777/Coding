package com.careercup.string;

/**
 * Implement a method to perform basic string compression using the counts of
 * repeated characters. For example, the string aabcccccaaa would become
 * a2blc5a3. If the "compressed" string would not become smaller than the
 * original string, your method should return the original string
 * 
 * @author anandmohan
 *
 */
public class B_compression {

	public String function(String s1) {
		StringBuffer sb = new StringBuffer();
		String last = String.valueOf(s1.charAt(0));
		int count = 0;
		for (String s : s1.split("")) {
			if (last.equals(s)) {
				++count;
			} else {
				sb.append(last);
				sb.append(count);
				count = 1;
			}
			last = s;
		}

		sb.append(last + count);

		return sb.toString();

	}
}
