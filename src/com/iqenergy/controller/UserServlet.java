package com.iqenergy.controller;



import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iqenergy.util.UsefulFunction;

import com.iqenergy.model.Users;
import com.iqenergy.DAO.UsersDAO;
import com.iqenergy.services.UserService;

/**
 * Servlet implementation class UserServlet
 */
//@WebServlet("/UserServlet", urlPatterns = "/employees")

@WebServlet(name = "UserServlet", urlPatterns = {"/admin/superadmin/users","/admin/superadmin/user-new","/admin/superadmin/user-insert","/admin/superadmin/user-edit","/admin/superadmin/user-update","/admin/superadmin/user-delete" })
@MultipartConfig
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    private UsersDAO userDAO = null;
    private UserService userService = null;
    
    public void init() {
    	userDAO = new UsersDAO();
    	userService = new UserService();
    }

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	String action = request.getServletPath();

		try {
			switch (action) {
			case "/admin/superadmin/users":
				userService.listUsers(request, response);
				break;
			case "/admin/superadmin/user-new":
				userService.showUserInsertForm(request, response);
				break;
				
			case "/admin/superadmin/user-insert":
				userService.insertUser(request, response);
				break;	
				
			case "/admin/superadmin/user-edit":
				userService.showUserUpdateForm(request, response);
				break;
				
			case "/admin/superadmin/user-update":
				userService.updateUser(request, response);
				break;	
				
				
			case "/admin/superadmin/user-delete":
				userService.deleteUser(request, response);
				break;	
			default:
				userService.listUsers(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
    	
        
        
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		processRequest(request, response);

	 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		processRequest(request, response);
		  
	}
	
	
}
