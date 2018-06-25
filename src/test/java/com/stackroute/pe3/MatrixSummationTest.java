package com.stackroute.pe3;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MatrixSummationTest {
	
	static MatrixSummation matrixsummation ;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		matrixsummation = new MatrixSummation();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		matrixsummation = null;

	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void validateLength() throws Exception {
		matrixsummation.calculateSum(3, 3, new int[][] {{2, 2, 2}, {2, 2, 3}}, new int[][] {{-1, 2, -2}, {3, 3, 3}});
	}
	
	@Test
	public void testCalculateSum() {
		Assert.assertArrayEquals(
				"testCalculateSum(): testCalculateSum function failed, the value returned by the function is not as expected",
				new int[][] {{2, 4, 6}, {10, 4, 6}}, 
				matrixsummation.calculateSum(2, 3, new int[][] {{1, 2, 3}, {5, 2, 3}}, new int[][] {{1, 2, 3}, {5, 2, 3}}));
		
		Assert.assertArrayEquals(
				"testCalculateSum(): testCalculateSum function failed, the value returned by the function is not as expected",
				new int[][] {{1, 4, 0}, {5, 5, 6}}, 
				matrixsummation.calculateSum(2, 3, new int[][] {{2, 2, 2}, {2, 2, 3}}, new int[][] {{-1, 2, -2}, {3, 3, 3}}));
	}
	
	@Test
	public void testCalculateSumFailure() {
		assertNotNull(
				"testStudentmarksFailure(): studentMarks function failed, giving null values",
				matrixsummation.calculateSum(2, 3, new int[][] {{5, 6, 9}, {5, 2, 3}}, new int[][] {{1, 2, 3}, {5, 2, 3}}));
	}

}
