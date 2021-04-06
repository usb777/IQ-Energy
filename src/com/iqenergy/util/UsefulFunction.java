package com.iqenergy.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class UsefulFunction
{
	


/**
 * Check directory Exist and create if NOT
 * @param path
 */
	 public void directoryCreateAndExist(String path) 
	  {  
		  
		  File filed = new File(path);
	        if(!filed.exists())
	        {  if(filed.mkdir())
	          { System.out.println("directory is created"); }
	        } 
	           else{ System.out.println("directory exist");  }
	  }
	 
	 
	 /**
	  * method Move file from ==source== to ==finalDestination==
	  * @param sourceFile
	  * @param finalDestination
	  */
	 public static void moveFile(String sourceFile, String finalDestination)
	    {	
	    	
	    	InputStream inStream = null;
		    OutputStream outStream = null;
			
	    	try{
	    		
	    	    File afile =new File(sourceFile);
	    	    File bfile =new File(finalDestination);
	    		
	    	    inStream = new FileInputStream(afile);
	    	    outStream = new FileOutputStream(bfile);
	        	
	    	    byte[] buffer = new byte[1024];
	    		
	    	    int length;
	    	    //copy the file content in bytes 
	    	    while ((length = inStream.read(buffer)) > 0){
	    	  
	    	    	outStream.write(buffer, 0, length);
	    	 
	    	    }
	    	 
	    	    inStream.close();
	    	    outStream.close();
	    	    
	    	    //delete the original file
	    	    afile.delete();
	    	    
	    	    System.out.println("File is copied successful!");
	    	    
	    	}catch(IOException e)
	    	{
	    	    e.printStackTrace();
	    	}
	    }
	 
	 /**
	  * Delete file from ==source==
	  * @param source
	  */
	 public void deleteFile (String source)
	 {
		 
		 File imageDelete = new File( source );
			try{
			 if(imageDelete.delete())
			 {
		            System.out.println(source +  " File deleted");
		        }
			 else 
				 System.out.println("File " + source +  " doesn't exist");
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
	 }
	 
	public String getShortDescription(String str, int length) throws Exception
	{
		
		    String [] arr = str.split("\\s+"); 
		         //Splits words & assign to the arr[]  ex : arr[0] -> Copying ,arr[1] -> first

          //System.out.println("Length of array description = "+arr.length);
		        int N=length; // NUMBER OF WORDS THAT YOU NEED
		        
		        if(arr.length==0) {N=0;}
		        if (N>arr.length) {N = arr.length;} // Our length can be more than words in description
		        
		        String nWords="";

		        // concatenating number of words that you required
		    if(N!=0) 
		    {	
		        for(int i=0; i<N ; i++)
		        {
		             nWords = nWords + " " + arr[i] ; //check this         
		        }
		        nWords =   nWords+" ...";
		    }
		    else // N=0
		    {
		    	nWords="";
		    }
		
		return nWords;
	}
	 
	
	public String removeFirstChar(String s)
	   {
		   return s.substring(1);
		}



}
