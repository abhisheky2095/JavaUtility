package com.java.util.SimpleJavautility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author Abhishek Pandey
 *
 */

public class UTCtoEpoch {
	public static void main(String args[]) throws ParseException {
		String timezone = "2018-09-20T06:31:02.072Z";    //also can be input from user
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
	    df.setTimeZone(TimeZone.getTimeZone("UTC"));
		Date date = df.parse(timezone);
		long epoch = date.getTime()/1000;          //here time in epoch seconds.
		
		System.out.println("Time in epoch seconds : "+String.valueOf(epoch)+ "\nActual time in UTC: " + timezone); 
	}
}
