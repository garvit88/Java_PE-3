package com.stackroute.pe3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalculateDateOfWeek {
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
		c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		System.out.println(df.format(c.getTime()));
		c.add(Calendar.DATE, 6);
	    System.out.println(df.format(c.getTime()));
	}
 	
}
