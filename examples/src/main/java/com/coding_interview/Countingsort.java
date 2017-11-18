package com.coding_interview;

import java.util.Arrays;

public class Countingsort {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(countingsort(new int[]{1,4,1,2,7,5,9,9,9,9,9,9})));
	}
	
	public static int[] countingsort(int a[]){
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++){
			if(a[i]>max)
				max=a[i];
		}
		
		int b[]=new int[a.length+1];
		
		if(max<a.length){
			max=a.length;
		}
		
		int countarray[]=new int[max+1];
		
		for(int i=0;i<countarray.length;i++){
			countarray[i]=0;
		}
		
		for(int i=0;i<a.length;i++){
			countarray[a[i]]=countarray[a[i]]+1;
		}
														 //[1, 4, 1, 2, 7, 5, 2]
		for(int i=1;i<countarray.length;i++){			 // 0  1  2  3  4  5  6  7
			countarray[i]=countarray[i]+countarray[i-1]; //[0, 2, 4, 4, 5, 6, 6, 7]
		}												
													     //[0, 1, 1, 2, 2, 4, 5, 7]
		for(int j=a.length-1;j>=0;j--){
			//System.out.println(j);
			b[countarray[a[j]]]=a[j];
			countarray[a[j]]=countarray[a[j]]-1;
		}
			
		return b;
	}
}
