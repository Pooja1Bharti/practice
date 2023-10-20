package com.example;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

public class DateExample {

	public static void main(String[] args) throws ParseException {
		LocalDateTime time= LocalDateTime.now();
		
		final ConcurrentHashMap  timrwef= 6999L;
		LocalDateTime time2= LocalDateTime.of(2023,05,22, 12, 57, 59, 0 );
		System.err.println("2023-05-22T14:57:29.007946900");
		/* LocalTime localtime = time.toLocalTime(); */
		/*
		 * String t=localtime.format(DateTimeFormatter.ofPattern("HH:mm:ss")); String
		 * to= "12.10.00";
		 */
		//LocalDateTime localtime= LocalDateTime.
		
		 Date date2 = Date.from(time.atZone(ZoneId.systemDefault()).toInstant());
		 Date date1= Date.from(time2.atZone(ZoneId.systemDefault()).toInstant());
		 

			/*
			 * SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss"); Date date1 =
			 * format.parse(t); Date date2 = format.parse(to);
			 */
		long difference = date2.getTime() - date1.getTime();
	long second=	difference/1000;
		
		
		// TODO Auto-generated method stub

	}

}
