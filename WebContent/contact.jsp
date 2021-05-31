<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
  <jsp:include page="includes/header.jsp" />

      <!-- main content -->
      <div class="main_content">

        <div class="row">

<!-- Left-menu -->
<jsp:include page="includes/left-menu.jsp" />
<!-- End Left-menu -->
          <div class="col-sm-12 col-lg-8 mb-2">
            <h1>О компании</h1>

          
            
     
    
      <div class="container">
 

  <!-- Columns start at 50% wide on mobile and bump up to 33.3% wide on desktop -->
  <div class="row">

			
					<div class="post">
						<h2 class="title-post">Contact Us </h2>
						<span style="color:red">
			<%=(request.getAttribute("errMessage") == null) ? "": request.getAttribute("errMessage")%>
			</span>
			<span style="color:green">
			<%=(request.getAttribute("contactOk") == null) ? "": request.getAttribute("contactOk")%>
			</span>
						<p>  email: <a href="mailto:support@advicenyc.com">support@advicenyc.com</a> </p>
						
						  <form action="ContactServlet" method="post" onsubmit="return validate()">
						  
						<div>			
		<input type="text" name="subject" id="input-text" value="" placeholder="subject" /> <br/><br/>
		<input type="text" name="email" id="input-text" value="" placeholder="email" /> <br/><br/>
		
		<div  class="comment">
		<textarea name="message" id="textarea" class="contactTextArea" placeholder="enter your message..."></textarea>
		</div>
		<br/>
		<input type="submit" id="login-submit" value="Submit" />	<br/>
										
<button class="button register_button" id="">Submit</button>
                       </div>
                       
								</form>
						
					</div>   <!-- div post -->

   
  </div> <!--  row -->


</div>


<!--LAST  -->


            <!-- 3 section -->
      
            <!-- /3 section -->

          </div>
        </div> <!-- row -->
      </div>  <!-- main content -->

      <!-- Footer -->
         <jsp:include page="includes/footer.jsp" />
    
    
    