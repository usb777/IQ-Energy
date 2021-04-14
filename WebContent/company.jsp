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
                  <a class="nav-link" data-bs-toggle="collapse" href="#about_company" role="button" aria-expanded="true" aria-controls="collapseExample" href="#">О компании</a>
                  <div class="collapse show" id="about_company">
                    <ul class="nav flex-column column_nav_sub">
                        
                        <li class="nav-item">
                          <a class="nav-link" href="<%=request.getContextPath()%>/company-dillers">Дилеры и субдилеры</a>
                        </li>
                        <li class="nav-item">
                          <a class="nav-link" href="<%=request.getContextPath()%>/company-partners">Партнеры</a>
                        </li>
                        <li class="nav-item">
                          <a class="nav-link" href="<%=request.getContextPath()%>/company-news">Новости</a>
                        </li>
                        <li class="nav-item">
                          <a class="nav-link" href="<%=request.getContextPath()%>/company-vacancy">Вакансии</a>
                        </li>
                        
                        <li class="nav-item">
                            <a class="nav-link" href="<%=request.getContextPath()%>/company-rekvizit">Реквизиты компании</a>
                        </li>
                        
                    </ul>
                  </div>
              </li>

            </ul>
          </div>


<!-- End Left-menu -->
          <div class="col-sm-12 col-lg-8 mb-2">
          
           
           
           
              <% 
              Page company = new Page();
        		  company = (Page)request.getAttribute("companyinfo");   
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
    