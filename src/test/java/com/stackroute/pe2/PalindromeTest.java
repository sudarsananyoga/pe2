package com.stackroute.pe2;

import static org.junit.Assert.*;

import org.junit.*;

public class PalindromeTest {
	private static Palindrome p;
    @BeforeClass
    public static void setup()
    {
    	p=new Palindrome();
    }
    @AfterClass
    public static void teardown()
    {
    	p=null;
    }
	@Test
	public void test() {

		String result=p.palin(2552);
		assertEquals("true",result);
	}
		public void test1() {
		String result=p.palin(3333);
		assertEquals("true",result);
    
	}
		public void test2() {
		String result=p.palin(2457);
		assertEquals("false",result);
	    
		}
		public void test3() {
			fail("Not yet implemented");
		}
}
