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

public class PageService 
{
	PageDAO pageDAO = new PageDAO();

	
	public void listUsers(HttpServletRequest request, HttpServletResponse response) 	throws  ServletException,SQLException, IOException
	{
		request.setAttribute("pages", pageDAO.getAllPages());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/admin/superadmin/pages.jsp");
        dispatcher.forward(request, response);
	}
	
	
	
	public void showUserInsertForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		RequestDispatcher dispatcher = request.getRequestDispatcher("/admin/superadmin/page-insert.jsp");
		dispatcher.forward(request, response);
	}
	
	
	
	public void showUserUpdateForm(HttpServletRequest request, HttpServletResponse response) 	throws  ServletException,SQLException, IOException
	{ 
		int id = Integer.parseInt(request.getParameter("id"));
		Page currentPage = pageDAO.getPageById(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/admin/superadmin/page-edit.jsp");
		request.setAttribute("page", currentPage);
		dispatcher.forward(request, response);
	}
	
	
	
	

	public void insertUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException
	{
	
		Page newPage = new Page();
		
		/**
		 	private String page_name;
	private String page_title;
	private String page_info;
	private int page_order;
	private String template;
		 */
		
		newPage.setPage_name( request.getParameter("page_name") );
		newPage.setPage_title(request.getParameter("page_title") );
		newPage.setPage_info(request.getParameter("page_info") );
		newPage.setPage_order(Integer.parseInt(request.getParameter("page_order")) ); 
		newPage.setTemplate(request.getParameter("template") );
	
   	 
	try{	 
		
		 pageDAO.insertPageByAdmin(newPage) ;
		 request.getRequestDispatcher("/admin/superadmin/pages").forward(request, response);
			
       }  //try Before insert to Database
       catch (Exception e)
       { 
	     System.out.println("Error is - "+e);
	     e.printStackTrace();
	   }
	}
	
	public void updateUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException
	{
	
		Page updateUser = new Page();
		
		updateUser.setPage_id( Integer.parseInt(request.getParameter("id")) ); 
		
		updateUser.setPage_name( request.getParameter("page_name") );
		updateUser.setPage_title(request.getParameter("page_title") );
		updateUser.setPage_info(request.getParameter("page_info") );
		updateUser.setPage_order(Integer.parseInt(request.getParameter("page_order")) ); 
		updateUser.setTemplate(request.getParameter("template") );
	
		
		
			try{	 
				
				 pageDAO.updatePage(updateUser) ;
				 request.getRequestDispatcher("/admin/superadmin/pages").forward(request, response);
					
                }  //try Before insert to Database
	           catch (Exception e)
	           { 
	    	     System.out.println("Error is - "+e);
	    	     e.printStackTrace();
	    	   }
		
	}
	
	
	
	
	

	public void deletePage(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException
	{
		//  Users user = new Users();
			 
			 int id = Integer.parseInt (request.getParameter("id") ); 
		
		try{	 
					pageDAO.deletePageById(id);
					request.getRequestDispatcher("/admin/superadmin/pages").forward(request, response);
			}  //try Before insert to Database
		   catch (Exception e)
		     { 
		       System.out.println("Error is - "+e);
		       e.printStackTrace();
		     }
		
	}
	
	
	

}



