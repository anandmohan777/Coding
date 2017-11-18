package com.java8;

import java.util.*;
import java.util.function.Consumer;

public class ChainConsumer {

	public static void main(String[] args) {
	    List<String> strings = Arrays.asList("one","two","three","four","five");
	    List<String> newStrings = new ArrayList<>();
	    
	    Consumer<String> c1= System.out :: println; /*or s -> System.out.println(s)*/
	    Consumer<String> c2= newStrings :: add  ; /*or s -> newStrings.add(s)*/
	    
	    strings.forEach(c1);
	    strings.forEach(c2);
	    System.out.println("result List" + newStrings);
    }
}
