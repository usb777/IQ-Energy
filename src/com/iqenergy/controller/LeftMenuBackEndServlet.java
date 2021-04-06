package com.iqenergy.controller;



import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iqenergy.util.UsefulFunction;

import com.iqenergy.model.LeftMenu;
import com.iqenergy.DAO.LeftMenuDAO;
import com.iqenergy.services.LeftMenuService;


/**
 * Servlet implementation class UserServlet
 */
@WebServlet(name = "/LeftMenuBackEndServlet", urlPatterns = {"/admin/superadmin/menu-left","/admin/superadmin/menu-left-new","/admin/superadmin/menu-left-insert","/admin/superadmin/menu-left-edit","/admin/superadmin/menu-left-update","/admin/superadmin/menu-left-delete" })
public class LeftMenuBackEndServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 private LeftMenuDAO menuDAO = null;	 
	 private LeftMenuService lmService = null;
	    
	    public void init() 
	    {
	    	menuDAO = new LeftMenuDAO();
	    	lmService = new LeftMenuService();
	    }


    /**
     * @see HttpServlet#HttpServlet()
     */
    public LeftMenuBackEndServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	String action = request.getServletPath();

		try {
			switch (action) {
			case "/admin/superadmin/menu-left":
				lmService.listMenu(request, response);	
				break;
				
				
			case "/admin/superadmin/menu-left-new":
				lmService.showMenuInsertForm(request, response);				
				break;
				
			case "/admin/superadmin/menu-left-insert":
				lmService.insertMenu(request, response);				
				break;	
				
			case "/admin/superadmin/menu-left-edit":
				lmService.showMenuUpdateForm(request, response);
				break;
				
			case "/admin/superadmin/menu-left-update":
				lmService.updateMenu(request, response);				
				break;	
				
				
			case "/admin/superadmin/menu-left-delete":
				lmService.deleteMenu(request, response);
				break;	
			default:
				lmService.listMenu(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
    	
        
        
        
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		processRequest(request, response);		 
	 
	} //doGet

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		processRequest(request, response);		
	}
	
	
	
	private void listMenu(HttpServletRequest request, HttpServletResponse response) 	throws  ServletException,SQLException, IOException
	{
		request.setAttribute("leftmenu", menuDAO.getAllMenus() );
        RequestDispatcher dispatcher = request.getRequestDispatcher("/admin/superadmin/menu-left.jsp");
        dispatcher.forward(request, response);
	}	
	
	
	
	
	
	
	
	
	

}
