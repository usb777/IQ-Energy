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

@WebServlet(name = "FrontProductServlet", urlPatterns = 
{"/products","/product-ecobarrier","/product-mineraly", "/product-mafy","/product-gerony","/product-watermazut"  ,
"/product-icemix_about"	,"/product-icemix_using","/product-icemix_action", "/product-icemix_super","/product-icemix_table",
"/product-icemix_security","/product-icemix_activity","/product-icemix_reagent","/product-icemux_opyt","/product-icemix_ntd",
"/product-icemix_document","/product-icemix_line", 

"/product-ecobarrier_about","/product-ecobarrier_forwhat",
"/product-ecobarrier_using","/product-ecobarrier_super","/product-ecobarrier_road",
"/product-ecobarrier_experience","/product-ecobarrier_ntd","/product-ecobarrier_document"

})
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
				productService.showProductPage(request, response, 8);
				break;
				
			case "/product-ecobarrier":
				productService.showProductPage(request, response, 9);
				break;
				
			case"/product-mineraly":
				productService.showProductPage(request, response, 10);
				break;
				
			case	"/product-mafy":
				productService.showProductPage(request, response, 11);
				break;
				
			case	"/product-gerony":
				productService.showProductPage(request, response, 12);
				break;
				
			case	"/product-watermazut":
				productService.showProductPage(request, response, 13);
				break;
				
			case "/product-icemix_about":
				productService.showProductPage(request, response, 30);
				break;
				
			case "/product-icemix_using":
				productService.showProductPage(request, response, 19);
				break;
				
			case    "product-icemix_action": 
				productService.showProductPage(request, response, 20);
				break;
			
			case	"/product-icemix_super":
				productService.showProductPage(request, response, 21);
				break;
				
			case	"/product-icemix_table":
				productService.showProductPage(request, response, 22);
				break;
				
			case	"/product-icemix_security":
				productService.showProductPage(request, response, 23);
				break;
				
			case	"/product-icemix_activity":
				productService.showProductPage(request, response, 24);
				break;
				
			case	"/product-icemix_reagent":
				productService.showProductPage(request, response, 25);
				break;
				
			case	"/product-icemux_opyt":
				productService.showProductPage(request, response, 26);
				break;
				
			case	"/product-icemix_ntd":
				productService.showProductPage(request, response, 27);
				break;
				
			case	"/product-icemix_document":
				productService.showProductPage(request, response, 28);
				break;
				
			case	"/product-icemix_line":
				productService.showProductPage(request, response, 29);
				break;
				
				
				
			case "/product-ecobarrier_about":
					productService.showProductPage(request, response, 31);
				break;
				
			case "/product-ecobarrier_forwhat":
					productService.showProductPage(request, response, 32);
				break;	
				
			case "/product-ecobarrier_using":
					productService.showProductPage(request, response, 33);
				break;
				
			case "/product-ecobarrier_super":
					productService.showProductPage(request, response, 34);
				break;
				
			case "/product-ecobarrier_road":
					productService.showProductPage(request, response, 35);
				break;
				
			case "/product-ecobarrier_experience":
					productService.showProductPage(request, response, 36);
				break;
				
			case "/product-ecobarrier_ntd":
					productService.showProductPage(request, response, 37);
				break;
				
			case "/product-ecobarrier_document":
					productService.showProductPage(request, response, 38);
				break;	
				
				
				
				
				
				
			
			default:
				productService.showProductPage(request, response, 8);
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
