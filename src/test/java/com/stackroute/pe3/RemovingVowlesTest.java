
package com.stackroute.pe3;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class RemovingVowlesTest {
	
	static RemovingVowles removingvowles;
	
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		removingvowles = new RemovingVowles();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		removingvowles = null;

	}

	@SuppressWarnings("deprecation")
	@Test
	public void testRemovingVowles() {
		assertEquals(
				"testRemovingVowles(): testRemovingVowles function failed, the value returned by the function is not as expected",
				new String[] {"Ind","Untd Stts","Grmny","Egypt"},removingvowles.removeVowels(new String[] {"India","United States","Germany","Egypt"}));
	}
	
	@Test
	public void testIsVowel() {
		assertTrue(
				"testIsVowel(): testIsVowel function failed, the value returned by the function is not as expected",
				RemovingVowles.isVowel('a'));
		assertFalse(
				"testIsVowel(): testIsVowel function failed, the value returned by the function is not as expected",
				RemovingVowles.isVowel('b'));
		}
	
	@Test
	public void testStudentmarksFailure() {
		assertNotNull(
				"testStudentmarksFailure(): testStudentmarksFailure function failed, giving null values",
				removingvowles.removeVowels(new String[] {"India","United States","Germany","Egypt"}));
	}
	
	@Test
	public void testIsVowelFailure() {
		assertNotNull(
				"testIsVowelFailure(): testIsVowelFailure function failed, giving null values",
				RemovingVowles.isVowel('b'));
	}

}
