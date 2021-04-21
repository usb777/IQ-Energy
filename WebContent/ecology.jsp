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
   				List<Menu> rightMenus = menuDao.getMenuByGroup1("rm_ecology") ;
           
                         int counter = menuDao.getCounterOfMenuGroup("rm_ecology")  ;
                     //    out.println("Kol-vo ecologist:"+counter);
             	Page ecology = new Page();
              	ecology = (Page)request.getAttribute("ecologyinfo");   
              	
              	String menuTitle="";
              	 if ( session.getAttribute("menuTitle")!=null )  { menuTitle = (String)session.getAttribute("menuTitle");}
             
             %>
  <div class="row">

<!-- Left-menu -->
<!-- Form Menu by    menuid and parent-id dependency   also check menu_group   -->
<!--  return all rightmenu_ecology -->
     <div class="col-sm-6 col-lg-4">
            <ul class="nav flex-column column_nav">
         
            	<li class="nav-item">
            		<a class="nav-link" data-bs-toggle="collapse" href="#nl_ecology" role="button" aria-expanded="true" aria-controls="collapseExample" href="#"><%=menuTitle %></a>
                  <div class="collapse show" id="nl_ecology">
                   <ul class="nav flex-column column_nav_sub">
            	
            		 <li class="nav-item">
                                                   
                      <a class="nav-link collapsed" data-bs-toggle="collapse" href="#nl_icemix" role="button" aria-expanded="false" 
                            aria-controls="nl_icemix">Кодекс и НПА</a>
                      <div class="collapse" id="nl_icemix">
                        <ul class="nav flex-column column_nav_sub_sub">
                    
                          <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/ecology/59#begin">Экологический Кодекс РК</a>
                          </li>                          
                         <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/ecology/60#begin">Нормативно-правовые акты</a>
                          </li>    
                          
                        </ul>
                      </div> 
                           
                      </li>
                      
                      
            		 <li class="nav-item">
                          <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/ecology/16#begin">СМИ об экологии </a>
                      </li>
                      
                      
            		 <li class="nav-item">
                          <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/ecology/17#begin"> Уполномоченный орган РК 	 </a>
                      </li>
            
            		 </ul>
                  </div> <!--// ecology div //-->
              </li>  <!--//top nav-item  //-->
            
             
              
             <!--  --> 
              

            </ul>
          </div>


<!-- End Left-menu -->
          <div class="col-sm-12 col-lg-8 mb-2">
          
           
           
           
            <h1 id="begin"><%=ecology.getPage_title() %></h1>

            <p class="page_text">
             <%=ecology.getPage_info() %>
            </p>

       
          </div>
        </div> <!-- row -->
      </div>  <!-- main content -->

      <!-- Footer -->
         <jsp:include page="includes/footer.jsp" />
    