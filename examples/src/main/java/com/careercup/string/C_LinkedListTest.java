package com.careercup.string;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Test class for {@link C_LinkedListTest}.
 * 
 * @author anandmohan
 *
 */
public class C_LinkedListTest {

	private LinkedList list;
	private Object[] input;

	@BeforeClass
	public void setUp() {
		list = new LinkedList();
	}

	@Test
	public void testAdd() {
		givenInput();
		whenAddCalled();
		thenVerifyOutput();
	}

	private void givenInput() {
		input = new Object[4];
		input[0] = "abc";
		input[1] = "def";
		input[2] = "ghi";
		input[3] = "jkl";
	}

	private void whenAddCalled() {
		list.add(input[0]);
		list.add(input[1]);
		list.add(input[2]);
		list.add(input[3]);
	}

	private void thenVerifyOutput() {
		final String outputToString = list.toString();
		final String xpectedToString = "[" + input[0] + "," + input[1] + "," + input[2] + "," + input[3] + "]";
		assertEquals(outputToString, xpectedToString);
	}

}
