package com.iqenergy.services;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iqenergy.model.LeftMenu;
import com.iqenergy.DAO.LeftMenuDAO;

public class LeftMenuService 
{
	LeftMenuDAO leftMenuDao = new LeftMenuDAO();

	
	public void listMenu(HttpServletRequest request, HttpServletResponse response) 	throws  ServletException,SQLException, IOException
	{
		request.setAttribute("leftmenu", leftMenuDao.getAllMenus() );
        RequestDispatcher dispatcher = request.getRequestDispatcher("/admin/superadmin/menu-left.jsp");
        dispatcher.forward(request, response);
	}	
	
	
	
	public void showMenuInsertForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		RequestDispatcher dispatcher = request.getRequestDispatcher("/admin/superadmin/menu-left-insert.jsp");
		dispatcher.forward(request, response);
	}
	
	
	
	public void showMenuUpdateForm(HttpServletRequest request, HttpServletResponse response) 	throws  ServletException,SQLException, IOException
	{ 
		int id = Integer.parseInt(request.getParameter("id"));
		LeftMenu currentMenu =leftMenuDao.getMenuById(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/admin/superadmin/menu-left-edit.jsp");
		request.setAttribute("menu", currentMenu);
		dispatcher.forward(request, response);
	}
	
	
	

	public void insertMenu(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException
	{
		LeftMenu newMenuItem = new LeftMenu();
		
		newMenuItem.setMenu_name(request.getParameter("name"));
		newMenuItem.setParent_id(Integer.valueOf(request.getParameter("parent_id")));
		newMenuItem.setLink(request.getParameter("link"));
		newMenuItem.setStatus( Short.valueOf(request.getParameter("status")) );
		
		
			try{	
				leftMenuDao.insertMenuItem(newMenuItem) ;
				 request.getRequestDispatcher("/admin/superadmin/menu-left").forward(request, response);
				}  //try Before insert to Database
	           catch (Exception e)
	           { 
	    	     System.out.println("Error is - "+e);
	    	     e.printStackTrace();
	    	   }	
	}
	
	
	
	public void updateMenu(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException
	{
		LeftMenu updatedMenuItem = new LeftMenu();
		
		updatedMenuItem.setMenu_id( Integer.parseInt(request.getParameter("id")) );
		updatedMenuItem.setMenu_name(request.getParameter("name"));
		updatedMenuItem.setParent_id(Integer.valueOf(request.getParameter("parent_id")));
		updatedMenuItem.setLink(request.getParameter("link"));
		updatedMenuItem.setStatus( Short.valueOf(request.getParameter("status")) );
				 
			try{
				leftMenuDao.updateMenu(updatedMenuItem) ;
				 request.getRequestDispatcher("/admin/superadmin/menu-left").forward(request, response); //return to categories list page
			    }  //try Before insert to Database
	           catch (Exception e)
	           { 
	    	     System.out.println("Error is - "+e);
	    	     e.printStackTrace();	    	    
	    	   }			 
	}
	
	
	public void deleteMenu (HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException
	{
		int id = Integer.parseInt (request.getParameter("id") );
		
		try {			 
			leftMenuDao.deleteMenuItemById(id);
			 request.getRequestDispatcher("/admin/superadmin/menu-left").forward(request, response);
			}  //try Before insert to Database
			catch (Exception e)
	     	{ 
				System.out.println("Error is - "+e);
				e.printStackTrace();
	     	} //catch
	}
	
	

}
