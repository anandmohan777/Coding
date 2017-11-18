package com.careercup.string;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class B_compressionTest {
	
	private B_compression b_compression;
	private String input;
	private String output;
	
	@BeforeClass
	public void setup() {
		b_compression = new B_compression();
	}
	
	@Parameters
	@Test
	public void testFunctionPositive() {
		givenInput();
		whenfunctionrequested();
		thenVerifyOutput();
	}
	
	@Test
	public void testFunctionPositive2() {
		givenInput2();
		whenfunctionrequested();
		thenVerifyOutput2();
	}

	private void givenInput() {
		input = "AABBCC";
    }
	
	private void givenInput2() {
		input = "ABCCCCCCCCCD";
    }

	private void whenfunctionrequested() {
		output = b_compression.function(input);
    }

	private void thenVerifyOutput() {
		assertEquals(output, "A2B2C2");
    }
	
	private void thenVerifyOutput2() {
		assertEquals(output, "A1B1C9D1");
    }
}
