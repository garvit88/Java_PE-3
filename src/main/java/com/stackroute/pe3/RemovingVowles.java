package com.stackroute.pe3;

public class RemovingVowles {
	
	/*
	 * removeVowels() function take string of array as input which consists of all the places from which vowel
	 * has to be removed
	 * In this for each word in the string, we traverse the whole string character by character and check for
	 * each character that if it is a vowel or not. If it is not a vowel than we make a separate string of non 
	 * vowel characters
	 */
	
	public String[] removeVowels(String[] places) {
		
		String[] wordsWithoutVowles = new String[places.length];
		String place = "";
		for(int i = 0; i < places.length; i++) {
			for(int j=0; j<places[i].length(); j++) {
		       if (!isVowel(places[i].charAt(j))) {
		         place = place + places[i].charAt(j);
		       }
		     }
			wordsWithoutVowles[i] = place;
			place = "";
		}
		
		return wordsWithoutVowles;
	}
	
	/*
	 * isVowel() function check if the giving character is a vowel or not. it return boolean i.e., if the 
	 * charcter is vowel. for this character is compared to vowels and if it is equal it return true
	 * otherwise false.
	 */
	
	static boolean isVowel(char c)
	   {
	     String vowels = "aeiou";
	     int i;
	     for(i=0; i<5; i++)
	     {
	       if(c == vowels.charAt(i))
	       {
	         return true;
	       }
	     }
	     return false;
	   }
	
 }
