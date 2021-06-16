package com.iqenergy.controller.ru;

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

@Path("/ru/company/")
public class CompanyJersey {
	
PageDAO pageDAO = new PageDAO();
Page company =new Page();

		
		
	/*	
	  @GET
	    @Produces("text/html")
	    public Response index() 
	   {
	        return Response.ok(new Viewable("/index.jsp")).build();
	    }
	
	 */

   /**
    * Going from Top Menu
    * @param request
    * @param response
    * @return
    * @throws Exception
    */
	@GET
	public Viewable getProductsPage( @Context HttpServletRequest request,   @Context HttpServletResponse response) throws Exception
	{
		HttpSession session = null;
	    session = request.getSession(true);    
		
		company = pageDAO.getPageByName("company");
		
		 session.setAttribute("menuTitle", company.getPage_title());
		
		request.setAttribute("companyinfo",company); // send message to JSP    
		return new Viewable("/company", null);
	}

	  
	 @GET
	    @Path("/{companyId}")
	    public Viewable feed_page( @Context HttpServletRequest request,   @Context HttpServletResponse response, @PathParam("companyId") int companyId) throws Exception
	    {
		  //request.setAttribute("menu_companies", pageDAO.getAllCompaniesPages() );
	           
	      company = pageDAO.getPageById(companyId);
	      request.setAttribute("companyinfo",company); // send message to JSP	      
	  
	    //  request.setAttribute("companyId", companyId); // send message to JSP
	      
	      return new Viewable("/company", null);
	    }
	 

}
