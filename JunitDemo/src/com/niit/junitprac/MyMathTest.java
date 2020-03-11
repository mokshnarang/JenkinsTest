package com.niit.junitprac;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {
	
	MyMath myMath=new MyMath();
	
	@Test
	public void sum_with3numbers(){
		System.out.println("Test1");
		assertEquals(6, myMath.sum(new int[]{1,2,3}));
	}
	
	@Test
	public void sum_with1number(){
		System.out.println("test 2");
		assertEquals(3, myMath.sum(new int[] { 3 }));
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

/*	@Test
	public void testMyMath() {
		fail("Not yet implemented");
	}

	@Test
	public void testSum() {
		fail("Not yet implemented");
	}*/

}
