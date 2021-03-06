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

@Path("/ru/apk/")
public class ApkJersey {
	
PageDAO pageDAO = new PageDAO();
Page apkPage =new Page();

/*
 SELECT m.`menu_id`, m.`menu_name`,m.`page_id`, p.`page_group` AS page_group, m.`parent_id`, m.`menu_status`, m.`menu_level`, m.`menu_group`, m.`menu_head`
 FROM menu m  JOIN pages p  ON m.`page_id` = p.`page_id`  WHERE m.menu_group="rm_ecology" AND m.`menu_status`=1 ORDER BY m.menu_id		
 */
		

	@GET
	public Viewable getNedroUsersPage( @Context HttpServletRequest request,   @Context HttpServletResponse response) throws Exception
	{   
		
		HttpSession session = null;
	    session = request.getSession(true);    
	 
	    apkPage = pageDAO.getPageByName("apk");
	    
	    //TODO in future Remove this Costyl
	    request.setAttribute("menu_icemix", pageDAO.getAllIcemixPages() );           //TODO in future Remove this Costyl
	    request.setAttribute("menu_ecobarrier", pageDAO.getAllEcobarrierPages() );  //TODO in future Remove this Costyl
	    
	    
		session.setAttribute("menuTitle",apkPage.getPage_title());
		
		request.setAttribute("apkinfo", apkPage ); // send message to JSP    
		return new Viewable("/apk", null);
	}

	  
	 @GET
	    @Path("/{apkID}")
	    public Viewable feed_page( @Context HttpServletRequest request,   @Context HttpServletResponse response, @PathParam("apkID") int apkID) throws Exception
	    {
		 //TODO in future Remove this Costyl
		  request.setAttribute("menu_icemix", pageDAO.getAllIcemixPages() );          //TODO in future Remove this Costyl
		  request.setAttribute("menu_ecobarrier", pageDAO.getAllEcobarrierPages() );  //TODO in future Remove this Costyl
	           
		 apkPage = pageDAO.getPageById(apkID);
	      request.setAttribute("apkinfo", apkPage); // send message to JSP	      
	  
	    //  request.setAttribute("companyId", companyId); // send message to JSP
	      
	      return new Viewable("/apk", null);
	    }
	 

}
