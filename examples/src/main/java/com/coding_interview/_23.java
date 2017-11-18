package com.coding_interview;

public class _23 {


	public static void main(String[] args) {

		int n=6;
		
		System.out.println(FibonacciIterative(n));
	
	}
	
	//efficiency = e pow n
	static long Fibonacci( int n) {
		if(n <= 0)
		return 0;
		if(n == 1)
		return 1;
		return Fibonacci(n - 1) + Fibonacci(n - 2);
	}
	
	//efficiency = n;
	static long FibonacciIterative( int n) {		
	if(n==0)return 0;
	if(n==1)return 1;
	
	int result=1;
	int fibNMinusOne=1,fibNMinusTwo=0;
		for(int i = 2; i <= n; ++ i) {
			result = fibNMinusOne + fibNMinusTwo;
			fibNMinusTwo = fibNMinusOne;
			fibNMinusOne = result;
			}
	return result;
	
	}
	
	//more performance, efficiency = log n;

}
