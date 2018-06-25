package com.stackroute.pe3;

public class ConsecutiveNumbers {
	
	/*
	 * checkCosecutiveNumbers() method check if the given String is series of consecutive no's or not
	 * First we split the string into string array of numbers by splitting it by ","
	 * Then the length of the array should be 7, if it is not a case then then the method returns false
	 * Then the string array is converted into a integer array to perform manipulations
	 * int array no is then passed to traverseForwad() and traverseBackward() methods to check if the array is 
	 * consecutive or not.
	 * if both method return it is not in the consecutive format than this method returns false and if any of  
	 * the case is true then the true is returned.
	 */

	public boolean checkCosecutiveNumbers(String numbers) {
		String[] num = numbers.split(",");
		
		if(num.length != 7) {
			return false;
		}
		
		int[] no = new int[num.length];
		for(int i = 0; i < num.length; i++) {
			no[i] = Integer.parseInt(num[i]);
		}
		boolean result = false;
		boolean traverseForward = traverseForward(no);
		boolean traverseBackward =  traversebackward(no);
		
		if(!traverseForward  && !traverseBackward) {
			result= false;
		} else {
			result = true;
		}
		
		return result;
	}
 	
	/*
	 * traverseForward() method traverse the array in forward direction to see if the given array is list of
	 * consecutive no.
	 * in this loop is run over array of given no's and the next no should always be greater by one to satisfy
	 * the condition that the given list is a consecutive no.
	 */
	
	public boolean traverseForward(int[] no) {
		boolean traverseForward = true;
		for(int i = 0; i < no.length - 1; i++) {
			if(!(no[i+1] == no[i] + 1)) {
				traverseForward = false;
				break;
			}
			else {
				continue;
			}
		}
		return traverseForward;
	}
	
	/*
	 * traverseBackward() method traverse the array in backward direction to see if the given array is list of
	 * consecutive no.
	 * in this loop is run over array of given no's and the next no should always be greater by one to satisfy
	 * the condition that the given list is a consecutive no.
	 */
	
	public boolean traversebackward(int[] no) {
		boolean traverseBackward =  true;
		for(int i = no.length - 1; i != 0; i--) {
			if(!(no[i-1] == no[i] + 1)) {
				traverseBackward = false;
				break;
			}
			else {
				continue;
			}
		}
		return traverseBackward;
	}
 }
