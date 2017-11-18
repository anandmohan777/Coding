package com.others;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Streams {
	
	public int findArray(int[] array, int[] subArray) {
		  if (null == array || null == subArray) {
		   return -1;
		  }
		  final int sourceLen = array.length;
		  final int destLen = subArray.length;
		  if (sourceLen < destLen || sourceLen == 0 || destLen == 0) {
		   return -1;
		  }
		  
		  final Map<String, Integer> map = new HashMap<>();
		  for (int i = 0; i <= array.length - destLen; i++) {
		   map.put(Arrays.toString(Arrays.copyOfRange(array, i, i + destLen)),
		     i);
		  }
		  if (map.get(Arrays.toString(subArray)) == null) {
		   return -1;
		  }
		  return map.get(Arrays.toString(subArray));
		 }
				
	public static void main(String[] args) {

		/*int[][] arrays = { { 6, 2, 0, 4 }, { 5, 0, 2, 6, 7, 1 }, { 6, 7, 9, 9 } };

		System.out.println(Arrays.toString(findintwo(arrays)));

		int i[]=new int[256];*/
		
		
		// Pinki (lufthansa) MCE Miles calculation engine
		
		ArrayList a=new ArrayList();
		a.add(1);
		a.add(2);
		ArrayList b=new ArrayList();
		b.add(1);
		b.add(3);
		
		ArrayList c=new ArrayList(a);
		c.retainAll(b);
		
		a.removeAll(c);
		b.removeAll(c);
		a.addAll(b);
		Object c1[]=a.toArray();
		System.out.println(Arrays.toString(c1));
		
	}

	public static int[] findintwo(int[][] arrays) {

		int test[] = new int[10];
		int p = 0;
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

		 for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays[i].length; j++) {
				if (h.containsKey(arrays[i][j])) {
					int val = h.get(arrays[i][j]);
					h.put(arrays[i][j], ++val);
				} else {
					h.put(arrays[i][j], 1);
				}
			}
		}
			
		for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
			if (entry.getValue() == 2){
				test[p++] = entry.getKey();
			}
		}
			
		return test;

	}
}
