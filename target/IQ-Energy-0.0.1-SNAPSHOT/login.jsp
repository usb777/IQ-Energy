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

            <p class="page_text">
            
     
    
      <div class="container">
 

  <!-- Columns start at 50% wide on mobile and bump up to 33.3% wide on desktop -->
  <div class="row">
    <span style="color:red"><%=(request.getAttribute("errMessage") == null) ? "": request.getAttribute("errMessage")%></span>    
   <form  action="LoginServlet" method="post" onSubmit="return validate()">
    <div class="col-7 col-md-5">
           <label for="psw"><b>Login</b></label><br>
 			<input type="text" class="form-control" id="login-text" name="login"  placeholder="login">
 		  <br>
 		<label for="psw"><b>Password</b></label><br>
 			<input type="password" class="form-control" name="password" id="password-text" required >
 			<br>  
 	  <label>
           <input type="checkbox" checked="checked" name="remember"> Remember me
      </label>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <span class="psw"><a href="#" class="forgot">Forgot  password?</a></span>
 			 <br> <br>
 			  <div class="col-auto">
                <button type="submit" class="btn btn-primary mb-3">Submit</button>
            </div>
            
          <label>Don't have an account yet? <a href="register.jsp">Sign Up</a> </label>
  			</div>  <!-- col-7 col-md-5  -->
   
   </form>  
   
  </div> <!--  row -->


</div>


<!--LAST  -->



  
              
            </p>

            <!-- 3 section -->
      
            <!-- /3 section -->

          </div>
        </div> <!-- row -->
      </div>  <!-- main content -->

      <!-- Footer -->
         <jsp:include page="includes/footer.jsp" />
    