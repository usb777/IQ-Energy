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
    			
				
	<div class="row">
     <span style="color:red">
			<%=(request.getAttribute("errMessage") == null) ? "": request.getAttribute("errMessage")%>
	 </span>
		<span style="color:green">
			<%=(request.getAttribute("registerOk") == null) ? "": request.getAttribute("registerOk")%>
		</span>
			
			
	 <form action="RegisterServlet" method="post" onsubmit="return validate()">

    <div class="col-7 col-md-5">
           <label for="login-text"><b>Full Name</b></label><br>
            <input type="text" class="form-control" name="fullname" id="login-text" value="" placeholder="Full Name" />  			
 		  <br>
 		<label for="input-email"><b>Email</b></label><br> 		    		    
 			<input type="text" class="form-control" name="email" id="input-email"  placeholder="email" required >		<br>  
 	          
          <label for="input-login"><b>Login</b></label><br> 		    		    
 			<input type="text" class="form-control" name="login" id="input-login"  placeholder="login" required >		<br>
 			
 			<label for="input-password"><b>Password</b></label><br> 		    		    
 			<input type="password" class="form-control" name="password" id="input-password"  placeholder="password" required >		<br>
 			<label for="input-password1"><b>Repeat password</b></label><br> 		    		    
 			<input type="password" class="form-control" name="password1" id="input-password1"  placeholder="password again" required >		<br>
           <div class="col-auto">
                <button type="submit" class="btn btn-primary mb-3">Submit</button>
            </div>
  	</div>  <!-- col-7 col-md-5  -->
   
   </form>  
   
  </div> <!--  row -->
				
			
              
       </p>

            <!-- 3 section -->
            <div class="row">
              <div class="col-sm-4">
                <div class="card text-center mt-2 mb-4">
                  <div class="card-body">
                    <h5 class="card-title"><strong>Товарищество с ограниченной ответственностью "Innovation Qazaqstan Energy"</strong></h5>
                    <div class="card-text">
                    <p class="card_text"> <strong>БИН 1805 4000 7119</br>
                      ИИК (IBAN) № KZ76 9650 3F00 0805 1272</br>
                      филиал АО "ForteBank" г. Нур-Султан</br>
                      БИК (SWIFT) IRTY KZKA </br>
                      РК, 010000, г. Нур-Султан, район Алматы, ул. А. Петрова, д. 18/2, офис 305Б</strong>
                    </p>
                    </div>
                    <div class="card-bot">Телефоны:</div>
                  </div>
                </div>
              </div>

              <div class="col-sm-4">
                <div class="card text-center mt-2 mb-4">
                  <div class="card-body">
                    <h5 class="card-title"><strong>"Innovation Qazaqstan Energy" Жауапкершілігі шектеулі серіктестік</strong></h5>
                    <div class="card-text">
                      <p class="card_text"> <strong>БСН 1805 4000 7119</br>
                      ЖСК (IBAN) № KZ76 9650 3F00 0805 1272</br>
                      "ForteBank" АҚ Нұр-Сұлтан қ. филиалы</br>
                      БСК (SWIFT) IRTY KZKA </br>
                      ҚР, 010000, Нұр-Сұлтан қаласы, Алматы ауданы, А. Петрова көшесі, 18/2 үй, 305Б кеңсе</strong>
                    </p>
                    </div>
                    <div class="card-bot">Телефоны:</div>
                  </div>
                </div>
              </div>

              <div class="col-sm-4">
                <div class="card text-center mt-2 mb-4">
                  <div class="card-body">
                    <h5 class="card-title"><strong>Limited liability partnership "Innovation Qazaqstan Energy"</strong></h5>
                    <div class="card-text">
                        <p class="card_text"> <strong>BIN 1805 4000 7119</br>
                      IIC (IBAN) № KZ76 9650 3F00 0805 1272</br>
                      filial АО "ForteBank" Nur-Sultan</br>
                      BIC (SWIFT) IRTY KZKA </br>
                      18/2 A. Petrova street, Apt. 305Б, Almaty district, Nur-Sultan city, 010000, Kazakhstan</strong>
                    </p>

                    </div>
                    <div class="card-bot">Телефоны:</div>
                  </div>
                </div>
              </div>
            </div>
            <!-- /3 section -->

          </div>
        </div> <!-- row -->
      </div>  <!-- main content -->

      <!-- Footer -->
         <jsp:include page="includes/footer.jsp" />
    