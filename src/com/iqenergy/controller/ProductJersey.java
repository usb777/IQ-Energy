package com.iqenergy.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import com.iqenergy.DAO.PageDAO;
import com.iqenergy.model.Page;
import com.sun.jersey.api.view.Viewable;

@Path("/ru/products/")
public class ProductJersey {
	
PageDAO pageDAO = new PageDAO();
Page product =new Page();

		
		
	/*	
	  @GET
	    @Produces("text/html")
	    public Response index() 
	   {
	        return Response.ok(new Viewable("/index.jsp")).build();
	    }
	  
	  */

@GET
public Viewable getProductsPage( @Context HttpServletRequest request,   @Context HttpServletResponse response) throws Exception
{
 
  
  product = pageDAO.getPageByName("products");
  request.setAttribute("product",product); // send message to JSP    
  return new Viewable("/products", null);
}

	  
	 @GET
	    @Path("/{productId}")
	    public Viewable feed_page( @Context HttpServletRequest request,   @Context HttpServletResponse response, @PathParam("productId") int productId) throws Exception
	    {
		 // request.setAttribute("menu_companies", pageDAO.getAllCompaniesPages() );	  
		  
	      product = pageDAO.getPageById(productId);
	      request.setAttribute("product",product); // send message to JSP	        
	      return new Viewable("/products", null);
	    }
	 

}
