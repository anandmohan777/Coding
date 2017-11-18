package com.spartez;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MyFindArray implements FindArray {
	
	public int findArray(int[] array, int[] subArray) {		
		if (null == array || null == subArray) {
			return -1;
		}
		
		final int sourceLen = array.length;
		final int destLen = subArray.length;
		if (sourceLen == 0 || destLen == 0 || sourceLen < destLen) {
			return -1;
		}

		final Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i <= sourceLen - destLen; i++) {
			map.put(Arrays.toString(Arrays.copyOfRange(array, i, i + destLen)), i);
		}
		if (map.get(Arrays.toString(subArray)) == null) {
			return -1;
		}
		return map.get(Arrays.toString(subArray));
	}
	
	public static void main(String[] args) {
		FindArray f = new MyFindArray();
		int a[] = {4,9,3,7,8,3,7,1};
		int b[] = {3,7};
		System.out.println(f.findArray(a,b));
	}
}