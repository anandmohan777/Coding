package com.careercup.string;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Test class for {@link A_checkunique}.
 * 
 * @author anandmohan
 */
public class A_checkuniqueTest {

	private A_checkunique checkunique;
	private String input;
	private boolean output;

	@BeforeClass
	public void setUp() {
		checkunique = new A_checkunique();
	}

	@Test
	public void testFunctionTrue() {
		givenInputTrue();
		whenTestFunctionrequested();
		thenVerifyRetreivedTrue();
	}
	
	@Test
	public void testFunctionFalse() {
		givenInputFalse();
		whenTestFunctionrequested();
		thenVerifyRetreivedFalse();
	}

	private void givenInputTrue() {
		input = "abcdefghij";
	}
	
	private void givenInputFalse() {
		input = "anand";
	}

	private void whenTestFunctionrequested() {
		output = checkunique.function(input);
	}

	private void thenVerifyRetreivedTrue() {
		assertEquals(output, true);
	}
	
	private void thenVerifyRetreivedFalse() {
		assertEquals(output, false);
	}

}