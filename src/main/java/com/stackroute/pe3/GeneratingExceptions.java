package com.stackroute.pe3;

public class GeneratingExceptions {
	
	/*
	 * negativeArraySizeException() checks for the if the function throws negativeArraySizeException.
	 * For this we pass array size to be negative and catches the exception and return back in String format. 
	 */

	public String negativeArraySizeException() {
		int arrSize = -8;
		try {
		    int[] arr = new int[arrSize];
		    return "";
		} catch (NegativeArraySizeException e) {
		    return e.toString();
		}
	}
	
	/*
	 * indexOutOfBoundException checks if the function throws indexOutOfBoundException.
	 * For this we have array size of length 3 and we try to access the 4th element of array which is not valid
	 * and it throws indexOutOfBoundException and it is returned in the string format.
	 */
	
	public String indexOutOfBoundException() {
		int[] a = {1,2,3};
		try {
		System.out.println(a[4]);
		return "";
		} catch (IndexOutOfBoundsException e) {
			return e.toString();
		}
	}
	
	/*
	 * nullPointerException function checks if the function throws nullPointerException.
	 * For this one null string is comapared to non null string which is not a valid operation and 
	 * this function throws nullPointerException which is catch and exception is returned in string.
	 */
	
	public String nullPointerException() {
		String str = null;
		try {
		if(str.equals("something")) {
			System.out.println("inside if block");
		}
		return "";
		} catch(NullPointerException e) {
			return e.toString();
		}
		
	}

}
