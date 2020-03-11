<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String Name=(String)pageContext.getAttribute("hello",PageContext.SESSION_SCOPE);
String fullName= (String) pageContext.getAttribute("fullName");
out.println("hai "+Name+ " ");
out.println("this is ur fullname:" +fullName);
%>
</body>
</html>