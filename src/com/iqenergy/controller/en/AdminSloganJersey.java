package com.iqenergy.controller.en;

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
import com.iqenergy.DAO.SloganDAO;
import com.iqenergy.model.LeftMenu;
import com.iqenergy.model.Page;
import com.iqenergy.model.Slogan;
import com.iqenergy.model.Users;
import com.sun.jersey.api.view.Viewable;


@Path("/en/admin/slogans")  //cANNOT repeat
public class AdminSloganJersey {
	
SloganDAO sloganDAO = new SloganDAO();
Slogan slogan =new Slogan();

		
		
	
	  
	 @GET
	    public Viewable feed_page( @Context HttpServletRequest request,   @Context HttpServletResponse response) throws Exception
	    {
		 
		  request.setAttribute("slogans", sloganDAO.getAllSlogans());     
		    
	     
	      return new Viewable("/admin/superadmin/slogans", null);
	    }
	 
/*	 
	 
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
			 @FormParam("page_id") int page_id,   
			 @FormParam("page_name") String page_name,			 
			 @FormParam("page_title") String page_title,
			 @FormParam("page_info") String page_info,
			 @FormParam("page_order") int page_order,
			 @FormParam("page_group") String page_group,
			 @FormParam("template") String template			 
			 )  throws Exception 
	 {	 
		//String output = "Student Name: " + name + 			", Roll No.: " + rollNo; 
		
		
			
			Page updatePage = new Page();
			
			updatePage.setPage_id( page_id );
			updatePage.setPage_name(page_name);
			updatePage.setPage_title(page_title);
			updatePage.setPage_info(page_info);
			updatePage.setPage_order(page_order);
			updatePage.setPage_group(page_group);
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
		 // request.setAttribute("menu_companies", pageDAO.getAllCompaniesPages() );	  
		 //TODO in future Remove this Costyl
				    
	            
	      return new Viewable("/admin/superadmin/page-add", null);
	      
	    }
	 
	 
	 
	 
	 
	 @POST
	 @Path("/page-add/insert")
	 public Viewable  insertPageAction( @Context HttpServletRequest request,   @Context HttpServletResponse response,
			  
			 @FormParam("page_name") String page_name,			 
			 @FormParam("page_title") String page_title,
			 @FormParam("page_info") String page_info,
			 @FormParam("page_order") int page_order,
			 @FormParam("page_group") String page_group,
			 @FormParam("template") String template			 
			 )  throws Exception 
	 {	 
		//String output = "Student Name: " + name + 			", Roll No.: " + rollNo; 
		
		
			
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
	    @Path("/page-delete/{pageId}")
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
