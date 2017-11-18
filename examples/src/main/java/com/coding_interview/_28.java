package com.coding_interview;

import java.awt.print.Printable;

public class _28 {

	public static void main(String[] args) {
		int i[]={1, 10, 8, 7, 6, 5,3, 2, 1, 0};
		int s,e,m;
		for(s=0,e=i.length-1; ; ){
			m=(s+e)/2;
			
			if(s==m){
				break;	
			}if(i[m-1]<=i[m]&&i[m]<=i[m+1]){
				s=m;
				
			}else if(i[m-1]>=i[m]&&i[m]>=i[m+1]){
				e=m;
			}else{
				System.out.println("result="+i[m]);
				break;
			}
				
				
		}
	
	}

}
