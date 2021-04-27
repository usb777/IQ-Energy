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
         
  
            
      
            
            
         
                 <form role="form" action="page-add/insert" method="POST"  acceptcharset="UTF-8">  
                                   
                                   <input type="hidden" id="id" name="page_id" value="">  
                                    <!-- private String name; 
                                               //2   -->
                                        <div class="form-group">
                                            <label>Page Name</label><br/>
                                            <input class="form-control" type="text" name="page_name" value = "">                                          
                                        </div>
                                        
                                        <div class="form-group">
                                            <label>Title</label><br/>
                                            <input class="form-control" type="text" name="page_title" value = "">                                          
                                        </div>
                                             
                                         <div class="form-group">
                                            <label>Description</label>
                                              
                                           <textarea class="form-control" rows="35" name="page_info"></textarea>
                                        </div>
                                        
                                       <div class="form-group">
                                            <label>Page Order</label>
                                      <select class="form-control" name="page_order">   
                                                                               
                                     <%   for (int i=0; i<13; i++)  {  %>   
                                      <option value="<%=i %>" > <%=i %></option>
                                      
                                       
                                       <% }  %>
                                       
                                       
                                        </select>
                                        </div> 
                                
                                        
                                <div class="form-group">
                                   <label>Page Group</label>
                             <select class="form-control" name="page_group">  
                                    
                                 <option value="home"  >home</option>    
                                 <option value="company"  > company </option>                                         
                               <option value="ecology"  > ecology </option>  
                             
                             
                                 <option value="products"  > products </option>                                         
                               <option value="icemix"  > icemix </option>  
                               <option value="ecobarrier"  > ecobarrier </option> 
                               
                               
                               
                                 <option value="nedrousers"  > nedrousers </option>                                         
                                 <option value="gkh"  > gkh </option>                                         
                                 <option value="tek"  > tek </option>                                         
                                 <option value="apk" > apk </option>                                         
                                 <option value="pgs"  > pgs </option>                                         
                             
                                
                              
                                       
                              </select>
                                        </div>
                                        
                                                                                
                                         
                                
                                        
                                           <div class="form-group">
                                            <label>Page template</label>
                                   <select class="form-control" name="template">  
                                   
                                    
                                 <option value="index.jsp"  >index.jsp</option>    
                                 <option value="company.jsp"  >company.jsp</option> 
                                 <option value="product.jsp" <%="selected" %> >product.jsp</option> 
                                 <option value="ecology.jsp" >ecology.jsp</option> 
                                 
                                 <option value="nedrousers.jsp" >nedrousers.jsp</option>                                 
                                
                                 <option value="gkh.jsp"  > gkh.jsp </option> 
                                 <option value="tek.jsp" > tek.jsp </option> 
                                 <option value="apk.jsp"  > apk.jsp </option> 
                                 <option value="pgs.jsp" > pgs.jsp</option>                                          
                                       
                                   </select>
                                        </div>
                                        
                                          
                                        
                  
                  <button type="submit" class="btn btn-success"  name="submit">Save</button>
                  <button type="reset" class="btn btn-default">Reset</button>
                                    </form>
            
            
            
            
     
              </div>
            
          </div>
        </div><!-- /.row -->

      </div><!-- /#page-wrapper -->

<jsp:include page="includes/footer.jsp" />
