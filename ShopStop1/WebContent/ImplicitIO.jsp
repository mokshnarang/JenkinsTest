<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Implicit out object</h1>
<%out.println("Today is:"+java.util.Calendar.getInstance().getTime());
int size=out.getBufferSize();
int availsize=out.getRemaining();
int usedsize=size-availsize;
int a=10;
out.write("hello");

%>

<b>Buffer Status</b><br/>
       <b>Total size:</b><%=size %><br/>
       <b>Available size</b><%=availsize %><br/>
       <b>Used size:</b><%=usedsize %><br/><br/>
 <b>Request user agent: </b><%=request.getHeader("User-Agent") %><br/>      
 <b>request user language: </b><%=request.getLocale() %>

</body>
</html>