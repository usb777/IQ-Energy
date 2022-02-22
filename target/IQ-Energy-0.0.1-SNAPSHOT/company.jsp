<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>

<%@ page import = "java.io.*,java.util.*, javax.servlet.*" %>
<%@page import="com.iqenergy.DAO.*"%>
<%@ page import="com.iqenergy.model.*" %>
<%@ page import="com.iqenergy.controller.*" %>
<%@ page import ="com.iqenergy.util.ServerHelper" %>


  <jsp:include page="includes/header.jsp" />

      <!-- main content -->
      <div class="main_content">


            <% 
          
           
        
            	MenuDAO  menuDao = new MenuDAO();
   				List<Menu> rightMenus = menuDao.getMenuByGroup1("rm_company") ;
                       int counter = menuDao.getCounterOfMenuGroup("rm_company")  ;
                     //    out.println("Kol-vo ecologist:"+counter);
             	 Page company = new Page();
      		    company = (Page)request.getAttribute("companyinfo");   
              	
              	String menuTitle="";
              	 if ( session.getAttribute("menuTitle")!=null )  { menuTitle = (String)session.getAttribute("menuTitle");}
             
             %>




        <div class="row">

<!-- Left-menu -->


     <div class="col-sm-6 col-lg-4">
            <ul class="nav flex-column column_nav">
        
        
            <%
            int k=0;
            for (Menu rmenus: rightMenus )
            {
            	if (rmenus.getMenu_head()==1 ) // active Collapse Menu head==1
            	{  String colapser = rmenus.getMenu_group()+""+rmenus.getMenu_id();  //always opened colapser
            	   // at this point make counter  = count (menu_group) and parent_id ==menu_id   - 1
            	  k =0;
            		%>
            	<li class="nav-item">
            		<a class="nav-link" data-bs-toggle="collapse" href="#<%=colapser %>" role="button" aria-expanded="true" aria-controls="collapseExample" href="#"><%=menuTitle %></a>
                  <div class="collapse show" id="<%=colapser %>">
                   <ul class="nav flex-column column_nav_sub">
            		<%
            	}
            	
            	else  // head!=1
            	{
            		%>
            		 <li class="nav-item">
                          <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/company/<%=rmenus.getPage_id()%>#begin"> <%=rmenus.getMenu_name() %> </a>
                      </li>
            		<%
            	} //else
            k++;  
            	if (k==rightMenus.size())  
            	{
            	%>
            		 </ul>
                  </div> <!--// ecology div //-->
              </li>  <!--//top nav-item  //-->
            		<%
            		break;
            	}
            } //for
            %>
             
              
             <!--  --> 
              
              
            </ul>
          </div>


<!-- End Left-menu -->
          <div class="col-sm-12 col-lg-8 mb-2">
          
           
           
           
           
            <h1 id="begin"><%=company.getPage_title() %></h1>

            <p class="page_text">
             <%=company.getPage_info() %>
            </p>

       
          </div>
        </div> <!-- row -->
      </div>  <!-- main content -->

      <!-- Footer -->
         <jsp:include page="includes/footer.jsp" />
    