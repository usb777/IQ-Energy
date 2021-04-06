package com.iqenergy.util;
/**
 * Usefull Links
 * https://stackoverflow.com/questions/530012/how-to-convert-java-util-date-to-java-sql-date
 */
import java.text.SimpleDateFormat;
import java.sql.Date;

public class DateConverter 
{
	
	public static java.sql.Date getCurrentDate(java.util.Date currentDate)
	       {
		   
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			final String stringDate= dateFormat.format(currentDate);
			final java.sql.Date sqlDate=  java.sql.Date.valueOf(stringDate);
			
			return sqlDate;

	       }
	
	
	public static java.sql.Date convertFromUTILDateToSQLDate(         java.util.Date javaDate) 
	{
        java.sql.Date sqlDate = null;
        if (javaDate != null) {         sqlDate = new Date(javaDate.getTime());        }
        return sqlDate;
    }
	
	
	//last Version from OldGeekJob
	public static java.sql.Date convertDateUtilToDateSql(java.util.Date uDate)
	{
		java.sql.Date sDate = new java.sql.Date(uDate.getTime());
		return sDate;
	}
	
	
	
	
}
