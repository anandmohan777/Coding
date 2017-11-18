	package com.coding_interview;

import java.util.Arrays;

// Its having only O(n) complexity
	class _4_8  {
			
		public static void main(String[] args) throws Exception {
			
			int[] ages={30,20,21,34,50,20,60,30,40};
			
			int older=99;
			int store[]=new int[older+1];
			
			for(int i=0;i<ages.length;i++){
				int age=ages[i];
				store[age]=store[age]+1;
			}
			
		    int i=0;
			for(int j=0;j<store.length;j++){
				if(store[j]>0){
				  ages[i++]=j;	
				}			
		
			}
			
			System.out.println(Arrays.toString(ages));
			
		}
	
	}
