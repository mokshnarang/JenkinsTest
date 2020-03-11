<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<jsp:useBean id="st" class="com.niit.beans.Employee"></jsp:useBean>
</head>
<jsp:setProperty property="*" name="st"/>
<body>
<h1>employee details</h1>

Employee id:<jsp:getProperty property="empno" name="st" /><br><br>
Employee Name:<jsp:getProperty property="empname" name="st" /><br><br>
Employee designation:<jsp:getProperty property="desig" name="st" /><br><br>
</body>
</html>