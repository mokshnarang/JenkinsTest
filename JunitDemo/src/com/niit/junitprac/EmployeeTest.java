package com.niit.junitprac;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeeTest {

	@Test
	public void mySimpleEqualsTest(){
		String expectedName="Raj";
		assertEquals(expectedName, Employee.getEmpNameWithHighestSalary());
	}
	
	@Test
	public void myObjectEqualsTest(){
		Employee expectedEmpObj=new Employee(1, "Raj", 15000);
		assertEquals(expectedEmpObj, Employee.getHighestPaidEmployee());
	}
	/*
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

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testEmployee() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEmpNameWithHighestSalary() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetHighestPaidEmployee() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEmpId() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetEmpId() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetName() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSalary() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSalary() {
		fail("Not yet implemented");
	}
*/
}
