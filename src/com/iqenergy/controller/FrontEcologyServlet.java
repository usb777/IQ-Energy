package com.iqenergy.controller;



import java.io.IOException;
import java.sql.SQLException;


import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iqenergy.DAO.PageDAO;
import com.iqenergy.services.EcologyService;





/**
 * Servlet implementation class UserServlet
 */
//@WebServlet("/UserServlet", urlPatterns = "/employees")

@WebServlet(name = "FrontEcologyServlet", urlPatterns = {"/ecology","/ecology-npa","/ecology-smi", "/ecology-rk" })
@MultipartConfig
public class FrontEcologyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    private PageDAO pageDAO = null;
    private EcologyService ecologyService = null;
    
    public void init() 
    {
    	pageDAO = new PageDAO();
    	ecologyService = new EcologyService();
    }

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontEcologyServlet() {
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
			
				
			case "/ecology":
				ecologyService.showEcologyPage(request, response);
				break;
				
			case "/ecology-npa":
				ecologyService.showEcologyNpaPage(request, response);
				break;
				
			case "/ecology-smi":
				ecologyService.showEcologySmiPage(request, response);
				break;
			case "/ecology-rk":
				ecologyService.showEcologyRkPage(request, response);
				break;
				
			
			
			default:
				ecologyService.showEcologyPage(request, response);
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
