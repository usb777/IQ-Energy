package com.iqenergy.controller;


import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iqenergy.DAO.UsersDAO;

import com.iqenergy.model.Users;
import com.iqenergy.util.Bcrypting;


/**
 * Servlet implementation class UsersServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		 Bcrypting bcrypt = new Bcrypting();  // BCryption
		 
		 
		 String userName = request.getParameter("login");
		 String password = request.getParameter("password");
		 
		 Users user = new Users();
    	 UsersDAO udao = new UsersDAO();    	 
    	 user =udao.getUsersByUsername(userName);  	 
    	 
    	try {
    	 
    	 if ( (user.getUsername().equals(userName)) &&(user.getUsername()!= null) &&(!user.getUsername().isEmpty()))
    	 {
    		// Login through Bcryption checking
    		 if (   bcrypt.verifyHash(password, user.getPassword())    )  //user.getPassword().equals(password)
    		 {
    			 HttpSession session = null;
    			 session = request.getSession(true);
    			 
    			 int user_id = udao.getUsersByUsername(user.getUsername()).getId();
    			 session.setAttribute("user_id", user_id);
    			 
    			 System.out.println("You did it!");
    			 System.out.println("Role is = "+user.getRole());
    			 switch (user.getRole())
    			 {
    			 case 1: {
    				 request.setAttribute("userName", userName); 
    				 session.setAttribute("username", userName);
    				 
    			 			//RequestDispatcher is used to send the control to the invoked page.
    						request.getRequestDispatcher("/admin/superadmin/users").forward(request, response);
    				     
    						break;}
    			 case 2:  {
    				 request.setAttribute("userName", userName); 
    				 session.setAttribute("username", userName);
    		        //RequestDispatcher is used to send the control to the invoked page.
    				       request.getRequestDispatcher("/admin/moderators/index.jsp").forward(request, response);  
    				       
    				       break; }
    			 case  3:  {
    				 request.setAttribute("userName", userName); 
    				 session.setAttribute("username", userName);
    		        //RequestDispatcher is used to send the control to the invoked page.
    				request.getRequestDispatcher("/admin/superusers/index.jsp").forward(request, response); 
    				  
    				break;}
    			 case   4:  {
    				 request.setAttribute("userName", userName); 
    				 session.setAttribute("username", userName);
    		        //RequestDispatcher is used to send the control to the invoked page.
    				request.getRequestDispatcher("/admin/users/index.jsp").forward(request, response); 
    				   
    				break; }
    			 default:
    			 
    			 }
    		 
    		 }
    		 
    		 else 
    		 {
    			 System.out.println("Password doesn't match");
    			 request.setAttribute("errMessage", "Wrong password"); 
    			 request.getRequestDispatcher("/login.jsp").forward(request, response);//forwarding the request
    		 }
    		 
    	 }
    	 
    	 else 
    	 {
    		 System.out.println("Login doesn't match");
    		 request.setAttribute("errMessage", "login doesn't exist"); 
    		request.getRequestDispatcher("/login.jsp").forward(request, response);//forwarding the request
    	 }
    	}// try 
    	catch (NullPointerException npe)
    	{
    		System.out.println("Object user is NULL");
    		request.setAttribute("errMessage", "login doesn't exist"); 
    		request.getRequestDispatcher("/login.jsp").forward(request, response);//forwarding the request
    	}
		 
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
	}
	
	
		
     public ArrayList<Users> showAllUsers() 
     {
    	 ArrayList<Users> users;
    	 UsersDAO udao = new UsersDAO();    	 
    	 users =udao.getAllUsers();  	 
    	 
    	 return users;
    	 
     }
		
	
	

}
