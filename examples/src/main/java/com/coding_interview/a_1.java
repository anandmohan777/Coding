package com.coding_interview;

public class a_1 {
	public static void main(String[] args) {

		String s="dalad";
		String s2= (new StringBuffer(s)).reverse().toString();
		if(s.equals(s2)){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not a Palindrome");
		}
		
		//How to get half of a number 10 = 0000 1010 
		System.out.println("half"+(10>>1));
		/*
		 1. One approch above
		 2. another approach
		 
		int IsPalindrome(const char* const string) {
			int palindrome = 1;
			if(string != NULL) {
			int length = strlen(string);
			
			int half = length >> 1; 
			int i;
			for(i = 0; i < half; ++ i) {
			if(string[i] != string[length - 1 - i]) {
			palindrome = 0;
			break;
			}
		}
		  
		3. another approach
		int IsPalindrome_solution2(unsigned int number) {
			int reversed = 0;
			int copy = number;
			while(number != 0) {
			reversed = reversed * 10 + number % 10;
			number /= 10;
			}
			return (reversed == copy) ? 1 : 0;
		} 
		  
		 */
		System.out.println(10%5);
		
		/*for(int i=0;i<10;i=i%10){
			System.out.println(++i);
		}*/
		 
	}
}
