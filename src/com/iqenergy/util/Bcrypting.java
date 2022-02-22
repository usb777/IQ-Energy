package com.iqenergy.util;



public class Bcrypting

{
	public Bcrypting()
	{
		
	}

	/**
	 * this method create hash of Password
	 * @param password
	 * @return
	 */
	 public  static String hash(String password) 
	 {
	        return BCrypt.hashpw(password, BCrypt.gensalt());
	 }
	 
	 /**
	  * this method verify "PAssword"  with Hashed Password
	  * @param password
	  * @param hash
	  * @return
	  */
	 public static  boolean verifyHash(String password, String hash) 
	 {
	        return BCrypt.checkpw(password, hash);
	    }
	

}
