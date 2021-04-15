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

import com.iqenergy.DAO.PageDAO;


import com.iqenergy.services.*;



/**
 * Servlet implementation class UserServlet
 */
//@WebServlet("/UserServlet", urlPatterns = "/employees")

@WebServlet(name = "FrontRMNedroUserServlet", urlPatterns = {"/nedrousers",
		"/nedrousers-ng_icemix", "/nedrousers-ng_ecobarrier",
		"/nedrousers-gr_icemix","/nedrousers-gr_ecobarrier"  })
@MultipartConfig
public class FrontRMNedroUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    private PageDAO pageDAO = null;
    private RMNedroUserService nedroUserService = null;
    
    public void init() 
    {
    	pageDAO = new PageDAO();
    	 nedroUserService = new RMNedroUserService();
    }

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontRMNedroUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	String action = request.getServletPath();
    	System.out.println("========="+action+"====================");

		try {
			switch (action) 
		{
			
				
			case "/nedrousers":
				nedroUserService.showNedroUserPage(request, response, 39);
				break;
				
				
			case "/nedrousers-ng_icemix":
				nedroUserService.showNedroUserPage(request, response, 40);
				break;
				
				
			case "/nedrousers-ng_ecobarrier":
				nedroUserService.showNedroUserPage(request, response, 41);
				break;
				
			case "/nedrousers-gr_icemix":
				nedroUserService.showNedroUserPage(request, response, 43);
				break;
				
			case "/nedrousers-gr_ecobarrier":
				nedroUserService.showNedroUserPage(request, response, 44);
				break;					
				
				
				
				
				
			default:
				nedroUserService.showNedroUserPage(request, response, 39);
				break;
		}
		} catch (SQLException ex) 
			{
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
