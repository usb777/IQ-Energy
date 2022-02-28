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
            <h1>Blank Page <small>A Blank Slate</small></h1>
            <ol class="breadcrumb">
              <li><a href="index.html"><i class="icon-dashboard"></i> Dashboard</a></li>
              <li class="active"><i class="icon-file-alt"></i> Blank Page</li>
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
   
     user_id = session.getAttribute("user_id").toString(); 
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
           
         <form role="form" action="user-insert" method="POST"  acceptcharset="UTF-8">                                     
                                    
                                    <!-- private String name;            //2   -->
                                        <div class="form-group">
                                            <label>Full Name</label><br/>
                                            <input class="form-control" type="text" name="fullname" value = "">                                          
                                        </div>
                                        <div class="form-group">
                                            <label>E-mail</label><br/>
                                            <input class="form-control" type="text" name="email" value = "">                                          
                                        </div>                                        
                                        
                                          <div class="form-group">
                                            <label>Username</label><br/>
                                            <input class="form-control" type="text" name="username" value = "">                                          
                                        </div>
                                          <div class="form-group">
                                            <label>Password</label><br/>
                                            <input class="form-control" type="text" name="password" value = "">                                          
                                          </div>
                                          
                                          <div class="form-group">
                                            <label>Roley</label>
                                      <select class="form-control" name="role">                                            
                                        
                                       <option value="1" disabled>1 -administrator</option>
                                       <option value="2" >2 - moderator</option>
                                       <option value="3" >3 - superUser</option>
                                       <option value="4" selected >4 - user</option>
                                       
                                        </select>
                                        </div> 
                                          
                                          
                                        
                                  
                 <!--//   <input type="hidden" name="action" value="insert">   //-->
                  
                  <button type="submit" class="btn btn-success" value="insert" name="submit">Save</button>
                  <button type="reset" class="btn btn-default">Reset</button>
                                    </form>
                                    
                                    
                                    
                                    
                                    
                                </div>
                              
            
            
            
            
            
            
            
            
            
            
            
            
            
          </div>
        </div><!-- /.row -->
        
              
        
        

      </div><!-- /#page-wrapper -->

<jsp:include page="includes/footer.jsp" />
