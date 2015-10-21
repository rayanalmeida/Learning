package com.shc.learning.date;

import java.util.Calendar;

public class DateBehavior {

	public static void main(String args[]) {
		DateBehavior.getDate();
	}
	
	public static void getDate() {
		Calendar dateWithNoTime = Calendar.getInstance();
		System.out.println(dateWithNoTime.getTime());
		dateWithNoTime.set(Calendar.HOUR_OF_DAY, 0);
		dateWithNoTime.set(Calendar.MINUTE, 0);
		dateWithNoTime.set(Calendar.SECOND, 0);
		dateWithNoTime.set(Calendar.MILLISECOND, 0);
		
		System.out.println(dateWithNoTime.getTime());
		//Default date is yesterday 12:00:00 AM
		//Date startDate = DateUtils.addDays(dateWithNoTime.getTime(), -1);
	}
}
