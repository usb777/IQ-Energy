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
	 
	 
	 	 
	 @GET
	    @Path("/menu-add")
	    public Viewable getPageADD( @Context HttpServletRequest request,   @Context HttpServletResponse response) throws Exception
	    {	 
		  return new Viewable("/admin/superadmin/menu-add", null);
	    }
	 
	 
	 @POST
	 @Path("/insert")
	 public Viewable  insertPageAction
	 ( @Context HttpServletRequest request,   @Context HttpServletResponse response,			  
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
			Menu insertMenu = new Menu();			
			
			insertMenu.setMenu_name(menu_name);
			insertMenu.setPage_id(page_id);
			insertMenu.setParent_id(parent_id);
			insertMenu.setMenu_status(menu_status);
			insertMenu.setMenu_level(menu_level);
			insertMenu.setMenu_group(menu_group);
			insertMenu.setMenu_head(menu_head);
			insertMenu.setPage_group(page_group);
			System.out.println("=========page_group============"+page_group);
			
			try{ menuDAO.insertMenuItem(insertMenu);  	   }  //try Before insert to Database
		           catch (Exception e)
		           { 
		    	     System.out.println("Error is - "+e);
		    	     e.printStackTrace();
		    	   }	
		
		  request.setAttribute("menus", menuDAO.getAllMenus()  );     
		 return new Viewable("/admin/superadmin/menus", null);
			
	 }		
	 
	 
	 @GET
	    @Path("/menu-delete/{menuId}")
	    public Viewable deletePageByID( @Context HttpServletRequest request,   @Context HttpServletResponse response, @PathParam("menuId") int menuId) throws Exception
	    {
		    	
		 
			try {	
				menuDAO.deleteMenuItemById(menuId);						
				}  //try Before insert to Database
				catch (Exception e)
		     	{ 
					System.out.println("Error is - "+e);
					e.printStackTrace();
		     	} //catch
				    
	    
			  request.setAttribute("menus", menuDAO.getAllMenus()  );     
			 return new Viewable("/admin/superadmin/menus", null);
	      
	      
	    }
	 
	 
	 

}
