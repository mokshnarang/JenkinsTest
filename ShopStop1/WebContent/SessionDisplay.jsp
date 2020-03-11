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
    Implicit  objects
 
</h1>
<%
out.println("sesssion id:"+session.getAttribute("sessionid")+"<br/>");
out.println("sesssion id:"+session.getAttribute("locale")+"<br/>");
out.println("sesssion id:"+session.getAttribute("user")+"<br/>");
%>

<a href="Session1.jsp">Session Scope</a>

</body>
</html>