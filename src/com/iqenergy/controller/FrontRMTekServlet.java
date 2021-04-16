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

@WebServlet(name = "FrontRMTekServlet", urlPatterns = {"/tek",	"/tek-icemix", "/tek-ecobarrier" })
@MultipartConfig
public class FrontRMTekServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    private PageDAO pageDAO = null;
    private RMTekService tekService = null;
    
    public void init() 
    {
    	pageDAO = new PageDAO();
    	tekService = new RMTekService();
    }

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontRMTekServlet() {
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
			case "/tek":
				tekService.showTekPage(request, response, 48);
				break;
				
			case "/tek-icemix":
				tekService.showTekPage(request, response, 49);
				break;
				
				
			case "/tek-ecobarrier":
				tekService.showTekPage(request, response, 50);
				break;
				
			default:
				tekService.showTekPage(request, response, 48);
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
