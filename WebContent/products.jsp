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

<!-- Left-menu -->


     <div class="col-sm-6 col-lg-4">
            <ul class="nav flex-column column_nav">
              <li class="nav-item">
          <a class="nav-link" data-bs-toggle="collapse" href="#about_company" role="button" aria-expanded="true" aria-controls="collapseExample" href="#">Решения и продукты</a>
              <div class="collapse show" id="about_company">
                    <ul class="nav flex-column column_nav_sub">
                    
                  <li class="nav-item">
                  
                      <a class="<%=icemix_a_class %>" data-bs-toggle="collapse" href="#nl_icemix" role="button" aria-expanded="<%=icemix_aria_expanded %>" aria-controls="nl_icemix">
                      Противогололёдный реагент «АйсМикс»
                      </a>  
                      
                      <div class="<%=icemix_div_class %>" id="nl_icemix">
                        <ul class="nav flex-column column_nav_sub_sub">
                        
                         <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/30">О продукте</a>
                          </li>                          
                          <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/19">Назначение и применение</a>
                          </li>
                          <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/20">Действие</a>
                          </li>                          
                           <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/21">Преимущества</a>
                          </li>                          
                           <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/22">Сравнительная таблица противогололёдных реагентов</a>
                          </li>
                           <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/23">Экологичность и безопасность</a>
                          </li>
                           <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/24">Показатели активности</a>
                          </li>
                           <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/25">Расход и концентрация реагента</a>
                          </li>
                           <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/26">Опытно-промышленные испытания</a>
                          </li>
                           <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/27">Инструкция и НТД</a>
                          </li>
                           <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/28">Документация</a>
                          </li>
                          
                           <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/29">Линейка реагентов «ICEMIX» (АЙСМИКС)</a>
                          </li> 
                          
                        </ul>
                      </div>
                      
                      
                   </li>
              
              <% 
              //  Not collapsed Mechanizm
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
                   
                   
                  <li class="nav-item">                  
                      <a class="<%=ecobarrier_a_class %>" data-bs-toggle="collapse" href="#nl_ecobarier" role="button" aria-expanded="<%=ecobarrier_aria_expanded %>" aria-controls="nl_ecobarier">
                      Пылеподавитель реагент «ЭкоБарьер»
                      </a>
                      <div class="<%=ecobarrier_div_class %>" id="nl_ecobarier">
                        <ul class="nav flex-column column_nav_sub_sub">
                        
                          <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/31">О продукте</a>
                          </li>                        
                          <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/32">Назначение и применение</a>
                          </li>
                          <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/33">Использование</a>
                          </li>                          
                           <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/34">Преимущества</a>
                          </li>                          
                           <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/35">Промышленные площадки и дороги</a>
                          </li>
                           <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/36">Опытно-промышленные испытания</a>
                          </li>
                           <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/37">Инструкция и НТД</a>
                          </li>
                           <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/38">Документация</a>
                          </li>
                          
                        </ul>
                      </div>                     
                      
                   </li>
                   
                   
                        <li class="nav-item">
                          <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/10">Минеральные удобрения</a>
                        </li>
                        <li class="nav-item">
                          <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/11">Малые Архитектурные Формы (МАФы)</a>
                        </li>
                        <li class="nav-item">
                          <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/12">Герон +</a>
                        </li>
                        
                        <li class="nav-item">
                            <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/13">Водомазутная эмульсия</a>
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
    