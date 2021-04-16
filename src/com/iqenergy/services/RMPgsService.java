package com.iqenergy.services;

/**
 * Right Menu Nedro Users
 */


import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iqenergy.model.Page;
import com.iqenergy.DAO.PageDAO;

public class RMPgsService 
{
	PageDAO pageDAO = new PageDAO();

	
public void showPgsPage(HttpServletRequest request, HttpServletResponse response, int page) 	throws  ServletException,SQLException, IOException
 {
	request.setAttribute("pgsinfo", pageDAO.getPageByIdAndTemplate(page, "pgs.jsp") );	
	RequestDispatcher dispatcher = request.getRequestDispatcher("/pgs.jsp");
    dispatcher.forward(request, response);
 }		
	
	
	
	
	

}



