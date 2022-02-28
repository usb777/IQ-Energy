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
              
             List<Page> listIcemixes = (List<Page>)request.getAttribute("menu_icemix"); 
            
              List<Page> listEcobarriers = (List<Page>)request.getAttribute("menu_ecobarrier"); 
              
              String menuTitle="";
           	 if ( session.getAttribute("menuTitle")!=null )  { menuTitle = (String)session.getAttribute("menuTitle");}
           	 
          //    out.println(listIcemixes);
           //   out.println(listEcobarriers);
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

<!-- Left-menu -->


          <div class="col-sm-6 col-lg-4">
            <ul class="nav flex-column column_nav">
				

              <li class="nav-item">
                  <a class="nav-link" data-bs-toggle="collapse" href="#nl_solutions_products" role="button" aria-expanded="true" aria-controls="nl_solutions_products"> Решения для недропользователей  </a>
                  <div class="collapse show" id="nl_solutions_products">
                  <ul class="nav flex-column column_nav_sub">
					  
					  
					                 
					<!-// Level2 //--> 
					
     
					  
                    <li class="nav-item">
                      <a class="nav-link collapsed" data-bs-toggle="collapse" href="#nl_solutions_neftgaz" role="button" aria-expanded="false" 
                      aria-controls="nl_solutions_neftgaz">Решения для нефтегазовой сферы </a>
                      <div class="collapse" id="nl_solutions_neftgaz">
                        <ul class="nav flex-column column_nav_sub_sub">
                          <li class="nav-item">
                          
                       
                            <a class="<%=icemix_a_class %>" data-bs-toggle="collapse" href="#nl_protivogololednyi_reagent" role="button" aria-expanded="<%=icemix_aria_expanded %>" 
                            aria-controls="nl_protivogololednyi_reagent">Противогололёдный реагент «АйсМикс»</a>
						    <div class="<%=icemix_div_class  %>" id="nl_protivogololednyi_reagent">
								
								
                    <ul class="nav flex-column column_nav_sub_sub_sub">
                    
                    <%                 
                     for(Page icemixes: listIcemixes)
                      {                    
                    %>
                          <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/nedrousers/<%=icemixes.getPage_id() %>#begin"><%=icemixes.getPage_title() %></a>
                          </li>                          
                    <%
                     }
                    %>   
                    
                    
                          
                          
						
                       </ul>
								
                            </div>
							  
							  
                          </li>
                          
                          
                          <li class="nav-item">
                          
            	  
            	  
            	  
            	  
                              <a class="<%=ecobarrier_a_class %>" data-bs-toggle="collapse" href="#nl_protivogololednyi_ecobarier" role="button" aria-expanded="<%=ecobarrier_aria_expanded %>" aria-controls="nl_protivogololednyi_ecobarier">Пылеподавитель реагент «ЭкоБарьер»</a>
                              <div class="<%=ecobarrier_div_class  %>" id="nl_protivogololednyi_ecobarier">
                                <ul class="nav flex-column column_nav_sub_sub_sub">
                                
                                
                                  <%                 
                     for(Page ecobarriers: listEcobarriers )
                      {                    
                    %>
                          <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/nedrousers/<%=ecobarriers.getPage_id() %>#begin"><%=ecobarriers.getPage_title() %></a>
                          </li>                          
                    <%
                     }
                    %> 			
                                </ul>
                              </div>
                          </li>
                        </ul>
                      </div>
                    </li>
					  
					<!-// Level2 //-->    
				<li class="nav-item">
                      <a class="nav-link collapsed" data-bs-toggle="collapse" href="#nl_solutions_gorrud" role="button" aria-expanded="false"
                       aria-controls="nl_solutions_gorrud">Решения для горно-рудной отрасли </a>
                      <div class="collapse" id="nl_solutions_gorrud">
                        <ul class="nav flex-column column_nav_sub_sub">
                          <li class="nav-item">
                          
                          
               
                   
                   
                   
                            <a class="<%=icemix_a_class %>" data-bs-toggle="collapse" href="#nl_protivogololednyi_reagent1" role="button" aria-expanded="<%=icemix_aria_expanded %>" 
                            aria-controls="nl_protivogololednyi_reagent1">Противогололёдный реагент «АйсМикс»</a>							  
                            <div class="<%=icemix_div_class  %>" id="nl_protivogololednyi_reagent1">
								
								
                    <ul class="nav flex-column column_nav_sub_sub_sub">
                                   
                              
                    <%                 
                     for(Page icemixes: listIcemixes)
                      {                    
                    %>
                          <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/nedrousers/<%=icemixes.getPage_id() %>#begin"><%=icemixes.getPage_title() %></a>
                          </li>                          
                    <%
                     }
                    %>             
                            
                       </ul>
								
                            </div>
							  
							  
                          </li>
                          <li class="nav-item">
                          
            	  
            	 
            	  
            	   
                          
                 <a class="<%=ecobarrier_a_class %>" data-bs-toggle="collapse" href="#nl_protivogololednyi_ecobarier2" role="button"   aria-expanded=" <%=ecobarrier_aria_expanded %>"
                  aria-controls="nl_protivogololednyi_ecobarier2">Пылеподавитель реагент «ЭкоБарьер»</a>
                              <div class="<%=ecobarrier_div_class  %>" id="nl_protivogololednyi_ecobarier2">
                                <ul class="nav flex-column column_nav_sub_sub_sub">
									
				   <%                 
                     for(Page ecobarriers: listEcobarriers )
                      {                    
                    %>
                          <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/nedrousers/<%=ecobarriers.getPage_id() %>#begin"><%=ecobarriers.getPage_title() %></a>
                          </li>                          
                    <%
                       }
                    %> 		
						
									
                                </ul>
                              </div>
                          </li>
                        </ul>
                      </div>
                    </li>
					  
					    
					  
					  
					  


					  
					  
                  </ul>
                </div>
              </li>

            </ul>
          </div>

                      <!-- div col-sm-6 col-lg-4  -->


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
    