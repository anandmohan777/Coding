package com.string;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class A_bruteforceTest {

	private A_bruteforce bruteForce;

	@Before
	public void setup() {
		bruteForce = new A_bruteforce();
		//System.out.println("run");
	}

	@After
	public void tearDown() {
		//System.out.println("after each method");
	}

	private String input1;
	private String input2;
	private String expected;
	
	public A_bruteforceTest(String input1, String input2, String ouput) {
	    this.input1 = input1;
	    this.input2 = input2;
	    this.expected = ouput;
    }

	@Parameters
	public static Collection<String[]> giveparameters() {
		String s[][] = {{"abcdefghf","defc", "-1"},
				         {"abcdefghf", "ghf", "6"}};
		return Arrays.asList(s);
	}

	@Test
	public void findMatchfailTest() {
		String result = String.valueOf(bruteForce.findMatch(input1.split(""),input2.split("")));
		assertEquals(result, expected);
	}

	@Test
	public void findArrayEqualsTest() {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int b[] = { 2, 3, 1, 5, 6, 4 };
		Arrays.sort(b);
		assertArrayEquals(b, a);
	}

	@Test(expected = NullPointerException.class)
	public void nullExceptionTest() {
		String s = null;
		s.toCharArray();
	}

	public void findMatchPassTest() {
		int result = bruteForce.findMatch("abcdefghf".split(""), "ghf".split(""));
		assertEquals(6, result);
	}

}
