package com.geeksforgeeks.array;

import java.util.Arrays;

/**
 * Problem: Search, insert and delete in an unsorted array
 * http://www.geeksforgeeks.org/search-insert-and-delete-in-an-unsorted-array/
 * 
 * @author anandmohan
 *
 */
public class a1 {

	public static void main(String[] args) {
		final int a[] = { 2, 4, 5, 1, 66, 43, 12, 0, 33, 66, 2, 3 };
		final int search = 66;
		delete(a, search);
		System.out.println(Arrays.toString(a));
	}

	public static void delete(int a[], int search) {
		int indexInArray[] = new int[a.length];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == search) {
				indexInArray[count++] = i;
				a[i] = 0;
			}
		}

		int start = 0;
		while (indexInArray.length > start && indexInArray[start] > -1) {
			for (int i = indexInArray[start]; i < indexInArray.length - 1; i++) {
				a[i] = a[i+1];
			}
			start++;
		}
	}

}
