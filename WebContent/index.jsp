<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.io.*,java.util.*, javax.servlet.*" %>
<%@page import="com.iqenergy.DAO.*"%>
<%@ page import="com.iqenergy.model.*" %>
<%@ page import="com.iqenergy.controller.*" %>
<%@ page import ="com.iqenergy.util.ServerHelper" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% out.println("Iq-energy"); %>

<a href = "<%=request.getContextPath()%>/admin/superadmin/menu-left"> adminka </a>
<br>
<br>

<%


	LeftMenuDAO lmdao = new LeftMenuDAO();


//	ArrayList<Places> listplaces = placesDAO.showAllPlaces();
LeftMenu leftMenu = new LeftMenu();
leftMenu = lmdao.getMenuById(1);
out.println(leftMenu.getMenu_name()+"  id:"+leftMenu.getMenu_id()+ "  status:"+leftMenu.getM_status() +"<br/>");


				

ArrayList<LeftMenu> listAllplaces = lmdao.getAllMenus();


for (int i=0;i<listAllplaces.size();i++)
{
	out.println(listAllplaces.get(i).getMenu_name()+"  id:"+listAllplaces.get(i).getMenu_id()+ "  status:"+listAllplaces.get(i).getM_status() +"<br/>");
}

%>




</body>
</html>