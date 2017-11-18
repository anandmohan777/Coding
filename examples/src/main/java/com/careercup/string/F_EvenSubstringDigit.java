package com.careercup.string;

public class F_EvenSubstringDigit {

	// Return the even number substrings.
	static int evenNumSubstring(int str[])
	{
	    int len = str.length;
	    int count = 0;
	 
	    for (int i = 0; i < len; i++)
	    {
	        int temp = str[i] - '0';
	 
	        // If current digit is even, add
	        // count of substrings ending with
	        // it. The count is (i+1)
	        if (temp % 2 == 0)
	            count += (i + 1);
	    }
	 
	    return count;
	}
	
	public static void main(String[] args) {
		int str[] = {1,2,3,4};
	    System.out.println(evenNumSubstring(str));
    }
}
