<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<jsp:useBean id="BeanId" class="com.niit.beans.SimpleBean" scope="application"/>
<jsp:setProperty property="name" name="BeanId" value="Andrew"/>
<jsp:setProperty property="age" name="BeanId" value="25"/>


</head>
<body>
Name is:<jsp:getProperty property="name" name="BeanId"/>
Age is:<jsp:getProperty property="age" name="BeanId"/>
</body>
</html>