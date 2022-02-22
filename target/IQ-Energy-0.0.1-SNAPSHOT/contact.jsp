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
						<h2 class="title-post">Наши контакты </h2>
						
						<p>тел:<b> +7-777-781-2999</b> </p>
						<p>тел:<b> +7-775-822-0058</b> </p>
						<p>тел:<b> +7-771-557-1515</b> </p>						
						
						<span style="color:red">
			<%=(request.getAttribute("errMessage") == null) ? "": request.getAttribute("errMessage")%>
			</span>
			<span style="color:green">
			<%=(request.getAttribute("contactOk") == null) ? "": request.getAttribute("contactOk")%>
			</span>
						<p>  e-mail: <a href="mailto:support@advicenyc.com">support@advicenyc.com</a> </p>
						
						  <form action="ContactServlet" method="post" onsubmit="return validate()">
						  
						<div class="col-6 col-md-6">		
		<label for="subject"><b>Тема сообщения</b></label>				
		<input type="text" class="form-control" name="subject" id="input-text" value="" placeholder="subject" />
		<label for="email"><b>e-mail:</b></label><br>	
		<input type="text" class="form-control" name="email" id="email" value="" placeholder="email" />
		
		<div  class="comment">
		<label for="message"><b>Сообщение</b></label><br>	
		<textarea class="form-control" name="message" id="textarea" rows="10" class="contactTextArea" placeholder="enter your message..."></textarea>
		</div>
		<br/>
		
		<button type="submit" class="btn btn-primary mb-3">Отправить</button>	
                       </div>  <!-- <div class="col-7 col-md-5">	 -->
                       
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
    
    
    