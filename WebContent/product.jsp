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

<!-- Left-menu -->


     <div class="col-sm-6 col-lg-4">
            <ul class="nav flex-column column_nav">
              <li class="nav-item">
          <a class="nav-link" data-bs-toggle="collapse" href="#about_company" role="button" aria-expanded="true" aria-controls="collapseExample" href="#">Решения и продукты</a>
              <div class="collapse show" id="about_company">
                    <ul class="nav flex-column column_nav_sub">
                    
                  <li class="nav-item">
                  
                      <a class="nav-link collapsed" data-bs-toggle="collapse" href="#nl_icemix" role="button" aria-expanded="false" aria-controls="nl_icemix">
                      Противогололёдный реагент «АйсМикс»
                      </a>  
                      
                      <div class="collapse" id="nl_icemix">
                        <ul class="nav flex-column column_nav_sub_sub">
                        
                         <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/product-icemix_about">О продукте</a>
                          </li>                          
                          <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/product-icemix_using">Назначение и применение</a>
                          </li>
                          <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/product-icemix_action">Действие</a>
                          </li>                          
                           <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/product-icemix_super">Преимущества</a>
                          </li>                          
                           <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/product-icemix_table">Сравнительная таблица противогололёдных реагентов</a>
                          </li>
                           <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/product-icemix_security">Экологичность и безопасность</a>
                          </li>
                           <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/product-icemix_activity">Показатели активности</a>
                          </li>
                           <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/product-icemix_reagent">Расход и концентрация реагента</a>
                          </li>
                           <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/product-icemux_opyt">Опытно-промышленные испытания</a>
                          </li>
                           <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/product-icemix_ntd">Инструкция и НТД</a>
                          </li>
                           <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/product-icemix_document">Документация</a>
                          </li>
                          
                           <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/product-icemix_line">Линейка реагентов «ICEMIX» (АЙСМИКС)</a>
                          </li> 
                          
                        </ul>
                      </div>
                      
                      
                   </li>
                   
                   
                  <li class="nav-item">                  
                      <a class="nav-link collapsed" data-bs-toggle="collapse" href="#nl_ecobarier" role="button" aria-expanded="false" aria-controls="nl_ecobarier">
                      Пылеподавитель реагент «ЭкоБарьер»
                      </a>
                      <div class="collapse" id="nl_ecobarier">
                        <ul class="nav flex-column column_nav_sub_sub">
                        
                          <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/product-ecobarrier_about">О продукте</a>
                          </li>                        
                          <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/product-ecobarrier_forwhat">Назначение и применение</a>
                          </li>
                          <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/product-ecobarrier_using">Использование</a>
                          </li>                          
                           <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/product-ecobarrier_super">Преимущества</a>
                          </li>                          
                           <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/product-ecobarrier_road">Промышленные площадки и дороги</a>
                          </li>
                           <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/product-ecobarrier_experience">Опытно-промышленные испытания</a>
                          </li>
                           <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/product-ecobarrier_ntd">Инструкция и НТД</a>
                          </li>
                           <li class="nav-item">
                              <a class="nav-link" href="<%=request.getContextPath()%>/product-ecobarrier_document">Документация</a>
                          </li>
                          
                        </ul>
                      </div>                     
                      
                   </li>
                   
                   
                        <li class="nav-item">
                          <a class="nav-link" href="<%=request.getContextPath()%>/product-mineraly">Минеральные удобрения</a>
                        </li>
                        <li class="nav-item">
                          <a class="nav-link" href="<%=request.getContextPath()%>/product-mafy">Малые Архитектурные Формы (МАФы)</a>
                        </li>
                        <li class="nav-item">
                          <a class="nav-link" href="<%=request.getContextPath()%>/product-gerony">Герон +</a>
                        </li>
                        
                        <li class="nav-item">
                            <a class="nav-link" href="<%=request.getContextPath()%>/product-watermazut">Водомазутная эмульсия</a>
                        </li>
                        
                    </ul>
                  </div>   <!-- div collapse show  -->
              </li>

            </ul>
   </div>               <!-- div col-sm-6 col-lg-4  -->


<!-- End Left-menu -->
          <div class="col-sm-12 col-lg-8 mb-2">
          
           
           
           
              <% 
              Page company = new Page();
        		  company = (Page)request.getAttribute("productinfo");   
           %>
            <h1><%=company.getPage_title() %></h1>

            <p class="page_text">
             <%=company.getPage_info() %>
            </p>

       
          </div>
        </div> <!-- row -->
      </div>  <!-- main content -->

      <!-- Footer -->
         <jsp:include page="includes/footer.jsp" />
    