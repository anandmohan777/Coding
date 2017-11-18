package com.others;

public class CheckingFinal implements StringUtils  {

	public static void main(String[] args) {
		StringUtils ss =new CheckingFinal();
		System.out.println(ss.check("SHivam", "Verma"));

	}

	@Override
	public boolean check(String String1, String  String2) {
		String longer = StringUtils.betterString(String1, String2, (s1, s2) -> s1.length() > s2.length());
		System.out.println(longer);
		if(longer.equalsIgnoreCase("SHivam"))
		return true;
		return false;
	}

	

	
}
