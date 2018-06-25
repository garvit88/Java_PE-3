package com.stackroute.pe3;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class StudentMarksTest {

	static StudentMarks studentmarks;
	
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		studentmarks = new StudentMarks();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		studentmarks = null;

	}
	
	@Test(expected = Exception.class)
	public void validateLength() throws Exception {
		studentmarks.studentMarks(3, new int[]{1,3,4,7});
	}
	
	@Test(expected = Exception.class)
	public void validateRangeOfGrades() throws Exception {
		studentmarks.studentMarks(3, new int[]{1,3,400});
	}
	
	@Test
	public void testStudentmarks() throws Exception{
		assertEquals(
				"testStudentmarks(): testStudentmarks function failed, the value returned by the function is not as expected",
				"Done",studentmarks.studentMarks(3, new int[]{1,93,40}));
	}
	
	@Test
	public void testStudentmarksFailure() throws Exception {
		assertNotNull(
				"testStudentmarksFailure(): studentMarks function failed, giving null values",
				studentmarks.studentMarks(4, new int[]{16,93,10,50}));
	}
}
