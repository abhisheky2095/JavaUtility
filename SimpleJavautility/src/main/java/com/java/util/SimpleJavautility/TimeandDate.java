package com.java.util.SimpleJavautility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/**
 * @author Abhishek Pandey
 *
 */

public class TimeandDate {
	public static void main(String args[]) throws ParseException {
		String timezone = "2018-09-20T06:31:02.072Z";
		UTCtoEpoch(timezone);
		DiffbwtwoDates();
		DiffbwtwoTimes();
	}
	
	
	public static long UTCtoEpoch(String timezone) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
	    df.setTimeZone(TimeZone.getTimeZone("UTC"));
		Date date = df.parse(timezone);
		long epoch = date.getTime()/1000;          //here time in epoch seconds.
		
		System.out.println("Time in epoch seconds : "+String.valueOf(epoch)+ "\nActual time in UTC: " + timezone); 
		return epoch;
	}
	
	public static void DiffbwtwoDates() throws ParseException {
		SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
		String inputString1 = "23-01-2018";
		String inputString2 = "23-04-2018";

		try {
		    Date date1 = myFormat.parse(inputString1);
		    Date date2 = myFormat.parse(inputString2);
		    long diff = date2.getTime() - date1.getTime();
		    System.out.println ("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
		} catch (ParseException e) {
		    e.printStackTrace();
		}
	}
	
	public static void DiffbwtwoTimes() throws ParseException {
		String timezone = "2018-09-20T06:31:02.072Z";
		long currentEpochTime = System.currentTimeMillis()/1000;
		long givenTime = TimeandDate.UTCtoEpoch(timezone);

		long timeDiff = currentEpochTime - givenTime;     //in seconds 
		final long day = TimeUnit.MILLISECONDS.toDays(timeDiff*1000);

		final long hours = TimeUnit.MILLISECONDS.toHours(timeDiff*1000)
				- TimeUnit.DAYS.toHours(TimeUnit.MILLISECONDS.toDays(timeDiff*1000));

		final long minutes = TimeUnit.MILLISECONDS.toMinutes(timeDiff*1000)
				- TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(timeDiff*1000));

		final long seconds = TimeUnit.MILLISECONDS.toSeconds(timeDiff*1000)
				- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(timeDiff*1000));

		System.out.println(String.format("%d Days %d Hours %d Minutes %d Seconds ", day, hours, minutes, seconds));

	}
}
