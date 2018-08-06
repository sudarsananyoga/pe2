package com.stackroute.pe2;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PowerTest {
	private static Power p;
    @BeforeClass
    public static void setup()
    {
    	p=new Power();
    }
    @AfterClass
    public static void teardown()
    {
    	p=null;
    }

	@Test
	public void test1() {
		boolean result=p.checkpow(64);
		assertEquals(true,result);
	}
	public void test2() {
		boolean result=p.checkpow(22);
		assertEquals(false,result);
	}
	
	public void test() {
		fail("Not yet implemented");
	}

}
