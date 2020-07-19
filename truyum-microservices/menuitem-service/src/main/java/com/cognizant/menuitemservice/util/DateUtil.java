package com.cognizant.menuitemservice.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static Date convertToDate(String date) throws ParseException {
		SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy");
		return format.parse(date);
	}
}
