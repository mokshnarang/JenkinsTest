<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:forward page="display.jsp">
<jsp:param value="raj" name="name"/>
<jsp:param value="Quinnox" name="company"/>
<jsp:param value="jsp forward action" name="technology"/>
<jsp:param value="fwdDemo1.jsp" name="reqform"/>
</jsp:forward>
</body>
</html>