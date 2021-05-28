package com.iqenergy.controller.en;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Session;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iqenergy.DAO.EmailDAO;


/**
 * Servlet implementation class RegisterServlet1
 */
@WebServlet("/ContactServlet")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
				
		String subject  = request.getParameter("subject");
		String email     = request.getParameter("email");		
		String message     = request.getParameter("message");
		
		EmailDAO emailDao = new EmailDAO();
		Properties props = emailDao.getProperties();		
		 Session session = emailDao.getSession(props);
		 
		
    	  if (    (email!= null) &&(!email.isEmpty())    )
    	  {
    		 if (    (message!= null) &&(!message.isEmpty())   )
    		  {
    			 System.out.println("You did it!");
    			
    				try{	//Action
        				emailDao.sendMail(email, subject, message, session);	
        				}// try   
    			
    			
    	    	catch (Exception e)
    	    	{
    	    		
    	    		request.setAttribute("errMessage", e); 
    	    		request.getRequestDispatcher("/contact.jsp").forward(request, response);//forwarding the request
    	    	}
    			
    			request.setAttribute("contactOk", "Your message was sent, thank you"); 	 			
				request.getRequestDispatcher("/contact.jsp").forward(request, response);
    			 
    		  }
    		 else //message empty
    		 {    			
    			 request.setAttribute("errMessage", "message cannot be blank"); 
    			 request.getRequestDispatcher("/contact.jsp").forward(request, response);//forwarding the request
    		 }
    		  
    		  
    	  }
    	  else  //Empty email
    	  {
    		 
    			 request.setAttribute("errMessage", "email cannot be blank"); 
    			 request.getRequestDispatcher("/contact.jsp").forward(request, response);//forwarding the request
    
    	  }
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
