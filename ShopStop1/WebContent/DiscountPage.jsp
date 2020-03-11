<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#ffffff">
  
  <h1>welcome to shopstop</h1>
  <jsp:useBean id="bean" scope="page" class="com.niit.beans.DiscountBean">
  <jsp:setProperty name="bean" property="totalamt" param="txtamount" />
  Discount on total purchase is:Rs<jsp:getProperty name="bean" property="totalamt"/>
  </jsp:useBean>
  

</body>
</html>