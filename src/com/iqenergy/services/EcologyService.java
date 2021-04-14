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

public class EcologyService 
{
	PageDAO pageDAO = new PageDAO();

	
		
	public void showEcologyPage(HttpServletRequest request, HttpServletResponse response) 	throws  ServletException,SQLException, IOException
	{
		
	//	request.setAttribute("menu_products", pageDAO.getAllProductsPages() );		
	//	request.setAttribute("ecologyinfo", pageDAO.getProductPageById(14) );		
		request.setAttribute("ecologyinfo", pageDAO.getPageByIdAndTemplate(14, "ecology.jsp") );	
        
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ecology.jsp");
        dispatcher.forward(request, response);
	}	
	

	public void showEcologyNpaPage(HttpServletRequest request, HttpServletResponse response) 	throws  ServletException,SQLException, IOException
	{
		
	//	request.setAttribute("menu_products", pageDAO.getAllProductsPages() );		
		request.setAttribute("ecologyinfo", pageDAO.getPageByIdAndTemplate(15, "ecology.jsp") );
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ecology.jsp");
        dispatcher.forward(request, response);
	}
	
	
	
	
	public void showEcologySmiPage(HttpServletRequest request, HttpServletResponse response) 	throws  ServletException,SQLException, IOException
	{
		
	//	request.setAttribute("menu_products", pageDAO.getAllProductsPages() );		
       request.setAttribute("ecologyinfo", pageDAO.getPageByIdAndTemplate(16, "ecology.jsp") );
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ecology.jsp");
        dispatcher.forward(request, response);
	}	
	
	public void showEcologyRkPage(HttpServletRequest request, HttpServletResponse response) 	throws  ServletException,SQLException, IOException
	{
		
		request.setAttribute("ecologyinfo", pageDAO.getPageByIdAndTemplate(17, "ecology.jsp") );
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ecology.jsp");
        dispatcher.forward(request, response);
	}	
	
		
	
	
	
	
	
	
	
	

}



