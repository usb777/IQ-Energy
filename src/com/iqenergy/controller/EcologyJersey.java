package com.iqenergy.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import com.iqenergy.DAO.PageDAO;
import com.iqenergy.model.Page;
import com.sun.jersey.api.view.Viewable;

@Path("/ru/ecology/")
public class EcologyJersey {
	
PageDAO pageDAO = new PageDAO();
Page ecology =new Page();

/*
 SELECT m.`menu_id`, m.`menu_name`,m.`page_id`, p.`page_group` AS page_group, m.`parent_id`, m.`menu_status`, m.`menu_level`, m.`menu_group`, m.`menu_head`
 FROM menu m  JOIN pages p  ON m.`page_id` = p.`page_id`  WHERE m.menu_group="rm_ecology" AND m.`menu_status`=1 ORDER BY m.menu_id		
 */
		
	/*	
	  @GET
	    @Produces("text/html")
	    public Response index() 
	   {
	        return Response.ok(new Viewable("/index.jsp")).build();
	    }
	  
	  */

	@GET
	public Viewable getEcologyPage( @Context HttpServletRequest request,   @Context HttpServletResponse response) throws Exception
	{   HttpSession session = null;
	    session = request.getSession(true);
	 
	 
	     
	 
		ecology = pageDAO.getPageByName("ecology");
		
		 session.setAttribute("menuTitle",ecology.getPage_title());
		
		request.setAttribute("ecologyinfo",ecology); // send message to JSP    
		return new Viewable("/ecology", null);
	}

	  
	 @GET
	    @Path("/{ecologyId}")
	    public Viewable feed_page( @Context HttpServletRequest request,   @Context HttpServletResponse response, @PathParam("ecologyId") int ecologyId) throws Exception
	    {
		  //request.setAttribute("menu_companies", pageDAO.getAllCompaniesPages() );
	           
	      ecology = pageDAO.getPageById(ecologyId);
	      request.setAttribute("ecologyinfo",ecology); // send message to JSP	      
	  
	    //  request.setAttribute("companyId", companyId); // send message to JSP
	      
	      return new Viewable("/ecology", null);
	    }
	 

}
