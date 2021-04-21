<%
com.iqenergy.util.ServerHelper serverHelper = new com.iqenergy.util.ServerHelper();
String REAL_SERVER_HOST = serverHelper.getRealServerPath(request);

// Full destroying session
session.setAttribute("username", null);
session.invalidate();
System.out.println("<h3>You're session has been terminated.</h3><p>  Make sure that you close the browser to ensure no personal data is "
+"kept on the computer.<br><br>");

System.out.println("Session Destroy!");

//redirect to main page on front-end
response.sendRedirect(REAL_SERVER_HOST+"/index.jsp");

%>