package com.iqenergy.services;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iqenergy.model.Page;
import com.iqenergy.DAO.PageDAO;

public class ProductService 
{
	PageDAO pageDAO = new PageDAO();

	
		
	public void showProductsPage(HttpServletRequest request, HttpServletResponse response) 	throws  ServletException,SQLException, IOException
	{
		
	//	request.setAttribute("menu_products", pageDAO.getAllProductsPages() );		
		request.setAttribute("productinfo", pageDAO.getProductPageById(8) );		
		
        
		RequestDispatcher dispatcher = request.getRequestDispatcher("/product.jsp");
        dispatcher.forward(request, response);
	}	
	

	public void showProductEcobarrierPage(HttpServletRequest request, HttpServletResponse response) 	throws  ServletException,SQLException, IOException
	{
		
	//	request.setAttribute("menu_products", pageDAO.getAllProductsPages() );		
		request.setAttribute("productinfo", pageDAO.getProductPageById(9) );
		System.out.println( pageDAO.getCompanyPageById(9).toString());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/product.jsp");
        dispatcher.forward(request, response);
	}
	
	
	
	
	public void showProductMineralyPage(HttpServletRequest request, HttpServletResponse response) 	throws  ServletException,SQLException, IOException
	{
		
	//	request.setAttribute("menu_products", pageDAO.getAllProductsPages() );		
		request.setAttribute("productinfo", pageDAO.getProductPageById(10) );
		System.out.println( pageDAO.getCompanyPageById(10).toString());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/product.jsp");
        dispatcher.forward(request, response);
	}	
	
	public void showProductMafyPage(HttpServletRequest request, HttpServletResponse response) 	throws  ServletException,SQLException, IOException
	{
		
	//	request.setAttribute("menu_products", pageDAO.getAllProductsPages() );		
		request.setAttribute("productinfo", pageDAO.getProductPageById(11) );
		System.out.println( pageDAO.getCompanyPageById(11).toString());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/product.jsp");
        dispatcher.forward(request, response);
	}	
	
	
	public void showProductGeronyPage(HttpServletRequest request, HttpServletResponse response) 	throws  ServletException,SQLException, IOException
	{
		
	//	request.setAttribute("menu_products", pageDAO.getAllProductsPages() );		
		request.setAttribute("productinfo", pageDAO.getProductPageById(12) );
		System.out.println( pageDAO.getCompanyPageById(12).toString());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/product.jsp");
        dispatcher.forward(request, response);
	}	
	
	
	public void showProductWatermazutPage(HttpServletRequest request, HttpServletResponse response) 	throws  ServletException,SQLException, IOException
	{
		
	//	request.setAttribute("menu_products", pageDAO.getAllProductsPages() );		
		request.setAttribute("productinfo", pageDAO.getProductPageById(13) );
		System.out.println( pageDAO.getCompanyPageById(13).toString());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/product.jsp");
        dispatcher.forward(request, response);
	}	
	
	
	
	public void showProductIcemixAboutPage(HttpServletRequest request, HttpServletResponse response) 	throws  ServletException,SQLException, IOException
 {
	
	request.setAttribute("productinfo", pageDAO.getPageByIdAndTemplate(30, "product.jsp") );	
	
	RequestDispatcher dispatcher = request.getRequestDispatcher("/product.jsp");
    dispatcher.forward(request, response);
  }	
	
	
	public void showProductPage(HttpServletRequest request, HttpServletResponse response, int page) 	throws  ServletException,SQLException, IOException
 {
	
	request.setAttribute("productinfo", pageDAO.getPageByIdAndTemplate(page, "product.jsp") );	
	
	RequestDispatcher dispatcher = request.getRequestDispatcher("/product.jsp");
    dispatcher.forward(request, response);
  }	
	
	
	
	

}



