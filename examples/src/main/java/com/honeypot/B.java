package com.honeypot;

import java.util.*;

public class B {

	public static void main(String[] args) {
		String a[] = {"cdab"};
		String b[] = {"abcd"};

		System.out.println(Arrays.toString(twins(a, b)));
		
	}
	

    /*
     * Complete the function below.
     */
    static String[] twins(String[] a, String[] b) {
        final int maxLength = a.length > b.length ? a.length : b.length;

		final String[] output = new String[maxLength];
		Arrays.fill(output, "No");
		for (int i = 0; i < maxLength; i++) {
			final String s2 = b[i];
			final String s1 = a[i];

			final String splitArray[] = s1.split("");

			for (int x = 0; x < splitArray.length - 2; x = x + 1) {
                
                if (s1.equals(s2)) {
					output[i] = "Yes";
					break;
                }
                
				String aa = splitArray[x];
				splitArray[x] = splitArray[x + 2];
				splitArray[x + 2] = aa;
				String temp = "";

				for (String s : splitArray) {
					temp = temp + s;
				}

				if (temp.equals(s2)) {
					output[i] = "Yes";
					break;
				}
            }
        }
        
        return output;
    }

}
