<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Displaying the record of table</title>
 <%@page import="java.sql.*"%>
</head>
<body>

    <%
    try
    {
    	Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://192.168.252.218:3306/test","root","root");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from register;");
    %>
    <table border=1 align=center style="text-align:center">
      <thead>
          <tr>
             <th>name</th>
             <th>email</th>
             <th>pass</th>
             
          </tr>
      </thead>
      <tbody>
        <%while(rs.next())
        {
            %>
            <tr>
                <td><%=rs.getString(1) %></td>
                <td><%=rs.getString(2) %></td>
                <td><%=rs.getString(3) %></td>
               
            </tr>
            <%}%> 
           </tbody>
        </table><br>
    <%
    }

    catch(Exception e){
        out.print(e.getMessage());%><br><%
    }

    %>
</body>
</html>