<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Using EL to acces java bean</h1>
<jsp:useBean id="user" class="com.niit.beans.UserBean" scope="session"/>
<% user.setUsername("sam");
   user.setPassword("mas");
%>

<b>Accesing beans using EL:</b><br>
${'${' }user.username }=${user.username}<br>
${'${' }user.password }=${user.password}<br>

<jsp:useBean id="lst" class="java.util.ArrayList"/>
<% lst.add("Item1");
   lst.add("Item 2");
%>

<br><b>Accesing elements of an array list instance lst using EL</b><br>

${'${' }lst[0] }=${lst[0]}<br>
${'${' }lst[1] }=${lst[1]}<br>

</body>
</html>