package com.bcr.examples.enumexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

import sun.security.action.GetBooleanAction;

import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;

public class Main {
	
	// a-z A-Z 0-9 +-,./():'?
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		String test ="aAA123Mohan ,,,ddas-1.?'anna'";
		String regex = "^[a-zA-Z0-9+\\- ,./():'?]*$";
		System.out.println(test.matches(regex));
		
		
		SampleObject s1 = new SampleObject(1, "a1 SFDDS");
		SampleObject s2 = new SampleObject(2, "a2");
		SampleObject s4 = new SampleObject(4, "a4");
		SampleObject s3 = new SampleObject(3, "a3");

		
		Collection<String> cc= new ArrayList<>();
		cc.add("abc");
		cc.add("xyzzz");
		cc.add(null);
		System.out.println("size:" + cc.size());
		
		System.out.println(((List<String>)cc).get(2));
		
	
		
	}

}
