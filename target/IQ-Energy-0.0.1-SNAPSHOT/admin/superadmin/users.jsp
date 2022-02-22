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
            <h1>Users <small>users</small></h1>
            <ol class="breadcrumb">
              <li><a href="index.html"><i class="icon-dashboard"></i> Dashboard</a></li>
              <li class="active"><i class="icon-file-alt"></i> users</li>
            </ol>
            
            
            
            
                 <div class="card mb-3">
        <div class="card-header">
         <a href ="<%=request.getContextPath()%>/admin/superadmin/user-new" class="btn btn-success" >Add New User </a>
           </div>
           <br>
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
         
          
            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
              <thead>
                <tr>
                   <th>ID</th>
                   <th>Full Name</th>
                   <th>Email</th>
                   <th>Username</th>
                   <th>password</th>
                   <th>Role</th>
                  <th >Action </th>
                  <th >Action </th>
                </tr>
              </thead>
     
              <tfoot>
                   <th>ID</th>
                   <th>Full Name</th>
                   <th>Email</th>
                   <th>Username</th>
                   <th>password</th>
                   <th>Role</th>
                  <th >Action </th>
                  <th >Action </th>
                </tr>
              </tfoot>
              <tbody>
              		<%	
				 // Users user = new Users();
				  
									
				//	PlacesDAO pdao = new PlacesDAO();
					
				//	UsersDAO userDAO = new UsersDAO();
				//	ArrayList<Users> listusers = userDAO.getAllUsers();
				 List<Users> listusers = (List<Users>)request.getAttribute("users"); 
					
				/*	for (int i=0;i<listusers.size();i++)
					{
					*/	
					 %>
					 
					 
					    <!--   for (Todo todo: todos) {  -->
   <% for(Users users : listusers)
   { %>
   <tr>
    <td><%=users.getId()%></td>  
    <td><%=users.getFullname()%></td>
    <td><%=users.getEmail() %></td>
    <td><%=users.getUsername() %></td>
    <td><%=users.getPassword() %></td>
    <td><%=users.getRole() %></td>
   <td><a href = "<%=request.getContextPath()%>/admin/superadmin/user-edit?id=<%=users.getId() %>" class="btn btn-primary"> Edit</a> </td>
   <td>   
<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#deleteUserModal<%=users.getId() %>">
  Delete
</button>

  
<!-- Modal -->
<div class="modal fade" id="deleteUserModal<%=users.getId() %>" tabindex="-1" role="dialog" aria-labelledby="deleteUserModalTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="deleteUserModalTitle">Edit Event</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
       Do you want to delete this user ? id=<%=users.getId() %>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
        <button type="button" class="btn btn-primary"   onclick='deleteUser(<%=users.getId() %>,<%=path1 %>) ;' >Confirm</button>
      </div>
    </div>
  </div>
</div>

<!--// end MODAL //-->
  



   
   </td>
  
  
  
   </tr>
   <%} 
   
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
