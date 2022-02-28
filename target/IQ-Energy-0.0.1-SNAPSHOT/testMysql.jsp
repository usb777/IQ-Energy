<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 
<html> 
<head> 
<title>Connection with mysql database</title>
</head> 
<body>
<h1>Connection status</h1>



<%

try {
            String connectionURL = "jdbc:mysql://mysql3000.mochahost.com/usb777_advicenyc";
            Connection connection = null; 
			
			Statement statement = null;
            ResultSet rs = null;
			
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); 
            connection = DriverManager.getConnection(connectionURL, "usb777_admin", "Fight160583dsoregon");
            if(!connection.isClosed())
			{  out.println("Successfully connected to " + "MySQL server using TCP/IP...");
			 
			 statement = connection.createStatement();
             rs = statement.executeQuery("SELECT * FROM first");
              out.println("<table border='1'> <th><b>ID</b></th><th><b>First name</b></th><th><b>Last Name</b></th>");
			  while (rs.next())
	          { 
		        out.println("<tr>");
                
				out.print("<td>"+rs.getString("id")+"</td>");
				out.print("<td>"+rs.getString("firstname")+"</td>");
				out.print("<td>"+rs.getString("lastname")+"</td>");
				
				out.println("</tr>");
              } //while
			  out.println("</table>");
                  rs.close();
			} // if 
			 
			 
                connection.close();
        }catch(Exception ex)
		{
            out.println("Unable to connect to database"+ex);
        }



%> 



</font>
</body> 
</html>