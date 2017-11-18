package com.coding_interview;

import java.util.Arrays;

class _4_18 {
		
	public static void main(String[] args) throws Exception {

		int[] coins = { 1,3,9,10 };
		int total = 15;

		System.out.println(GetMinCount(total, coins));

	}

	static int GetMinCount(int total, int[] coins) {
		int[] counts = new int[total + 1];
		String[] countss = new String[total + 1];
		counts[0] = 0;
		int MAX = Integer.MAX_VALUE;
		String s="";
		for (int i = 1; i <= total; ++i) {
			int count = MAX;
			s="";
			for (int j = 0; j < coins.length; ++j) {
				int val1=i - coins[j];
				//System.out.println(" i "+i+" j "+j+" val1 "+ val1);
				if (val1 >= 0 && count > counts[i - coins[j]]){
					s=coins[j]+" "+(countss[i - coins[j]]!=null?(countss[i - coins[j]]):"");
					count = counts[i - coins[j]];
					//System.out.println("val2 "+ count);
					System.out.println("i "+i+" s "+ s);
				}
			}
			if (count < MAX){
				counts[i] = count + 1;
				countss[i] = s ;
			}	
			else
				counts[i] = MAX;
		}
		System.out.println(countss[total]);
		
		return counts[total];
	}

}
