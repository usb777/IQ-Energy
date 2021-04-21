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
            
   <form class="modal-content animate" action="UsersServlet" method="post" onSubmit="return validate()">
    <div class="imgcontainer">
      <span onclick="document.getElementById('idLoginForm').style.display='none'" class="closeModalBtn" title="Close Modal">&times;</span>      
    </div>

    <div class="containerModal">
      <label for="uname"><b>Username</b></label><br>
      <input class="inputText" type="text" placeholder="Enter Username" name="login"  id="login-text" required><br>

      <label for="psw"><b>Password</b></label><br>
      <input  class="inputText" type="password" placeholder="Enter Password" name="password" id="password-text" required>
        <br>
      <button type="submit" class="button login_button">Login</button>
      <label>
        <input type="checkbox" checked="checked" name="remember"> Remember me
      </label>
       <label>Don't have an account yet? <a href="register.jsp">Sign Up</a> </label>
    </div>

    <div class="containerModal" style="background-color:#f1f1f1">
      <button type="button" onclick="document.getElementById('idLoginForm').style.display='none'" class="cancelbtn">Cancel</button>
      <span class="psw">Forgot <a href="#" class="forgot">password?</a></span>
    </div>
  </form>   
     
              
            </p>

            <!-- 3 section -->
      
            <!-- /3 section -->

          </div>
        </div> <!-- row -->
      </div>  <!-- main content -->

      <!-- Footer -->
         <jsp:include page="includes/footer.jsp" />
    