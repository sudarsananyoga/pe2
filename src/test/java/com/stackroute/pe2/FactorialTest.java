package com.stackroute.pe2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
 public class FactorialTest {
	private static Factorial fact;
	@BeforeClass
	public static void setup() {
	fact = new Factorial();	
	}
 	@AfterClass
	public static void teardown() {
		fact = null;
	}
 	@Test
	public void testFactorial() {
		long answer;
		answer=fact.calfact(8);
		assertEquals(40320,answer);
	}
	
	@Test
	public void testNotFactorial() {
		long answer;
		answer=fact.calfact(8);
		assertNotEquals(2,answer);
	}
	
	
}