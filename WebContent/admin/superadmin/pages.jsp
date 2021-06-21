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
            <h1>All <small>pages </small></h1>
            <ol class="breadcrumb">
              <li><a href="index.html"><i class="icon-dashboard"></i> Dashboard</a></li>
              <li class="active"><i class="icon-file-alt"></i>pages</li>
            </ol>
            
            
      <div class="card mb-3">
        <div class="card-header">
          
        <!-- <button type="button" class="btn btn-success"  onclick='insertCategoryPage(<%=path1 %>) ; ' >Add New Category</button>   -->
          <a href ="<%=request.getContextPath()%>/v/en/admin/pages/page-add" class="btn btn-success" >Add New Page </a> <br>
           </div>
        <div class="card-body">
          <div class="table-responsive">
          
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
         
          
            <table class="table table-bordered table-hover table-striped tablesorter" id="dataTable" width="100%" cellspacing="0">
              <thead>
                <tr>
                    <th width="5%">ID</th>
                  <th  width="5%">Name</th>
                   <th  width="5%">Title</th>
                    <th  width="60%">Info</th>
                    <th  width="5%" >order</th>                   
                  <th width="5%" >group </th>
                  <th width="5%" >template </th>
                  <th width="5%">Action </th>
                  <th width="5%">Action </th>
                </tr>
              </thead>
    <!--           
       <thead class="thead-grey">
            <tr>
            <th rowspan="8"> 
            <button type="button" class="btn btn-success">Add New Place</button></th>
           
           </tr>
    </thead>
     
        -->     
        
        
 
              <tfoot>
               <tr>
                 <td width="5%">ID</td>
                  <td  width="5%">Name</td>
                   <td  width="5%">Title</td>
                    <td  width="60%">Info</td>
                    <td  width="5%" >order</td>                   
                  <td width="5%" >group </td>
                  <td width="5%" >template </td>
                  <td width="5%">Action </td>
                     <td width="5%">Action </td>
                </tr>
              </tfoot>
              <tbody>
              		<%	
								  
              		 List<Page> listPages = (List<Page>)request.getAttribute("pages"); 
					
              		for(Page pages : listPages)
					{
						
					 %>
             
                <tr>
               	   <td><%=pages.getPage_id() %> </td>
                   <td><%=pages.getPage_name() %>  </td>
                   <td><%=pages.getPage_title()   %> </td>
                   <td>
                
                   
                   
                   
                     <div id="accordion">
                       <div class="card">
                         <div class="card-header" id="heading<%=pages.getPage_id() %>">
                        <h5 class="mb-0">
              <button class="btn btn-link " data-toggle="collapse" data-target="#collapse<%=pages.getPage_id() %>" aria-expanded="true" aria-controls="collapse<%=pages.getPage_id() %>">
                Description #<%=pages.getPage_id() %>
             </button>
                       </h5>
                        </div>

                 <div id="collapse<%=pages.getPage_id() %>" class="collapse" aria-labelledby="heading<%=pages.getPage_id() %>" data-parent="#accordion">
                   <div class="card-body">
                  
   <%=pages.getPage_info()   %>

                   </div>
                 </div>
              </div>
                 </div> 
                   
                   
                   
                   
                   
                   
                   
                    </td>  
                   <td><%=pages.getPage_order()  %> </td>
                   <td><%=pages.getPage_group()  %> </td>
                  <td><%=pages.getTemplate()  %> </td>
                   
                                      
                   <td>
               <a href = "<%=request.getContextPath()%>/v/en/admin/pages/page-edit/<%=pages.getPage_id() %>" class="btn btn-primary"> Edit</a> 
                    </td>
                  
                  
                   <td>
             
<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#deleteLeftMenuModal<%=pages.getPage_id() %>">
  Delete
</button>

 
            
<!-- Modal -->
<div class="modal fade" id="deleteLeftMenuModal<%=pages.getPage_id() %>" tabindex="-1" role="dialog" aria-labelledby="deleteLeftMenuModalTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="deleteLeftMenuModalTitle">Delete Menu</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
       Do you want to delete this menu item ? id=<%=pages.getPage_id() %>
      </div>
      <div class="modal-footer">
       <!--   <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button> -->
        <a href="#"  class="btn btn-secondary" data-dismiss="modal" >Cancel </a>
        <a href = "<%=request.getContextPath()%>/v/en/admin/pages/page-delete/<%=pages.getPage_id() %>" class="btn btn-primary"> Confirm</a>  
      </div>
    </div>
  </div>
</div>

<!--// end MODAL //-->
  

</td>
                </tr>
              <%
					}
					%>
              </tbody>
            </table>
            
            
          </div>
        </div>
        <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
      </div>
            
            
     
            
            
          </div>
        </div><!-- /.row -->

      </div><!-- /#page-wrapper -->

<jsp:include page="includes/footer.jsp" />
