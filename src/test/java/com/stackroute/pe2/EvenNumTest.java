package com.stackroute.pe2;
import static org.junit.Assert.*;
import org.junit.*;
public class EvenNumTest {
	public static EvenNumber even;

	@BeforeClass
	public static void setup() {
		even=new EvenNumber();
				}
 	@AfterClass
	public static void teardown() {
	}
 	@Test
	public void testEven() {
 		Boolean result=even.isEven(10);
		assertEquals(true,result);
	}
	
	@Test
	public void testNotEven() {
		Boolean result=even.isEven(3);
		assertEquals(false,result);
	}
	
	@Test
	public void testEvenFailure() {
		Boolean result=even.isEven(8);
		assertEquals(true,result);
	}
 }