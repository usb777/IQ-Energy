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
	 
 
	 
	 @GET
	    @Path("/slogan-edit/{sloganId}")
	    public Viewable getPageByID( @Context HttpServletRequest request,   @Context HttpServletResponse response, @PathParam("sloganId") int sloganId) throws Exception
	    {
		 // request.setAttribute("menu_companies", pageDAO.getAllCompaniesPages() );	  
		 //TODO in future Remove this Costyl
				    
		 slogan = sloganDAO.getSloganById(sloganId);
	      request.setAttribute("slogan", slogan); // send message to JSP	        
	      return new Viewable("/admin/superadmin/slogan-edit", null);
	      
	    }
	 
	 

			 
	 @POST
	 @Path("/slogan-edit/update")
	 public Viewable  updateSloganAction( @Context HttpServletRequest request,   @Context HttpServletResponse response,
			 @FormParam("id") int id,   
			 @FormParam("slogan") String slogan			 
			
			 )  throws Exception 
	 {	 
		//String output = "Student Name: " + name + 			", Roll No.: " + rollNo; 
		
		
			
			Slogan updateSlogan = new Slogan();
			
			updateSlogan.setId( id );
			updateSlogan.setSlogan(slogan);
			
			
				try{	 
					sloganDAO.updateSlogan(updateSlogan);
						
	                }  //try Before insert to Database
		           catch (Exception e)
		           { 
		    	     System.out.println("Error is - "+e);
		    	     e.printStackTrace();
		    	   }
				
				
				
			
				 request.setAttribute("slogans", sloganDAO.getAllSlogans()); 
			      return new Viewable("/admin/superadmin/slogans", null);
	 }
	 
	 
	  
	 
	 @GET
	    @Path("/slogan-add")
	    public Viewable getSloganAdd( @Context HttpServletRequest request,   @Context HttpServletResponse response) throws Exception
	    {
		 // request.setAttribute("menu_companies", pageDAO.getAllCompaniesPages() );	  
		 //TODO in future Remove this Costyl
				    
	            
	      return new Viewable("/admin/superadmin/slogan-add", null);
	      
	    }
	 
	 
	 
	 
	 
	 @POST
	 @Path("/slogan-add/insert")
	 public Viewable  insertSloganAction( @Context HttpServletRequest request,   @Context HttpServletResponse response,
			  
			 @FormParam("slogan") String slogan			 
			
			 )  throws Exception 
	 {	 
		//String output = "Student Name: " + name + 			", Roll No.: " + rollNo; 
		
		
			
			Slogan insertSlogan = new Slogan();
			
			insertSlogan.setSlogan(slogan);	
		
				try{	
					sloganDAO.insertSlogan(insertSlogan);
				
					// request.getRequestDispatcher("/admin/superadmin/menu-left").forward(request, response);
					}  //try Before insert to Database
		           catch (Exception e)
		           { 
		    	     System.out.println("Error is - "+e);
		    	     e.printStackTrace();
		    	   }
				
				
				 request.setAttribute("slogans", sloganDAO.getAllSlogans()); 
			      return new Viewable("/admin/superadmin/slogans", null);
			
	 }		
	 
	 
	 @GET
	    @Path("/slogan-delete/{sloganId}")
	    public Viewable deleteSloganByID( @Context HttpServletRequest request,   @Context HttpServletResponse response, @PathParam("sloganId") int sloganId) throws Exception
	    {
		    	
		 
			try {	
				sloganDAO.deleteSloganById(sloganId);
				
			//	 request.getRequestDispatcher("/admin/superadmin/pages").forward(request, response);
				}  //try Before insert to Database
				catch (Exception e)
		     	{ 
					System.out.println("Error is - "+e);
					e.printStackTrace();
		     	} //catch
		 
		 
		 
				    
	    
			 request.setAttribute("slogans", sloganDAO.getAllSlogans()); 
		      return new Viewable("/admin/superadmin/slogans", null);
	      
	    }
	 
	 
	 
	 
	 
	 

}
