package com.coding_interview;

import java.util.Arrays;

class _4_22 {

	public static void main(String[] args) throws Exception {
		System.out.println(bitsToModify(10, 13));

	}

	static int NumberOf1(int n) {
		int count = 0;
		int flag = 1;
		while (n!=0) {		
			
			if((n & 1)==1)
			++count;
			System.out.println("(n & 1)==1   "+(n & 1));
			
			n = n >>> 1;
			System.out.println("n "+n);
		}
		return count;
	}
	
	//4_23
	
	static int bitsToModify(int number1, int number2) {
		int tmp=number1^number2;
		System.out.println(tmp);
		return NumberOf1(tmp);
	}
}
