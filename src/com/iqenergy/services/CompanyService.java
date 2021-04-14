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

public class CompanyService 
{
	PageDAO pageDAO = new PageDAO();

	
	public void listCompanies(HttpServletRequest request, HttpServletResponse response) 	throws  ServletException,SQLException, IOException
	{
		
		request.setAttribute("menu_companies", pageDAO.getAllCompaniesPages() );
		
        RequestDispatcher dispatcher = request.getRequestDispatcher("/company.jsp");
        dispatcher.forward(request, response);
	}
	
	
	public void showCompanyAboutPage(HttpServletRequest request, HttpServletResponse response) 	throws  ServletException,SQLException, IOException
	{
		
		request.setAttribute("menu_companies", pageDAO.getAllCompaniesPages() );		
		request.setAttribute("companyinfo", pageDAO.getCompanyPageById(2) );
		
		System.out.println(pageDAO.getCompanyPageById(2).toString());
        
		RequestDispatcher dispatcher = request.getRequestDispatcher("/company.jsp");
        dispatcher.forward(request, response);
	}
	
	
	/**
	 * Dillers
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws SQLException
	 * @throws IOException
	 */
	public void showCompanyDillersPage(HttpServletRequest request, HttpServletResponse response) 	throws  ServletException,SQLException, IOException
	{
		
		request.setAttribute("menu_companies", pageDAO.getAllCompaniesPages() );		
		request.setAttribute("companyinfo", pageDAO.getCompanyPageById(4) );
		
		System.out.println(pageDAO.getCompanyPageById(4).toString());
		
        RequestDispatcher dispatcher = request.getRequestDispatcher("/company.jsp");
        dispatcher.forward(request, response);
	}
	
	
	
	public void showCompanyPartnersPage(HttpServletRequest request, HttpServletResponse response) 	throws  ServletException,SQLException, IOException
	{
		
		request.setAttribute("menu_companies", pageDAO.getAllCompaniesPages() );		
		request.setAttribute("companyinfo", pageDAO.getCompanyPageById(5) );
		
		System.out.println(pageDAO.getCompanyPageById(5).toString());
		
        RequestDispatcher dispatcher = request.getRequestDispatcher("/company.jsp");
        dispatcher.forward(request, response);
	}
	
	
	
	public void showCompanyNewsPage(HttpServletRequest request, HttpServletResponse response) 	throws  ServletException,SQLException, IOException
	{
		
		request.setAttribute("menu_companies", pageDAO.getAllCompaniesPages() );		
		request.setAttribute("companyinfo", pageDAO.getCompanyPageById(6) );
		
		System.out.println(pageDAO.getCompanyPageById(6).toString());
		
        RequestDispatcher dispatcher = request.getRequestDispatcher("/company.jsp");
        dispatcher.forward(request, response);
	}
	
	
	public void showCompanyVacancyPage(HttpServletRequest request, HttpServletResponse response) 	throws  ServletException,SQLException, IOException
	{
		
		request.setAttribute("menu_companies", pageDAO.getAllCompaniesPages() );		
		request.setAttribute("companyinfo", pageDAO.getCompanyPageById(7) );
		
		System.out.println(pageDAO.getCompanyPageById(7).toString());
		
        RequestDispatcher dispatcher = request.getRequestDispatcher("/company.jsp");
        dispatcher.forward(request, response);
	}
	
	public void showCompanyRekvizitPage(HttpServletRequest request, HttpServletResponse response) 	throws  ServletException,SQLException, IOException
	{
		
		request.setAttribute("menu_companies", pageDAO.getAllCompaniesPages() );		
		request.setAttribute("companyinfo", pageDAO.getCompanyPageById(3) );
		
		System.out.println(pageDAO.getCompanyPageById(3).toString());
		
        RequestDispatcher dispatcher = request.getRequestDispatcher("/company.jsp");
        dispatcher.forward(request, response);
	}
	
	

}



