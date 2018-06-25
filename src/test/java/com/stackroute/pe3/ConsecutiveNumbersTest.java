package com.stackroute.pe3;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConsecutiveNumbersTest {

	static ConsecutiveNumbers consecutivenumbers;
	
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		consecutivenumbers = new ConsecutiveNumbers();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		consecutivenumbers = null;

	}
	
	@Test
	public void testCheckLength(){
		assertTrue(
				"testCheckLength(): testCheckLength function failed, the value returned by the function is false",
				consecutivenumbers.checkCosecutiveNumbers("1,2,3,4,5,6,7"));
		assertFalse(
				"testCheckLength(): testCheckLength function failed, the value returned by the function is true",
				consecutivenumbers.checkCosecutiveNumbers("1,2,3,4,5"));
	}
	
	@Test
	public void testConsecutiveNumberForward(){
		assertTrue(
				"testConsecutiveNumberForward(): testConsecutiveNumberForward function failed, the value returned by the function is false",
				consecutivenumbers.checkCosecutiveNumbers("1,2,3,4,5,6,7"));
		assertFalse(
				"testConsecutiveNumberForward(): testConsecutiveNumberForward function failed, the value returned by the function is true",
				consecutivenumbers.checkCosecutiveNumbers("1,2,3,4,5,6,6"));
	}
	
	@Test
	public void testConsecutiveNumberBackward(){
		assertTrue(
				"testConsecutiveNumberBackward(): testConsecutiveNumberBackward function failed, the value returned by the function is false",
				consecutivenumbers.checkCosecutiveNumbers("98,97,96,95,94,93,92"));
		assertFalse(
				"testConsecutiveNumberBackward(): testConsecutiveNumberBackward function failed, the value returned by the function is true",
				consecutivenumbers.checkCosecutiveNumbers("98,96,95,94,93,92,92"));
	}
	
	@Test
	public void testConsecutiveNumbersFailure() {
		assertNotNull(
				"testConsecutiveNumbersFailure(): testConsecutiveNumbersFailure function failed, giving null values",
				consecutivenumbers.checkCosecutiveNumbers("1,2,3,4,5"));
	}
}
