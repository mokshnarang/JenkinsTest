<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<jsp:useBean id="BeanId" class="com.niit.beans.UserBean" scope="session"/>
<jsp:setProperty property="username" name="BeanId"/>
<jsp:setProperty property="password" name="BeanId"/>
</head>
<%BeanId.getEmailid(); %>
<body>
   <jsp:getProperty property="username" name="BeanId"/><br>
   <jsp:getProperty property="email" name="BeanId"/>

</body>
</html>