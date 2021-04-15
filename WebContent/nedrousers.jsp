<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>

<%@ page import = "java.io.*,java.util.*, javax.servlet.*" %>
<%@page import="com.iqenergy.DAO.*"%>
<%@ page import="com.iqenergy.model.*" %>
<%@ page import="com.iqenergy.controller.*" %>
<%@ page import ="com.iqenergy.util.ServerHelper" %>


  <jsp:include page="includes/header.jsp" />

      <!-- main content -->
      <div class="main_content">

        <div class="row">

   <% 
              Page product = new Page();
              product = (Page)request.getAttribute("nedrouserinfo");   
              
              
              //  Not collapsed Mechanizm
              String icemix_a_class="nav-link collapsed";
              String icemix_aria_expanded="false";
              String icemix_div_class = "collapse";
              
              if (product.getPage_group().equals("nedrousers_neftegaz"))  
              {
            	   icemix_a_class="nav-link";
                   icemix_aria_expanded="true";
                   icemix_div_class = "collapse show";  
              }
              
              
              
    %>

<!-- Left-menu -->


     <div class="col-sm-6 col-lg-4">
            <ul class="nav flex-column column_nav">
              <li class="nav-item">
          <a class="nav-link" data-bs-toggle="collapse" href="#nedro_users" role="button" aria-expanded="true" aria-controls="collapseExample" href="#">Решения для недропользователей</a>
              <div class="collapse show" id="nedro_users">
                    <ul class="nav flex-column column_nav_sub">
                    
                  <li class="nav-item">                  
              <a class="<%=icemix_a_class %>" data-bs-toggle="collapse" href="#nl_icemix" role="button" aria-expanded="<%=icemix_aria_expanded %>" aria-controls="nl_icemix">
                       Решения для нефтегазовой сферы
               </a>                       
                      <div class="<%=icemix_div_class %>" id="nl_icemix">
                        <ul class="nav flex-column column_nav_sub_sub">
                        
                         <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/nedrousers-ng_icemix">Противогололёдный реагент «АйсМикс»</a>
                          </li>   
                                                 
                          <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/nedrousers-ng_ecobarrier">Пылеподавитель реагент «ЭкоБарьер»</a>
                          </li>
                       
                          
                        </ul>
                      </div>                     
                      
                   </li> <!-- nav-item -->
                               
                   
                    <!-- ============================ -->
                          <% 
              //  Not collapsed Mechanizm
              String gorruda_a_class="nav-link collapsed";
              String gorruda_aria_expanded="false";
              String gorruda_div_class = "collapse";
              
              if (product.getPage_group().equals("nedrousers_gorrud"))  
              {
            	  gorruda_a_class="nav-link";
            	  gorruda_aria_expanded="true";
            	  gorruda_div_class = "collapse show";  
              }
              
           
              
              %>
                   
                   
          <li class="nav-item">                  
          <a class="<%=gorruda_a_class %>" data-bs-toggle="collapse" href="#nl_ecobarier" role="button" aria-expanded="<%=gorruda_aria_expanded %>" aria-controls="nl_ecobarier">
                      Решения для горно-рудной отрасли
                      </a>
                      <div class="<%=gorruda_div_class %>" id="nl_ecobarier">
                        <ul class="nav flex-column column_nav_sub_sub">
                        
                         <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/nedrousers-gr_icemix">Противогололёдный реагент «АйсМикс»</a>
                          </li>   
                                                 
                          <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/nedrousers-gr_ecobarrier">Пылеподавитель реагент «ЭкоБарьер»</a>
                          </li>
                       
                          
                        </ul>
                      </div>                     
                      
                   </li>
                  
                  
                  
                                          
                    </ul>
                  </div>   <!-- div collapse show  -->
              </li>
              
              
              
            
              
              
              
              
              
              
              
              
              

            </ul>
   </div>               <!-- div col-sm-6 col-lg-4  -->


<!-- End Left-menu -->
          <div class="col-sm-12 col-lg-8 mb-2">
          
           
           
           
            <h1><%=product.getPage_title() %></h1>

            <p class="page_text">
             <%=product.getPage_info() %>
            </p>

       
          </div>
        </div> <!-- row -->
      </div>  <!-- main content -->

      <!-- Footer -->
         <jsp:include page="includes/footer.jsp" />
    