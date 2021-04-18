<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ page import = "java.io.*,java.util.*, javax.servlet.*" %>
<%@page import="com.iqenergy.DAO.*"%>
<%@ page import="com.iqenergy.model.*" %>
<%@ page import="com.iqenergy.controller.*" %>
<%@ page import ="com.iqenergy.util.ServerHelper" %>

        <div class="col-lg-12">
                    <nav class="navbar navbar-expand-lg navbar-light">
                      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                      </button>
                      
                   <% 
                   
                   
                       MenuDAO  menuDao = new MenuDAO();
                   			List<Menu> topMenus = menuDao.getMenuByGroup1("top_menu") ;
                     %>   

                      <!-- nav -->
                      <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        
                        
                        <% 
                        
                        for (Menu menus:topMenus )
                        
                        {
                        %>
                        <li class="nav-item">
                            <a class="nav-link active" href="<%=request.getContextPath()%>/v/ru/<%=menus.getPage_group() %>/">  <%=menus.getMenu_name() %>    </a>
                         </li>
                          
                          <% 
                        }
                          %>
                          
                        
                        <!-- 
                          <li class="nav-item">
                            <a class="nav-link active" href="<%=request.getContextPath()%>/v/ru/products/">о компании</a>
                          </li>
                          <li class="nav-item">
                            <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/products/38">решения и продукты</a>
                          </li>
                          <li class="nav-item">
                            <a class="nav-link" href="<%=request.getContextPath()%>/ecology">Экология</a>
                          </li>
                           -->
                          
                          

                          <!-- right nav for show on mobile -->
                          <li class="nav-item d-block d-sm-none">
                            <a class="nav-link" href="#">Hедропользователи</a>
                          </li>
                          <li class="nav-item d-block d-sm-none">
                            <a class="nav-link" href="#">ЖКХ</a>
                          </li>
                          <li class="nav-item d-block d-sm-none">
                            <a class="nav-link" href="#">ТЭК</a>
                          </li>
                          <li class="nav-item d-block d-sm-none">
                            <a class="nav-link" href="#">АПК</a>
                          </li>
                          <li class="nav-item d-block d-sm-none">
                            <a class="nav-link" href="#">ГПС</a>
                          </li>
                          <!-- /right nav for show on mobile -->

                        </ul>

                        <!-- Search -->
                        <form class="d-flex">
                          <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                          <button class="btn btn-outline-success" type="submit">Search</button>
                        </form>

                      </div>
                    </nav>
                  </div>   