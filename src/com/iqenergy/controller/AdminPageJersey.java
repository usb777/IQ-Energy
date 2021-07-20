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

import com.iqenergy.DAO.PageDAO;
import com.iqenergy.model.LeftMenu;
import com.iqenergy.model.Page;
import com.iqenergy.model.Users;
import com.sun.jersey.api.view.Viewable;

@Path("/en/admin/pages")
public class AdminPageJersey {
	
PageDAO pageDAO = new PageDAO();
Page page =new Page();

	 @GET	  
	    public Viewable feedPage( @Context HttpServletRequest request,   @Context HttpServletResponse response, @PathParam("productId") int productId) throws Exception
	    {
		 
		  request.setAttribute("pages", pageDAO.getAllPages());     
	      return new Viewable("/admin/superadmin/pages", null);
	    }
	 
	 @GET
	    @Path("/page-edit/{pageId}")
	    public Viewable getPageByID( @Context HttpServletRequest request,   @Context HttpServletResponse response, @PathParam("pageId") int pageId) throws Exception
	    {
		 // request.setAttribute("menu_companies", pageDAO.getAllCompaniesPages() );	  
		 //TODO in future Remove this Costyl
				    
	      page = pageDAO.getPageById(pageId);
	      request.setAttribute("page", page); // send message to JSP	        
	      return new Viewable("/admin/superadmin/page-edit", null);
	    }
	 
	 @POST
	 @Path("/page-edit/update")
	 public Viewable  updatePageAction( @Context HttpServletRequest request,   @Context HttpServletResponse response,
			 @FormParam("page_id") int pageId,   
			 @FormParam("page_name") String pageName,			 
			 @FormParam("page_title") String pageTitle,
			 @FormParam("page_info") String pageInfo,
			 @FormParam("page_order") int pageOrder,
			 @FormParam("page_group") String pageGroup,
			 @FormParam("template") String template			 
			 )  throws Exception 
	 {	 
				
		
			
			Page updatePage = new Page();
			
			updatePage.setPage_id( pageId );
			updatePage.setPage_name(pageName);
			updatePage.setPage_title(pageTitle);
			updatePage.setPage_info(pageInfo);
			updatePage.setPage_order(pageOrder);
			updatePage.setPage_group(pageGroup);
			updatePage.setTemplate(template);
			
				try{	 
					pageDAO.updatePage(updatePage);
						
	                }  //try Before insert to Database
		           catch (Exception e)
		           { 
		    	     System.out.println("Error is - "+e);
		    	     e.printStackTrace();
		    	   }
				
				
				
			
		 System.out.println("HEllo");
		  request.setAttribute("pages", pageDAO.getAllPages());     
		 return new Viewable("/admin/superadmin/pages", null);
	 }
	 
	 
	 
	 
	 @GET
	    @Path("/page-add")
	    public Viewable getPageADD( @Context HttpServletRequest request,   @Context HttpServletResponse response) throws Exception
	    {
			            
	      return new Viewable("/admin/superadmin/page-add", null);
	      
	    }
	 
	 
	 @POST
	 @Path("/page-add/insert")
	 public Viewable  insertPageAction( @Context HttpServletRequest request,   @Context HttpServletResponse response,
			  
			 @FormParam("page_name") String pageName,			 
			 @FormParam("page_title") String pageTitle,
			 @FormParam("page_info") String pageInfo,
			 @FormParam("page_order") int pageOrder,
			 @FormParam("page_group") String pageGroup,
			 @FormParam("template") String template			 
			 )  throws Exception 
	 {	 
			
			Page insertPage = new Page();
			
			insertPage.setPage_name(pageName);
			insertPage.setPage_title(pageTitle);
			insertPage.setPage_info(pageInfo);
			insertPage.setPage_order(pageOrder);
			insertPage.setPage_group(pageGroup);
			insertPage.setTemplate(template);
		
				try{	
					pageDAO.insertPageByAdmin(insertPage);
				
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
	    @Path("/page-delete/{pageId}")
	    public Viewable deletePageByID( @Context HttpServletRequest request,   @Context HttpServletResponse response, @PathParam("pageId") int pageId) throws Exception
	    {
		    	
		 
			try {	
				pageDAO.deletePageById(pageId);				
			
				}  //try Before insert to Database
				catch (Exception e)
		     	{ 
					System.out.println("Error is - "+e);
					e.printStackTrace();
		     	} //catch
				    
	    
			 request.setAttribute("pages", pageDAO.getAllPages());   
	           
	      return new Viewable("/admin/superadmin/pages", null);
	      
	      
	    }
	 
	 
	 

}
