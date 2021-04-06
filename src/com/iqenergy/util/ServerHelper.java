/**
 * 
 */
package com.iqenergy.util;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * @author DzenDzmitry
 *
 */
public class ServerHelper extends HttpServlet 

{

	
/**
 * This method helps us to detect wich kind of server we will  - LOCAL or REAL	 
 * ==Local server contains ==localhost==  word 
 * @param request
 * @return
 */
public String getRealServerPath(HttpServletRequest request)	 
{
	String delimiter =  "[/\n]"; 
	java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(delimiter,    java.util.regex.Pattern.CASE_INSENSITIVE); 
	String[] result = pattern.split( request.getRequestURL().toString()); 
	/*
	for (int i=0;i<result.length;i++)
	{
	    out.println(" result["+i+"]="+result[i]+"<br>");  
	}
	*/
	String pathUrl="";

	if (result[2].contains("localhost"))
	{ //out.println("This is <strong> LOCAL</strong> server");
	  pathUrl = result[0]+"//"+result[2]+"/"+result[3];
	}

	else 
	{ 	//out.println("This is  <strong> REAL</strong> server");
		 pathUrl = result[0]+"//"+result[2]+"/";
	}

return pathUrl;
}
	 
}
