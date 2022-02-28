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
            <h1>Slogan <small>edit</small></h1>
            <ol class="breadcrumb">
              <li><a href="index.html"><i class="icon-dashboard"></i> Dashboard</a></li>
              <li class="active"><i class="icon-file-alt"></i> update slogan</li>
            </ol>
            
            
    <div class="col-lg-6">          
<%

String user_id="";
String username="";

        		  
  if (session.getAttribute("username")==null) 
  {	  response.sendRedirect(REAL_SERVER_HOST+"/index.jsp");  
  }
  else 
  { username = session.getAttribute("username").toString();   
     user_id = session.getAttribute("user_id").toString(); 
 	  
  }

	 %>
         
  
            
         <% 
    	 Slogan currentSlogan = (Slogan)request.getAttribute("slogan");          
         
         %>
            
            
            
         
                 <form role="form" action="update" method="POST"  acceptcharset="UTF-8">  
                                   
                                   <input type="hidden" id="id" name="id" value="<%=currentSlogan.getId() %>">  
                                    <!-- private String name; 
                                               //2   -->
                                        <div class="form-group">
                                            <label>Slogan</label><br/>
                                            <input class="form-control" type="text" name="slogan" value = "<%=currentSlogan.getSlogan() %>">                                          
                                        </div>
                                        
                  
                  <button type="submit" class="btn btn-success"  name="submit">Save</button>
                  <button type="reset" class="btn btn-default">Reset</button>
                
                </form>
            
            
            
            
     
              </div>
            
          </div>
        </div><!-- /.row -->

      </div><!-- /#page-wrapper -->

<jsp:include page="includes/footer.jsp" />
