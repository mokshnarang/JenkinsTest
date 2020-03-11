<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
   Creating Session
</h1>

       <%
       session.setAttribute("sessionid", session.getId());
       session.setAttribute("locale", response.getLocale());
       session.setAttribute("user", "raj");
       response.sendRedirect("SessionDisplay.jsp");
       %>
</body>
</html>