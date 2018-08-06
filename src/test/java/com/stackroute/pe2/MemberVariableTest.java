package com.stackroute.pe2;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MemberVariableTest {
 
	@Test
	public void test1() {
		MemberVariable m1=new MemberVariable("Harry Potter",30,2500.3);
	  String result=m1.var();
		assertEquals("Harry Potter 30 2500.3",result);
	}
	public void test2() {
		MemberVariable m1=new MemberVariable("bob",40,2500.3);
		  String result=m1.var();
			assertEquals("ERROR",result);
		}
	public void test() {
		fail("Not yet implemented");
	}

}
