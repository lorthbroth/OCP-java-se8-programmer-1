package com.ocp_topic_5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTopic5 {

	public static void main(String[] args) {
		
		Date dNow = new Date();
		SimpleDateFormat format = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		
		System.out.println("Current Date: " + format.format(dNow));
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		   //get current date time with Calendar()
		   Calendar cal = Calendar.getInstance();
		   System.out.println("Current Date Time in a different format: " + dateFormat.format(cal.getTime()));

		   cal.add(Calendar.DATE, 1);
		   System.out.println("One day from current date : " + dateFormat.format(cal.getTime()));

		   cal = Calendar.getInstance();
		   cal.add(Calendar.MONTH, 1);
		   System.out.println("One month from  current date : " + dateFormat.format(cal.getTime()));

		   cal = Calendar.getInstance();
		   cal.add(Calendar.YEAR, 1);
		   System.out.println("Anivesary to current date : " + dateFormat.format(cal.getTime()));

		   cal = Calendar.getInstance();
		   cal.add(Calendar.HOUR, 1);
		   System.out.println("Adding one hour to current date : " + dateFormat.format(cal.getTime()));

		   cal = Calendar.getInstance();
		   cal.add(Calendar.MINUTE, 1);
		   System.out.println("Adding 60 seconds to current date : " + dateFormat.format(cal.getTime()));

		   cal = Calendar.getInstance();
		   cal.add(Calendar.SECOND, 1);
		   System.out.println("Add one second to current date : " + dateFormat.format(cal.getTime()));

		   cal = Calendar.getInstance();
		   cal.add(Calendar.DATE, -1);
		   System.out.println("Yesterday was : " + dateFormat.format(cal.getTime()));

		   cal = Calendar.getInstance();
		   cal.add(Calendar.MONTH, -1);
		   System.out.println("Last month from today was : " + dateFormat.format(cal.getTime()));

		   cal = Calendar.getInstance();
		   cal.add(Calendar.YEAR, -1);
		   System.out.println("One year ago : " + dateFormat.format(cal.getTime()));

		   cal = Calendar.getInstance();
		   cal.add(Calendar.HOUR, -1);
		   System.out.println("Subtract one hour from current date : " + dateFormat.format(cal.getTime()));

		   cal = Calendar.getInstance();
		   cal.add(Calendar.MINUTE, -1);
		   System.out.println("Subtract one minute from current date : " + dateFormat.format(cal.getTime()));

		   cal = Calendar.getInstance();
		   cal.add(Calendar.SECOND, -1);
		   System.out.println("Subtract one second from current date : " + dateFormat.format(cal.getTime()));
		   System.out.println("\n");
		   System.out.println("-------------------Information about my country-----------------------");
		   Locale locale=Locale.getDefault();
		   
		   System.out.println("I come from : " + locale.getDisplayCountry().toUpperCase());
		   System.out.println("I main lanuage : " + locale.getDisplayLanguage());
		   System.out.println("Name of the : " + locale.getDisplayName());
		   System.out.println("Abriviation of my country : " + locale.getISO3Country());
		   System.out.println("Abriviation of the language is : " + locale.getISO3Language());
		   System.out.println(locale.getLanguage());
		   System.out.println("Country code : " + locale.getCountry());

	  }

	}
