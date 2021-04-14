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
import com.iqenergy.services.CompanyService;
import com.iqenergy.services.PageService;
import com.iqenergy.util.UsefulFunction;



/**
 * Servlet implementation class UserServlet
 */
//@WebServlet("/UserServlet", urlPatterns = "/employees")

@WebServlet(name = "FrontCompanyServlet", urlPatterns = {"/company-about","/company-dillers","/company-partners", "/company-news", "/company-vacancy", "/company-rekvizit" })
@MultipartConfig
public class FrontCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    private PageDAO pageDAO = null;
    private CompanyService companyService = null;
    
    public void init() {
    	pageDAO = new PageDAO();
    	companyService = new CompanyService();
    }

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontCompanyServlet() {
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
			
				
			case "/company-about":
				companyService.showCompanyAboutPage(request, response);
				break;
				
			case "/company-dillers":
				companyService.showCompanyDillersPage(request, response);;
				break;
				
			case "/company-partners":
				companyService.showCompanyPartnersPage(request, response);
				break;
			case "/company-news":
				companyService.showCompanyNewsPage(request, response);
				break;
				
			case	"/company-vacancy":
				companyService.showCompanyVacancyPage(request, response);
				break;
				
				
			case	"/company-rekvizit":	
				companyService.showCompanyRekvizitPage(request, response);
			break;
			
			default:
				companyService.showCompanyAboutPage(request, response);
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
