package com.others;
import java.util.*;

/***
 * Write a function to test if the given set of brackets are balanced or not. e.g. {{}}{)([][]
 */
public class Balancedpar {

	
	
	public static void main(String[] args) {
		Stack<Character> sc=new Stack<Character>();
		
		Boolean bal=false;
		final Scanner in = new Scanner(System.in);
		final String inputParanthesis = in.nextLine();
		
		for(Character c:inputParanthesis.toCharArray()){
			
			if(c=='{' || c=='(' || c=='[')
				sc.add(c);
			else{
				Character prev=null;
				
				if(!sc.isEmpty())
				prev=sc.pop();
				
				
				if(prev==null){
					bal=false;
					break;
				}else if(   (prev=='{' && c=='}') ||
							(prev=='(' && c==')') ||
							(prev=='[' && c==']')
						){
					bal=true;
					
				}else{
					bal=false;
					break;
				}
					
					
				
			}
			
		}
		
		System.out.println(bal);
		
	}
}
