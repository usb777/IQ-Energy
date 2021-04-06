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
          </div>
        </div><!-- /.row -->

      </div><!-- /#page-wrapper -->

<jsp:include page="includes/footer.jsp" />
