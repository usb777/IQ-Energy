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
         
  
            
         <% 
    	 Page currentPage = (Page)request.getAttribute("page"); 
         
         
         %>
            
            
            
         
                 <form role="form" action="update" method="POST"  acceptcharset="UTF-8">  
                                   
                                   <input type="hidden" id="id" name="page_id" value="<%=currentPage.getPage_id() %>">  
                                    <!-- private String name; 
                                               //2   -->
                                        <div class="form-group">
                                            <label>Page Name</label><br/>
                                            <input class="form-control" type="text" name="page_name" value = "<%=currentPage.getPage_name() %>">                                          
                                        </div>
                                        
                                        <div class="form-group">
                                            <label>Title</label><br/>
                                            <input class="form-control" type="text" name="page_title" value = "<%=currentPage.getPage_title() %>">                                          
                                        </div>
                                          
                                          
                                      <!--        
                                         <div class="form-group">
                                            <label>Description</label>
                                           <textarea class="form-control" rows="15" name="page_info"><%=currentPage.getPage_info() %></textarea>
                                        </div>
                                         -->
                                          <textarea name="page_info">
   <%=currentPage.getPage_info() %>
  </textarea>
                                        
                                        
                                       <div class="form-group">
                                            <label>Page Order</label>
                                      <select class="form-control" name="page_order">   
                                                                               
                                     <%   for (int i=0; i<13; i++)  {  %>   
                                      <option value="<%=i %>" <% if (currentPage.getPage_order()==i) {out.println("selected");}  %> ><%=i %></option>
                                      
                                       
                                       <% }  %>
                                       
                                       
                                        </select>
                                        </div> 
                                     <!--    
                                        <div class="form-group">
                                            <label>Page Group</label><br/>
                                            <input class="form-control" type="text" name="page_group" value = "<%=currentPage.getPage_group() %>">                                          
                                        </div>  
                                         -->
                                        
                                <div class="form-group">
                                   <label>Page Group</label>
                             <select class="form-control" name="page_group">  
                                    
                                 <option value="home" <% if (currentPage.getPage_group().equals("home")) {out.println("selected");}  %> >home</option>    
                                 <option value="company" <% if (currentPage.getPage_group().equals("company")) {out.println("selected");}  %> > company </option>                                         
                               <option value="ecology" <% if (currentPage.getPage_group().equals("ecology")) {out.println("selected");}  %> > ecology </option>  
                             
                             
                                 <option value="products" <% if (currentPage.getPage_group().equals("products")) {out.println("selected");}  %> > products </option>                                         
                               <option value="icemix" <% if (currentPage.getPage_group().equals("icemix")) {out.println("selected");}  %> > icemix </option>  
                               <option value="ecobarrier" <% if (currentPage.getPage_group().equals("ecobarrier")) {out.println("selected");}  %> > ecobarrier </option> 
                               
                               
                               
                                 <option value="nedrousers" <% if (currentPage.getPage_group().equals("nedrousers")) {out.println("selected");}  %> > nedrousers </option>                                         
                                 <option value="gkh" <% if (currentPage.getPage_group().equals("gkh")) {out.println("selected");}  %> > gkh </option>                                         
                                 <option value="tek" <% if (currentPage.getPage_group().equals("tek")) {out.println("selected");}  %> > tek </option>                                         
                                 <option value="apk" <% if (currentPage.getPage_group().equals("apk")) {out.println("selected");}  %> > apk </option>                                         
                                 <option value="pgs" <% if (currentPage.getPage_group().equals("pgs")) {out.println("selected");}  %> > pgs </option>                                         
                             
                                
                              
                                       
                              </select>
                                        </div>
                                        
                                        
                                        
                                         
                                     <!--    
                                       <div class="form-group">
                                            <label>Page template</label><br/>
                                            <input class="form-control" type="text" name="template" value = "<%=currentPage.getTemplate() %>">                                          
                                        </div>  
                                         -->
                                        
                                           <div class="form-group">
                                            <label>Page template</label>
                                   <select class="form-control" name="template">  
                                   
                                    
                                 <option value="index.jsp" <% if (currentPage.getTemplate().equals("index.jsp")) {out.println("selected");}  %> >index.jsp</option>    
                                 <option value="company.jsp" <% if (currentPage.getTemplate().equals("company.jsp")) {out.println("selected");}  %> >company.jsp</option> 
                                 <option value="product.jsp" <% if (currentPage.getTemplate().equals("product.jsp")) {out.println("selected");}  %> >product.jsp</option> 
                                 <option value="ecology.jsp" <% if (currentPage.getTemplate().equals("ecology.jsp")) {out.println("selected");}  %> >ecology.jsp</option> 
                                 
                                 <option value="nedrousers.jsp" <% if (currentPage.getTemplate().equals("nedrousers.jsp")) {out.println("selected");}  %> >nedrousers.jsp</option>                                 
                                
                                 <option value="gkh.jsp" <% if (currentPage.getTemplate().equals("gkh.jsp")) {out.println("selected");}  %> > gkh.jsp </option> 
                                 <option value="tek.jsp" <% if (currentPage.getTemplate().equals("tek.jsp")) {out.println("selected");}  %> > tek.jsp </option> 
                                 <option value="apk.jsp" <% if (currentPage.getTemplate().equals("apk.jsp")) {out.println("selected");}  %> > apk.jsp </option> 
                                 <option value="pgs.jsp" <% if (currentPage.getTemplate().equals("pgs.jsp")) {out.println("selected");}  %> > pgs.jsp</option>                                          
                                       
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
