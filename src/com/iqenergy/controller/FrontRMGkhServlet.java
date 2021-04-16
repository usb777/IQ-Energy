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

@WebServlet(name = "FrontRMGkhServlet", urlPatterns = {"/gkh",	"/gkh-icemix", "/gkh-ecobarrier" })
@MultipartConfig
public class FrontRMGkhServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    private PageDAO pageDAO = null;
    private RMGkhService gkhService = null;
    
    public void init() 
    {
    	pageDAO = new PageDAO();
    	gkhService = new RMGkhService();
    }

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontRMGkhServlet() {
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
			case "/gkh":
				gkhService.showGkhPage(request, response, 45);
				break;
				
			case "/gkh-icemix":
				gkhService.showGkhPage(request, response, 46);
				break;
				
				
			case "/gkh-ecobarrier":
				gkhService.showGkhPage(request, response, 47);
				break;
				
			default:
				gkhService.showGkhPage(request, response, 45);
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
