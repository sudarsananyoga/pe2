package com.stackroute.pe2;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MemberVariableTest {
	private static MemberVariable m;
    @BeforeClass
    public static void setup()
    {
    m=new MemberVariable("Harry Potter",30,2500.3);
    }
    @AfterClass
    public static void teardown()
    {
    	m=null;
    }
	@Test
	public void test1() {
	  String result=m.var();
		assertEquals("Harry Potter 30 2500.3",result);
	}
	public void test2() {
		  String result=m.var();
			assertEquals("ERROR",result);
		}
	public void test() {
		fail("Not yet implemented");
	}

}
