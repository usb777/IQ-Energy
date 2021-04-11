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


      <div id="page-wrapper">

        <div class="row">
          <div class="col-lg-12">
            <h1>Blank Page <small>A Blank Slate</small></h1>
            <ol class="breadcrumb">
              <li><a href="index.html"><i class="icon-dashboard"></i> Dashboard</a></li>
              <li class="active"><i class="icon-file-alt"></i> Blank Page</li>
            </ol>
            
            
                 <div class="card mb-3">
        <div class="card-header">
          
        <!-- <button type="button" class="btn btn-success"  onclick='insertCategoryPage(<%=path1 %>) ; ' >Add New Category</button>   -->
          <a href ="<%=request.getContextPath()%>/admin/superadmin/menu-new" class="btn btn-success" >Add New Menu Item </a>
           </div>
        <div class="card-body">
          <div class="table-responsive">
          
          
          
<%
/*
String user_id="";
String username="";

ServerHelper serverHelper = new ServerHelper();
String REAL_SERVER_HOST = serverHelper.getRealServerPath(request);
        		  
  if (session.getAttribute("username")==null) 
  {	  response.sendRedirect(REAL_SERVER_HOST+"/index.jsp");  
  }
  else 
  { username = session.getAttribute("username").toString();   
     user_id = session.getAttribute("user_id").toString(); 
 	  
  }
  */
	 %>
         
          
            <table class="table table-bordered table-striped" id="dataTable" width="100%" cellspacing="0">
              <thead>
                <tr>
                   <th width="5%">ID</th>
                  <th  width="10%">Name</th>
                   <th  width="10%">parent id</th>
                    <th  width="10%">link</th>
                    <th  width="10%" >status</th>                  
                  <th width="10%" >Action </th>
                  <th width="10%">Action </th>
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
                 <th width="5%">ID</th>
                  <th  width="10%">Name</th>
                   <th  width="10%">parent id</th>
                    <th  width="10%">link</th>
                    <th  width="10%" >status</th>                   
                  <th width="10%" >Action </th>
                  <th width="10%">Action </th>
                </tr>
              </tfoot>
              <tbody>
              		<%	
								  
              		 List<LeftMenu> listMenu = (List<LeftMenu>)request.getAttribute("leftmenu"); 
					
              		for(LeftMenu menus : listMenu)
					{
						
					 %>
              
                <tr>
               	   <td><%=menus.getMenu_id() %> </td>
                   <td><%=menus.getMenu_name() %>  </td>
                     <td><%=menus.getParent_id()  %> </td>
                   <td><%=menus.getLink() %> </td>  
                   <td><%=menus.getM_status() %> </td>                   
                   <td>
               <a href = "<%=request.getContextPath()%>/admin/superadmin/menu-left-edit?id=<%=menus.getMenu_id() %>" class="btn btn-primary"> Edit</a> 
                    </td>
                  
                  
                   <td>
             
<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#deleteLeftMenuModal<%=menus.getMenu_id() %>">
  Delete
</button>

 <!--  <a href = "<%=request.getContextPath()%>/admin/superadmin/category-delete?id=<%=menus.getMenu_id() %>" class="btn btn-primary"> Delete working</a> //--> 
            
<!-- Modal -->
<div class="modal fade" id="deleteLeftMenuModal<%=menus.getMenu_id() %>" tabindex="-1" role="dialog" aria-labelledby="deleteLeftMenuModalTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="deleteLeftMenuModalTitle">Delete Menu</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
       Do you want to delete this menu item ? id=<%=menus.getMenu_id() %>
      </div>
      <div class="modal-footer">
       <!--   <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button> -->
        <a href="#"  class="btn btn-secondary" data-dismiss="modal" >Cancel </a>
        <a href = "<%=request.getContextPath()%>/admin/superadmin/menu-left-delete?id=<%=menus.getMenu_id() %>" class="btn btn-primary"> Confirm</a>  
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
