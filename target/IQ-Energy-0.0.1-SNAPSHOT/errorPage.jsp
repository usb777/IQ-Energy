<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
  <jsp:include page="includes/header.jsp" />

      <!-- main content -->
      <div class="main_content">

        <div class="row">

<!-- Left-menu -->
<jsp:include page="includes/left-menu.jsp" />
<!-- End Left-menu -->
          <div class="col-sm-12 col-lg-8 mb-2">
          
          
          
          
          
          
          
          
          
          JVM Version: <%=System.getProperty("java.vm.version") %>  <br>
Java Version: <%=System.getProperty("java.version") %>  <br>
Server Version: <%= application.getServerInfo() %><br>
Servlet Version: <%= application.getMajorVersion() %>.<%= application.getMinorVersion() %> <br>
JSP Version: <%= JspFactory.getDefaultFactory().getEngineInfo().getSpecificationVersion() %> <br>	
					<br><br>
					<!-- TABLE of ERRORS -->
					<div class="row">
					
					  <div class="col-3 col-s-3 errorPage"><b>Error:</b></div>
                     <div class="col-9 errorPage">${pageContext.exception}</div>	
                     
                     
                       <div class="col-3 col-s-3 errorPage"><b>URI:</b></div>
                      <div class="col-9 errorPage">${pageContext.errorData.requestURI}</div>
                      
                       <div class="col-3 col-s-3 "><b>Status code:</b></div>
                      <div class="col-9 ">${pageContext.errorData.statusCode}</div>
									
					 <div class="col-12 errorPage">
                         <b>Stack trace:</b>
                     </div>
					
					<div class="col-12 errorPage">
                         
                           <c:forEach var = "trace" 
                              items = "${pageContext.exception.stackTrace}">
                            <p>${trace}</p>
                           </c:forEach>
                          
                     </div>
                     
					</div> <!-- Row  -->
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
         
             

          </div>   <!-- class="col-sm-12 col-lg-8 mb-2   -->
        </div> <!-- row -->
      </div>  <!-- main content -->

      <!-- Footer -->
         <jsp:include page="includes/footer.jsp" />
    