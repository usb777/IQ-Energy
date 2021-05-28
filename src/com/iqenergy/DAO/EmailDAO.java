package com.iqenergy.DAO;

/**
 * TLS send email implimentation
 * 
 */
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.iqenergy.interfaces.EmailI;

public class EmailDAO implements EmailI
{	
	public  Properties getProperties()
	{
		  Properties prop = new Properties();
		    prop.put("mail.smtp.host", SMTP_GMAIL_COM);
		    prop.put("mail.smtp.port", MAIL_SMTP_PORT);
		    prop.put("mail.smtp.auth", MAIL_SMTP_AUTH);
		    prop.put("mail.smtp.starttls.enable", MAIL_SMTP_STARTTLS_ENABLE); //TLS
		    
		  return  prop;
	}
	
	
	public  Session getSession( Properties prop)
	{
		    Session session = Session.getInstance(prop,
		            new javax.mail.Authenticator() {  protected PasswordAuthentication getPasswordAuthentication()
		                 {    return new PasswordAuthentication(USERNAME, PASSWORD);       }            });		    
		  return  session;
	}
	
	
	public void sendMail(String fromEmail, String subject, String mes, Session session)
	  {
	      try {
	      	Message message = new MimeMessage(session);
	      	message.setFrom(new InternetAddress(fromEmail));  //change
	      	message.setRecipients (   Message.RecipientType.TO,   InternetAddress.parse("dzsamoila@gmail.com, admin@advicenyc.com")   );
	      	
	      message.setSubject(subject);    // change subject
	      message.setText(mes+" "+fromEmail);  // change message

	      Transport.send(message);
	      System.out.println("Done");

	  } catch (MessagingException e) 
	      { 
		 	e.printStackTrace();  
		  }	  
	}   

}
