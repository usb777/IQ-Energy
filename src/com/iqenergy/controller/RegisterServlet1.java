package com.iqenergy.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iqenergy.DAO.UsersDAO;
import com.iqenergy.model.Users;
import com.iqenergy.util.Bcrypting;





/**
 * Servlet implementation class RegisterServlet1
 */
@WebServlet("/RegisterServlet1")
public class RegisterServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet1() 
    {
        super();       
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
		
		 Bcrypting bcrypt = new Bcrypting();  // BCryption
		
		String fullName  = request.getParameter("fullname");
		String email     = request.getParameter("email");
		String userName  = request.getParameter("login");
		String password  = request.getParameter("password");
		String password1 = request.getParameter("password1");
		Date date_registration = new Date();
		
		 Users user = new Users();
		 
		 
    	 UsersDAO udao = new UsersDAO();  
    	 
    	 // TODO: Check username and  email , no dublicate
		
    	  if ( (userName!= null) &&(!userName.isEmpty()))
    	  {
    		 if (password.equals(password1))
    		  {
    			 System.out.println("You did it!");
    			 user.setFullname(fullName);
    			 user.setEmail(email);
    			 user.setUsername(userName);
    			 user.setPassword(bcrypt.hash(password));
    			 user.setRole(4);
    			  user.setDate_reg(date_registration);
    			try
    			{
    			 udao.insertUser(user);
    			}// try 
    	    	catch (Exception e)
    	    	{
    	    		request.setAttribute("errMessage", e); 
    	    		request.getRequestDispatcher("/register.jsp").forward(request, response);//forwarding the request
    	    	}
    			
    			request.setAttribute("registerOk", "You registered, please login!"); 	 			
				request.getRequestDispatcher("/register.jsp").forward(request, response);
    			 
    		  }
    		 else //password !=password1 
    		 {
    			
    			 request.setAttribute("errMessage", "Password doesn't equal Password1"); 
    			 request.getRequestDispatcher("/register.jsp").forward(request, response);//forwarding the request
    		 }
    		  
    		  
    	  }
    	  else  //Empty username
    	  {
    		 
    			 request.setAttribute("errMessage", "Username cannot be blank"); 
    			 request.getRequestDispatcher("/register.jsp").forward(request, response);//forwarding the request
    
    	  }
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
	}

}
