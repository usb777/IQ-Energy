package com.iqenergy.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import com.iqenergy.DAO.MenuDAO;
import com.iqenergy.DAO.PageDAO;
import com.iqenergy.model.LeftMenu;
import com.iqenergy.model.Menu;
import com.iqenergy.model.Page;
import com.iqenergy.model.Users;
import com.sun.jersey.api.view.Viewable;

@Path("/en/admin/menus")
public class AdminMenuJersey {
	
MenuDAO menuDAO = new MenuDAO();
Menu menu = new Menu();

	 @GET	  
	    public Viewable getAllMenus( @Context HttpServletRequest request,   @Context HttpServletResponse response) throws Exception
	    {
		 
		  request.setAttribute("menus", menuDAO.getAllMenus());     
	      return new Viewable("/admin/superadmin/menus", null);
	    }
	 
	 
	 @GET
	    @Path("/menu-edit/{menuId}")
	    public Viewable getPageByID( @Context HttpServletRequest request,   @Context HttpServletResponse response, @PathParam("menuId") int menuId) throws Exception
	    {
		 // request.setAttribute("menu_companies", pageDAO.getAllCompaniesPages() );	  
		 //TODO in future Remove this Costyl
				    
	      menu = menuDAO.getMenuById(menuId);
	      request.setAttribute("menu", menu); // send message to JSP	        
	      return new Viewable("/admin/superadmin/menu-edit", null);
	    }

	
	 
	 @POST
	 @Path("/menu-edit/update")
	 public Viewable  updatePageAction( @Context HttpServletRequest request,   @Context HttpServletResponse response,
			 @FormParam("id") int menu_id,
			 @FormParam("menu_name") String menu_name,
			 @FormParam("page_id") int page_id,
			 @FormParam("parent_id") int  parent_id,
			 @FormParam("menu_status") int menu_status,
			 @FormParam("menu_level") int menu_level,
			 @FormParam("menu_group") String menu_group,
	 		 @FormParam("menu_head") int menu_head,
	 		 @FormParam("page_group") String page_group		 
			 
			 )  throws Exception 
	 {	 	
			Menu updateMenu = new Menu();
			
			updateMenu.setMenu_id(menu_id);
			updateMenu.setMenu_name(menu_name);
			updateMenu.setPage_id(page_id);
			updateMenu.setParent_id(parent_id);
			updateMenu.setMenu_status(menu_status);
			updateMenu.setMenu_level(menu_level);
			updateMenu.setMenu_group(menu_group);
			updateMenu.setMenu_head(menu_head);
			updateMenu.setPage_group(page_group);
			System.out.println("=========page_group============"+page_group);
			
			try{ menuDAO.updateMenu(updateMenu);  	   }  //try Before insert to Database
		           catch (Exception e)
		           { 
		    	     System.out.println("Error is - "+e);
		    	     e.printStackTrace();
		    	   }	
		
		  request.setAttribute("menus", menuDAO.getAllMenus()  );     
		 return new Viewable("/admin/superadmin/menus", null);
	 }
	 
	 /* 
	 
	 
	 @GET
	    @Path("/menu-add")
	    public Viewable getPageADD( @Context HttpServletRequest request,   @Context HttpServletResponse response) throws Exception
	    {
		 // request.setAttribute("menu_companies", pageDAO.getAllCompaniesPages() );	  
		 //TODO in future Remove this Costyl
				    
	            
	      return new Viewable("/admin/superadmin/page-add", null);
	      
	    }
	 
	 
	 @POST
	 @Path("/menu-add/insert")
	 public Viewable  insertPageAction( @Context HttpServletRequest request,   @Context HttpServletResponse response,
			  
			 @FormParam("page_name") String page_name,			 
			 @FormParam("page_title") String page_title,
			 @FormParam("page_info") String page_info,
			 @FormParam("page_order") int page_order,
			 @FormParam("page_group") String page_group,
			 @FormParam("template") String template			 
			 )  throws Exception 
	 {	 
			
			Page insertPage = new Page();
			
			insertPage.setPage_name(page_name);
			insertPage.setPage_title(page_title);
			insertPage.setPage_info(page_info);
			insertPage.setPage_order(page_order);
			insertPage.setPage_group(page_group);
			insertPage.setTemplate(template);
		
				try{	
					pageDAO.insertPageByAdmin(insertPage);
				
					// request.getRequestDispatcher("/admin/superadmin/menu-left").forward(request, response);
					}  //try Before insert to Database
		           catch (Exception e)
		           { 
		    	     System.out.println("Error is - "+e);
		    	     e.printStackTrace();
		    	   }
				
				
		    request.setAttribute("pages", pageDAO.getAllPages());     
			
			 return new Viewable("/admin/superadmin/pages", null);
			
	 }		
	 
	 
	 @GET
	    @Path("/menu-delete/{pageId}")
	    public Viewable deletePageByID( @Context HttpServletRequest request,   @Context HttpServletResponse response, @PathParam("pageId") int pageId) throws Exception
	    {
		    	
		 
			try {	
				pageDAO.deletePageById(pageId);
				
			//	 request.getRequestDispatcher("/admin/superadmin/pages").forward(request, response);
				}  //try Before insert to Database
				catch (Exception e)
		     	{ 
					System.out.println("Error is - "+e);
					e.printStackTrace();
		     	} //catch
				    
	    
			 request.setAttribute("pages", pageDAO.getAllPages());   
	           
	      return new Viewable("/admin/superadmin/pages", null);
	      
	      
	    }
	 
	 
	 */

}
