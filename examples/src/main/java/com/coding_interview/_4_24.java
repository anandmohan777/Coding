package com.coding_interview;

import java.util.Arrays;

class NumbersOccurringOnce {
	public int num1;
	public int num2;
}

class _4_24 {

	public static void main(String[] args) throws Exception {
		NumbersOccurringOnce t= new NumbersOccurringOnce();
		int number[]= {2, 4, 3, 6, 3, 2, 5, 5};
		getOnce(number, t);
		System.out.println(t.num1 );
		System.out.println(t.num2 );

	}

	static void getOnce(int numbers[], NumbersOccurringOnce once) {
		if (numbers.length < 2)
			return;
		int resultExclusiveOR = 0;
		for (int i = 0; i < numbers.length; ++i)
			resultExclusiveOR ^= numbers[i];
		int indexOf1 = findFirstBitIs1(resultExclusiveOR);
		once.num1 = once.num2 = 0;
		for (int j = 0; j < numbers.length; ++j) {
			if (isBit1(numbers[j], indexOf1))
				once.num1 ^= numbers[j];
			else
				once.num2 ^= numbers[j];
		}
	}

	// The first 1 bit from the rightmost
	static int findFirstBitIs1(int num) {
		int indexBit = 0;
		while (((num & 1) == 0) && (indexBit < 32)) {
			num = num >> 1;
			++indexBit;
		}
		return indexBit;
	}

	// check whether the bit with index indexBit is 1
	static boolean isBit1(int num, int indexBit) {
		num = num >> indexBit;
		return (num & 1) == 1;

	}

	
}
