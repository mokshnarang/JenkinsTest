<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Expression Language Examples</title>
        <%
        pageContext.setAttribute("pageColor", "#ffffcc");
        %>
    </head>
    <body bgcolor="${pageScope.pageColor}">
        <h1>Welcome to the Shop Stop</h1>
        Here are some basic comparisons:
        <p>
        Is 1 less than 2? ${1<2} <br>
        Does 5 equals 5? ${5==5} <br>
        Is 6 greater than 7? ${6 gt 7}<br>
        <p>Now for some math:<br>
        6 + 7 = ${6+7}<br>
        8 x 9 = ${8*9}<br>
        <hr>You appear to be using the following browser:
${header["user-agent"]}
    </body>
</html>
