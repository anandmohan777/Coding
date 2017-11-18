	package com.coding_interview;
	
	public class _6 {
		public static void main(String[] args) {
			int[] n=new int[]{1,2,3,4,5,5,6,2,3};
	
			int len=n.length;
			boolean b[]=new boolean[len];
			for(int i=0;i<len;i++){
				if( b[n[i]]==true ){
					System.out.print(n[i]+",");
				}else{
					b[n[i]]=true;
				}
			}
			
		
		}
	}
