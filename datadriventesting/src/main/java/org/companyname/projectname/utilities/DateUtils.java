package org.companyname.projectname.utilities;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class DateUtils {

	
	public DateUtils(){
		
	}
	
	
	public static String getLogTime(){
		return getTimeStampByFormat("yyyy-MM-dd HH:mm:ss");
	}
	
	
	public static String getTimeStampByFormat(String format){
		DateFormat dateFormat = new SimpleDateFormat(format);
		Calendar cal = Calendar.getInstance();
		return dateFormat.format(cal.getTime());
	}
	
	public static String formatDateTime(String datetime, String format) throws TestingException{
		Calendar cal = Calendar.getInstance();
		Date date = null;
		List<String> knownFormats = getKnownDateFormats();
		Iterator var6 = knownFormats.iterator();
		
		while(var6.hasNext()){
			String knownFormat = (String)var6.next();
			try{
				date = (new SimpleDateFormat(knownFormat)).parse(datetime);
				break;
			}
			catch(ParseException var10){
				;
			}
		}
		
		try{
			cal.setTime(date);
			DateFormat dateFormat = new SimpleDateFormat(format);
			return dateFormat.format(cal.getTime());
		}
		catch(Exception var9){
			throw new TestingException("Unknown date format '"+format+"': "+var9.getMessage());
			
		}
	}
	
	public static Date getDateInFormat(String datetime, String format){
		String string = datetime;
		DateFormat dateformat = new SimpleDateFormat(format, Locale.ENGLISH);
		Date date = null;
		
		try{
			date = dateformat.parse(string);
			}
		catch(ParseException var6){
			var6.printStackTrace();
		}
		
		return date;
	}
	
	public static long dateDiff(String dateString1, String dateString2) throws ParseException, TestingException{
		
		dateString1 = dateString1.replaceAll("T", " ");
		dateString2 = dateString2.replaceAll("T", " ");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		dateString1 = formatDateTime(dateString1, "yyyy-MM-dd HH:mm:ss");
		dateString2 = formatDateTime(dateString2, "yyyy-MM-dd HH:mm:ss");
		Date date1 = format.parse(dateString1);
		Date date2 = format.parse(dateString2);
		long ret = date2.getTime() - date1.getTime();
		return ret/1000L;
				
		
	}
	
	private static List<String> getKnownDateFormats(){
		List<String> ret = new ArrayList();
		ret.add("MM/dd/yyyy");
		ret.add("MM-dd-yyyy hh:mm:ss a");
		ret.add("yyyy-MM-dd HH:mm:ss");
		ret.add("MM-dd-yyyy hh:mm a");
		ret.add("yyyy-MM-dd");
		
		return ret;
	}
	
	
	public static Date stringToDate(String date, String format) throws TestingException{
		DateFormat dateFormat = new SimpleDateFormat(format, Locale.ENGLISH);
		Date ret = null;
		
		try{
			ret = dateFormat.parse(date);
			return ret;
		}
		catch(ParseException var5){
			throw new TestingException("Unable to parse '"+date+" ' date into '"+ format+"' format"+var5.getMessage());
			
		}
	}
	
	public static String dateToString(Date date, String format){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		DateFormat dateFormat = new SimpleDateFormat(format);
		return dateFormat.format(cal.getTime());
	}
	
	public static int getDateDiffInDays(Date date1, Date date2){
		long diff = date2.getTime() - date1.getTime();
		return (int)(diff/86400000L); 
	}
	
	public static int getDateDiffInMonths(Date date1, Date date2){
		Calendar startCalendar = new GregorianCalendar();
		startCalendar.setTime(date1);;
		Calendar endCalendar = new GregorianCalendar();
		endCalendar.setTime(date2);
		int diffYear = endCalendar.get(1) - startCalendar.get(1);
		int diffMonth = diffYear *12 + endCalendar.get(2) - startCalendar.get(2);
		return diffMonth;
	}
}
