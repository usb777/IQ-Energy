package com.iqenergy.services;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iqenergy.model.Users;
import com.iqenergy.DAO.UsersDAO;;

public class UserService 
{
	UsersDAO userDAO = new UsersDAO();

	
	public void listUsers(HttpServletRequest request, HttpServletResponse response) 	throws  ServletException,SQLException, IOException
	{
		request.setAttribute("users", userDAO.getAllUsers());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/admin/superadmin/users.jsp");
        dispatcher.forward(request, response);
	}
	
	
	
	public void showUserInsertForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		RequestDispatcher dispatcher = request.getRequestDispatcher("/admin/superadmin/users-insert.jsp");
		dispatcher.forward(request, response);
	}
	
	
	
	public void showUserUpdateForm(HttpServletRequest request, HttpServletResponse response) 	throws  ServletException,SQLException, IOException
	{ 
		int id = Integer.parseInt(request.getParameter("id"));
		Users currentUser = userDAO.getUserById(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/admin/superadmin/user-edit.jsp");
		request.setAttribute("user", currentUser);
		dispatcher.forward(request, response);
	}
	
	
	
	

	public void insertUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException
	{
		Users newUser = new Users();
	/*	
		String fullname = request.getParameter("fullname") ; 
		String email = request.getParameter("email");
		String username = request.getParameter("username") ; 
		String password = request.getParameter("password");
		int role = Integer.parseInt(request.getParameter("role")) ;
		*/
		newUser.setFullname( request.getParameter("fullname") );
		newUser.setEmail(request.getParameter("email") );
		newUser.setUsername(request.getParameter("username") );
		newUser.setPassword(request.getParameter("password") );
		newUser.setRole(Integer.parseInt(request.getParameter("role")) ); 
    	 
		 
	try{	 
		
		 userDAO.insertUserByAdmin(newUser) ;
		 request.getRequestDispatcher("/admin/superadmin/users").forward(request, response);
			
       }  //try Before insert to Database
       catch (Exception e)
       { 
	     System.out.println("Error is - "+e);
	     e.printStackTrace();
	   }
	}
	
	public void updateUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException
	{
		Users updateUser = new Users();
		
		updateUser.setId( Integer.parseInt(request.getParameter("id")) ); 
		updateUser.setFullname( request.getParameter("fullname") );
		updateUser.setEmail(request.getParameter("email") );
		updateUser.setUsername(request.getParameter("username") );
		updateUser.setPassword(request.getParameter("password") );
		updateUser.setRole(Integer.parseInt(request.getParameter("role")) ); 
         
			try{	 
				
				 userDAO.updateUser(updateUser) ;
				 request.getRequestDispatcher("/admin/superadmin/users").forward(request, response);
					
                }  //try Before insert to Database
	           catch (Exception e)
	           { 
	    	     System.out.println("Error is - "+e);
	    	     e.printStackTrace();
	    	   }
		
	}
	
	
	
	
	

	public void deleteUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException
	{
		//  Users user = new Users();
			 
			 int id = Integer.parseInt (request.getParameter("id") ); 
		
		try{	 
					userDAO.deleteUserById(id);
					request.getRequestDispatcher("/admin/superadmin/users").forward(request, response);
			}  //try Before insert to Database
		   catch (Exception e)
		     { 
		       System.out.println("Error is - "+e);
		       e.printStackTrace();
		     }
		
	}
	
	
	

}



