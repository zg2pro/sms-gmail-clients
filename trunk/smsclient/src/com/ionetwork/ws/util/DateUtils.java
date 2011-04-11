/**
 * 
 */
package com.ionetwork.ws.util;

/**
 * @author nghidt
 *
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils
{
	
	public static SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	public static long HALF_HOUR = 0x1b7740L;
	public static long HOUR = 0x36ee80L;
	
	public DateUtils()
	{
	}
	
	public static Date getDate()
	{
		return Calendar.getInstance().getTime();
	}
	
	public static Date getDate(long l)
	{
		return new Date(l);
	}
	
	public static long getTime()
	{
		return Calendar.getInstance().getTimeInMillis();
	}
	
	public static Date getDateFromNow(long l)
	{
		Date date = getDate();
		return new Date(date.getTime() + l);
	}
	
	public static long getTimeFromNow(long l)
	{
		return getTime() + l;
	}
	
	public static long getIntervalTillTime(long l)
	{
		return Math.max(0L, l - getTime());
	}
	
	public static long getIntervalFromTime(long l)
	{
		return Math.max(0L, getTime() - l);
	}
	
	public static Date getDate(Date date, long lauchtime)
	{
		return new Date(date.getTime() + lauchtime);
	}
	
	public static String formatTaskTimeString(long remain, long endtime)
	{
		return formatTaskTimeString(endtime);
	}
	
	public static String formatTaskTimeString(long endtime)
	{
		long remain = Math.max(0L, endtime - getTime());
		return (new StringBuilder()).append(formatTimeString(remain)).append("/").append(formatDateString(getDate(endtime))).toString();
	}
	
	public static String formatDateString(Date d)
	{
		StringBuffer result = new StringBuffer("");
		SimpleDateFormat bartDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		String datearr[] = bartDateFormat.format(d).split("-");
		result.append(datearr[3]).append(":").append(datearr[4]).append(":").append(datearr[5]);
		return result.toString();
	}
	
	public static String formatDate(Date d, String format)
	{
		SimpleDateFormat bartDateFormat = new SimpleDateFormat(format);
		return bartDateFormat.format(d);
	}
	
	public static String format(long l, String format)
	{
		Date d = getDate(l);
		SimpleDateFormat bartDateFormat = new SimpleDateFormat(format);
		String datearr = bartDateFormat.format(d);
		return datearr;
	}
	
	public static String formatTimeString(long millisecond)
	{
		millisecond = millisecond >= 0L ? millisecond : -millisecond;
		int seconds = (int)(millisecond / 1000L);
		StringBuffer result = new StringBuffer("");
		int ss = seconds % 60;
		int mm = (seconds / 60) % 60;
		int hh = seconds / 3600;
		if(hh == 0) {
			result.append("00");
		} else
			if(hh < 10) {
				result.append("0").append(hh);
			} else {
				result.append(hh);
			}
		result.append(":");
		if(mm == 0) {
			result.append("00");
		} else
			if(mm < 10) {
				result.append("0").append(mm);
			} else {
				result.append(mm);
			}
		result.append(":");
		if(ss == 0) {
			result.append("00");
		} else
			if(ss < 10) {
				result.append("0").append(ss);
			} else {
				result.append(ss);
			}
		return result.toString();
	}
	
	public static int getHour()
	{
		Calendar cpcalendar = ((new GregorianCalendar()));
		cpcalendar.setTime(getDate());
		return cpcalendar.get(11);
	}
	
	public static int getHour(Date date)
	{
		Calendar cpcalendar = ((new GregorianCalendar()));
		cpcalendar.setTime(date);
		return cpcalendar.get(11);
	}
	
	public static int getHour(long date)
	{
		return getHour(getDate(date));
	}
	
	
	
	
	public static long getMillisecondInADay()
	{
		Calendar cl = Calendar.getInstance();
		return ((cl.get(11) * 3600 + cl.get(12) * 60 + cl.get(13)) * 1000 + cl.get(14));
	}
	
	public static long getTodayTime()
	{
		return getTime() - getMillisecondInADay();
	}
	
	
	public static void main(String args[])
	{
		
	}
	
}
