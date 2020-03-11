<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="false" errorPage="Error.jsp" autoFlush="true" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Directives Example</title>
</head>
<body>

     <%
      int i=20;
      int j=20/0;
      out.println(j);
     %>

</body>
</html>