<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import = "java.io.*,java.util.*, javax.servlet.*" %>
<%@page import="com.iqenergy.DAO.*"%>
<%@ page import="com.iqenergy.model.*" %>
<%@ page import="com.iqenergy.controller.*" %>
<%@ page import ="com.iqenergy.util.ServerHelper" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet" type="text/css">
    
   
    <!-- Useful meta tags -->
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="robots" content="index, follow">
    <meta name="google" content="notranslate">
    <meta name="format-detection" content="telephone=no">
    <meta name="description" content="">

    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon">

    <link href="https://fonts.googleapis.com/css2?family=Lobster&display=swap" rel="stylesheet">

    <title>IQ-ENERGY</title>
</head>
<body>

  <!-- Main -->
  <main class="container custom">

      <div class="row">
          <div class="col-sm-12">

              <!-- Header -->
              <header class="header">

                <div class="row">

                  <!-- logo -->
                  <div class="col-lg-1">
                    <div class="logo">
                        <a href="index.html">
                            <img src="<%=request.getContextPath()%>/images/l.png" alt="">
                        </a>
                    </div>
                  </div>
                  <div class="col-lg-11">
                    <!-- social icons & flags -->
                    <div class="col-lg-12">
                      <ul class="list-group list-group-horizontal d-flex justify-content-end social_icons">

                        <!-- flags -->
                        <li class="list-group-item align-self-center d-none d-md-block">
                          <a href="#null"><img src="<%=request.getContextPath()%>/images/flag_kz.png" height="24" alt=""></a>
                        </li>
                        <li class="list-group-item align-self-center d-none d-md-block">
                          <a href="#null"><img src="<%=request.getContextPath()%>/images/flag_ru.png" height="24" alt=""></a>
                        </li>
                        <li class="list-group-item align-self-center d-none d-md-block">
                          <a href="#null"><img src="<%=request.getContextPath()%>/images/flag_gb.png" height="24" alt=""></a>
                        </li>

                        <!-- social icons -->
                        <li class="list-group-item icon">
                            <a href="#null"><img src="<%=request.getContextPath()%>/images/icon_facebook.png" alt=""></a>
                        </li>
                        <li class="list-group-item icon">
                            <a href="#null"><img src="<%=request.getContextPath()%>/images/icon_instagram.png" alt=""></a>
                        </li>
                        <li class="list-group-item icon">
                            <a href="#null"><img src="<%=request.getContextPath()%>/images/icon_youtube.png" alt=""></a>
                        </li>
                      </ul>

                    </div>

          <!--//col-lg-12  top-menu  //-->
          
           <jsp:include page="top-menu.jsp" />
           
          <!--//end col-lg-12  top-menu  //-->

                </div>
              </div>

              </header>

              <!-- carussell information -->
              
        <jsp:include page="carousel-menu.jsp" />
        
                <!-- end carusell information -->

          </div>
      </div>