package com.stackroute.pe3;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratingExceptionsTest {

	static GeneratingExceptions generatingexceptions;
	
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		generatingexceptions = new GeneratingExceptions();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		generatingexceptions = null;

	}
	
	@Test
	public void negativeArraySizeExceptionTest() throws Exception{
		assertEquals(
				"testStudentmarks(): testStudentmarks function failed, the value returned by the function is not as expected",
				"java.lang.NegativeArraySizeException",generatingexceptions.negativeArraySizeException());
	}

	@Test
	public void indexOutOfBoundExceptionTest() throws Exception{
		assertEquals(
				"indexOutOfBoundExceptionTest(): indexOutOfBoundExceptionTest function failed, the value returned by the function is not as expected",
				"java.lang.ArrayIndexOutOfBoundsException: 4",generatingexceptions.indexOutOfBoundException());
	}
	
	@Test
	public void nullPointerExceptionTest() throws Exception{
		assertEquals(
				"nullPointerExceptionTest(): nullPointerExceptionTest function failed, the value returned by the function is not as expected",
				"java.lang.NullPointerException",generatingexceptions.nullPointerException());
	}

}
