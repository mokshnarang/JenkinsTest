<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

My name is: <%= request.getParameter("name")%><br>
Web site:<%= request.getParameter("company")%><br>
Topic:<%= request.getParameter("technology")%> <br>
forward request came from the page: <%= request.getParameter("reqform")%> 

</body>
</html>