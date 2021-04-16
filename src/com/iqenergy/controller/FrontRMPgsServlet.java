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

@WebServlet(name = "FrontRMPgsServlet", urlPatterns = {"/pgs",	"/pgs-icemix",	"/pgs-ecobarrier",	"/pgs-mafy",	"/pgs-sml" })



@MultipartConfig
public class FrontRMPgsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    private PageDAO pageDAO = null;
    private RMPgsService pgsService = null;
    
    public void init() 
    {
    	pageDAO = new PageDAO();
    	pgsService = new RMPgsService();
    }

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontRMPgsServlet() {
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
			case "/pgs":
				pgsService.showPgsPage(request, response, 53);
				break;
				
			case "/pgs-icemix":
				pgsService.showPgsPage(request, response, 54);
				break;
				
				
			case "/pgs-ecobarrier":
				pgsService.showPgsPage(request, response, 55);
				break;
				
			case "/pgs-mafy":
				pgsService.showPgsPage(request, response, 56);
				break;
				
			case "/pgs-sml":
				pgsService.showPgsPage(request, response, 57);
				break;
				
				
			default:
				pgsService.showPgsPage(request, response, 53);
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
