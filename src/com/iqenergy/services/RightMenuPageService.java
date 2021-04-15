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

public class RightMenuPageService 
{
	PageDAO pageDAO = new PageDAO();


	public void showRightMenuPage(HttpServletRequest request, HttpServletResponse response, int page) 	throws  ServletException,SQLException, IOException
 {
	request.setAttribute("rightMenuPageInfo", pageDAO.getPageByIdAndTemplate(page, "product.jsp") );	
	RequestDispatcher dispatcher = request.getRequestDispatcher("/product.jsp");
    dispatcher.forward(request, response);
  }	
	
	
	
	

}



