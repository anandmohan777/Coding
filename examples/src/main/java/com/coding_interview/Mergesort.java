package com.coding_interview;

import java.util.Arrays;

public class Mergesort   extends a {

	void mergesort(int[] array) {
		int[] helper = new int[array.length];
		mergesort(array, helper, 0, array.length - 1);
	}

	void mergesort(int[] array, int[] helper, int low, int high) {
		if (low < high) {
			int middle = (low + high) / 2;
			mergesort(array, helper, low, middle); // Sort left half
			mergesort(array, helper, middle + 1, high); // Sort right half
			System.out.println("low: "+ low+" middle: "+ middle+" high: "+ high); // Merge them
		}
	}

	public static void main(String[] args) {
		/*int arr[]= {1,2,3,4,5,6,7,8,9,10};
		Arrays.sort(arr);
		new Mergesort().mergesort(arr);*/
		Mergesort m=new Mergesort();
		a a2=new a();
		System.out.println(m.a1);
		System.out.println(a2.a1);
		
		a2.a1=20;
		System.out.println(m.a1);
		System.out.println(a2.a1);
	}
	
}

class a{
	 int a1=10;
}
