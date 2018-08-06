package com.stackroute.pe2;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
public class StuGradeTest {
	private static StuGrade sg;
	static int[] maxarr;
	static int[] minarr;
	static int[] avgarr;
	@BeforeClass
	public static void setup() {
			sg = new StuGrade();
		  avgarr = new int[] {40,40,40};
		  minarr  = new int[] {2,50,12};
		  maxarr = new int[] {100,20,3};
	}
	@AfterClass
	public static void teardown() {
		sg = null;
	
	}
	@Test
	public void testMin() {
		int answer;
		answer=sg.min(minarr);
		assertEquals(2,answer);
	}
	
	@Test
	public void testMax() {
		int answer;
		answer=sg.max(maxarr);
		assertEquals(100,answer);
	}
	@Test
	public void testAvg() {
		int answer;
		answer=sg.avg(avgarr);
		assertEquals(40,answer);
	}
}