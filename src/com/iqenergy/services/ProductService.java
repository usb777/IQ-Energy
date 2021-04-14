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
	

}



