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
              product = (Page)request.getAttribute("product");  
              
              
              List<Page> listIcemixes = (List<Page>)request.getAttribute("menu_icemix");               
              List<Page> listEcobarriers = (List<Page>)request.getAttribute("menu_ecobarrier"); 
              List<Page> listMXT = (List<Page>)request.getAttribute("menu_mxt"); 
              
              String menuTitle="";
           	 if ( session.getAttribute("menuTitle")!=null )  { menuTitle = (String)session.getAttribute("menuTitle");}
           	 
           	 
              //  Not collapsed Mechanizm
              String icemix_a_class="nav-link collapsed";
              String icemix_aria_expanded="false";
              String icemix_div_class = "collapse";
              
              if (product.getPage_group().equals("icemix"))  
              {
            	   icemix_a_class="nav-link";
                   icemix_aria_expanded="true";
                   icemix_div_class = "collapse show";  
              }
              
    %>
    
          
              <% 
              //  Not collapsed Mechanizm    Save in Session Variable
              String ecobarrier_a_class="nav-link collapsed";
              String ecobarrier_aria_expanded="false";
              String ecobarrier_div_class = "collapse";
              
              if (product.getPage_group().equals("ecobarrier"))  
              {
            	  ecobarrier_a_class="nav-link";
            	  ecobarrier_aria_expanded="true";
            	  ecobarrier_div_class = "collapse show";  
              } 
              
              %>
              
              
            <% 
              //  Not collapsed Mechanizm    Save in Session Variable
              String mxt_a_class="nav-link collapsed";
              String mxt_aria_expanded="false";
              String mxt_div_class = "collapse";
              
              if (product.getPage_group().equals("mxt"))  
              {
            	  mxt_a_class="nav-link";
            	  mxt_aria_expanded="true";
            	  mxt_div_class = "collapse show";  
              }
                 
             %>
                  

<!-- Left-menu -->

     <div class="col-sm-6 col-lg-4">
            <ul class="nav flex-column column_nav">
              <li class="nav-item">
          <a class="nav-link" data-bs-toggle="collapse" href="#about_company" role="button" aria-expanded="true" aria-controls="collapseExample" href="#"><%=menuTitle %></a>
              <div class="collapse show" id="about_company">
                    <ul class="nav flex-column column_nav_sub">
                    
                  <li class="nav-item">                  
                      <a class="<%=icemix_a_class %>" data-bs-toggle="collapse" href="#nl_icemix" role="button" aria-expanded="<%=icemix_aria_expanded %>" aria-controls="nl_icemix">
                      ?????????????????????????????????? ?????????????? ??????????????????
                      </a>  
                      
                      <div class="<%=icemix_div_class %>" id="nl_icemix">
                        <ul class="nav flex-column column_nav_sub_sub">                        
                        
                        
                   <%                 
                     for(Page icemixes: listIcemixes)
                      {                    
                    %>
                          <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/<%=icemixes.getPage_id() %>#begin"><%=icemixes.getPage_title() %></a>
                          </li>                          
                    <%
                     }
                    %>   
                      
                        </ul>
                      </div>
                      
                      
                   </li>
         
                   
                  <li class="nav-item">                  
                      <a class="<%=ecobarrier_a_class %>" data-bs-toggle="collapse" href="#nl_ecobarier" role="button" aria-expanded="<%=ecobarrier_aria_expanded %>" aria-controls="nl_ecobarier">
                      ???????????????????????????? ?????????????? ??????????????????????
                      </a>
                      <div class="<%=ecobarrier_div_class %>" id="nl_ecobarier">
                        <ul class="nav flex-column column_nav_sub_sub">
                        
                                    
                     <%                 
                   		  for(Page ecobarriers: listEcobarriers )
                      {                    
                   	 %>
                          <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/<%=ecobarriers.getPage_id() %>#begin"><%=ecobarriers.getPage_title() %></a>
                          </li>                          
                    <%
                     }
                    %> 			
                       
                          
                        </ul>
                      </div>                     
                      
                   </li>
                   
                   
                    <li class="nav-item">                  
                      <a class="<%=mxt_a_class %>" data-bs-toggle="collapse" href="#nl_mxt" role="button" aria-expanded="<%=mxt_aria_expanded %>" aria-controls="nl_mxt">
                      ?????????????? ???????????????????????????? ???????? 1.3/1.2??
                      </a>
                      <div class="<%=mxt_div_class %>" id="nl_mxt">
                        <ul class="nav flex-column column_nav_sub_sub">
                        
                                    
                     <%                 
                   		  for(Page mxts: listMXT )
                      {                    
                   	 %>
                          <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/<%=mxts.getPage_id() %>#begin"><%=mxts.getPage_title() %></a>
                          </li>                          
                    <%
                     }
                    %> 			
                       
                          
                        </ul>
                      </div>                     
                      
                   </li>
                   
                   
                   
                   
                   
                        <li class="nav-item">
                          <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/10#begin">?????????????????????? ??????????????????</a>
                        </li>
                        <li class="nav-item">
                          <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/11#begin">?????????? ?????????????????????????? ?????????? (????????)</a>
                        </li>
                        <li class="nav-item">
                          <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/12#begin">?????????? +</a>
                        </li>
                        
                        <li class="nav-item">
                            <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/13#begin">???????????????????????? ????????????????</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/13#begin">???????????????????????? ????????????????1</a>
                        </li>
                        
                    </ul>
                  </div>   <!-- div collapse show  -->
              </li>

            </ul>
   </div>               <!-- div col-sm-6 col-lg-4  -->


<!-- End Left-menu -->
          <div class="col-sm-12 col-lg-8 mb-2">
          
           
           
           
            <h1 id="begin"><%=product.getPage_title() %></h1>

            <p class="page_text">
             <%=product.getPage_info() %>
            </p>

       
          </div>
        </div> <!-- row -->
      </div>  <!-- main content -->

      <!-- Footer -->
         <jsp:include page="includes/footer.jsp" />
    