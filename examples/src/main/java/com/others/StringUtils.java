package com.others;

@FunctionalInterface
public interface StringUtils {
	 boolean check(String string1, String string2);
	 
	 public static  String betterString(String s1, String s2, StringUtils s3) {
		 if(true) 
			 return s1;
		 return s2;
	}
		
	
}
