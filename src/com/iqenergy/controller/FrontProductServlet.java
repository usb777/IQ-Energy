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
import com.iqenergy.services.ProductService;
import com.iqenergy.util.UsefulFunction;



/**
 * Servlet implementation class UserServlet
 */
//@WebServlet("/UserServlet", urlPatterns = "/employees")

@WebServlet(name = "FrontProductServlet", urlPatterns = {"/products","/product-ecobarrier" })
@MultipartConfig
public class FrontProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    private PageDAO pageDAO = null;
    private ProductService productService = null;
    
    public void init() 
    {
    	pageDAO = new PageDAO();
    	productService = new ProductService();
    }

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontProductServlet() {
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
			
				
			case "/products":
				productService.showProductsPage(request, response);
				break;
				
			case "/product-ecobarrier":
				productService.showProductEcobarrierPage(request, response);
				break;
				
		
			
			default:
				productService.showProductsPage(request, response);
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
