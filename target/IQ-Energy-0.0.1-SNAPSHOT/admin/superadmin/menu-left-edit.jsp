<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ page import = "java.io.*,java.util.*, javax.servlet.*" %>
<%@page import="com.iqenergy.DAO.*"%>
<%@ page import="com.iqenergy.model.*" %>
<%@ page import="com.iqenergy.controller.*" %>
<%@ page import ="com.iqenergy.util.ServerHelper" %>

<jsp:include page="includes/header.jsp" />
<jsp:include page="includes/navbar.jsp" />

  <%
                  String path =      request.getContextPath();
                  String path1 = '"'+request.getContextPath()+'"'; // for good javacript function parameter
   %>
<%     
ServerHelper serverHelper = new ServerHelper();
String REAL_SERVER_HOST = serverHelper.getRealServerPath(request);
 %>

      <div id="page-wrapper">

        <div class="row">
          <div class="col-lg-12">
            <h1>User Update <small>Left Menu</small></h1>
            <ol class="breadcrumb">
              <li><a href="index.html"><i class="icon-dashboard"></i> Dashboard</a></li>
              <li class="active"><i class="icon-file-alt"></i> Menu Left update</li>
            </ol>
            
            
                               
          
<%

String user_id="";
String username="";
        		  
  if (session.getAttribute("username")==null) 
  {
	  response.sendRedirect(REAL_SERVER_HOST+"/index.jsp");
  
  }
  else 
  { username = session.getAttribute("username").toString(); 
    // out.println("Hello user <b>"+username+"</b> , welcome<br>");
     user_id = session.getAttribute("user_id").toString(); 
   //  out.println("User_ID ="+user_id+"<br>");
	  
  }
  

	 %>
          
          
           <div class="col-lg-6">
           
       <%
 
 if (request.getAttribute("report")!=null)
  {
	 out.println("<CENTER>"+request.getAttribute("report")+"</CENTER>");
	
  }
 else 
   {
	// out.println("Empty report");
   }
	 


%> 
             <% 
              LeftMenu leftMenu = new LeftMenu();
             leftMenu = (LeftMenu)request.getAttribute("menu");
             
             List<LeftMenu> listMenu = (List<LeftMenu>)request.getAttribute("leftmenus"); 
	   		 for(LeftMenu menus : listMenu)
				{
                       out.println("menu id:"+menus.getMenu_name());  			
				}
        		  
           
           %>
         <form role="form" action="menu-left-update" method="POST"   accept-charset="utf-8"  >  
                                   
                                   <input type="hidden" id="id" name="id" value="<%=leftMenu.getMenu_id() %>">  
                                    <!-- private String name;            //2   -->
                                        <div class="form-group">
                                            <label>Menu name</label><br/>
                                            <input class="form-control" type="text" name="name" value = "<%=leftMenu.getMenu_name() %>">                                          
                                        </div>
                                        <div class="form-group">
                                            <label>Parent Menu</label><br/>
                                            <input class="form-control" type="text" name="parent_id" value = "<%=leftMenu.getParent_id() %>">                                          
                                        </div>
                                       
                                        <div class="form-group">
                                            <label>Link</label><br/>
                                            <input class="form-control" type="text" name="link" value = "<%=leftMenu.getLink() %>">                                          
                                        </div>
                                        
                                          <div class="form-group">
                                            <label>Status</label><br/>
                                            <input class="form-control" type="text" name="status" value = "<%=leftMenu.getM_status() %>">                                          
                                          </div>
                                         
               <!--//     <input type="hidden" name="action" value="update">  //--> 
                  
                  <button type="submit" class="btn btn-success"  name="submit">Save</button>
                  <button type="reset" class="btn btn-default">Reset</button>
                                    </form>
                                    
                                </div>
            
            
            
            
            
            
            
            
            
          </div>
        </div><!-- /.row -->
        
              
        
        

      </div><!-- /#page-wrapper -->

<jsp:include page="includes/footer.jsp" />
