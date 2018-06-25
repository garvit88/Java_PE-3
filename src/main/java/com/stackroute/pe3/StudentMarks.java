package com.stackroute.pe3;

public class StudentMarks {

	/*
	 * StudentMarks() method will take number of students and grade of each student in an array
	 * number of students and grade available for each student should match if is doesn't mathes the program 
	 * will throw an exception that No of students and Student Grades are not equal
	 * Also, the grade of each student should be in a range of 0 - 100 if this condition is not valid then
	 * also method will throw and exception that the grade is not in a valid range.
	 */
	
	public String studentMarks(int numOfStudents, int[] studentGrades) throws Exception {
		
		if(studentGrades.length != numOfStudents) {
			throw new Exception("No of students and Student Grades are not equal");
		}
		
		for(int i = 0; i < numOfStudents; i++) {
			if(studentGrades[i] < 0 || studentGrades[i] > 100) {
				throw new Exception("Grades not in a valid range");
			}
		}
		
		return "Done";
	}
}
