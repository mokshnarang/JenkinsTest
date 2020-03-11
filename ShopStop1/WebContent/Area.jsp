<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
     <h3> calculating area and circumfrence of a circle </h3>
     <hr/>
     <b>Radius of circle:</b> <%=getRadius() %> cm<br/>
      <b>Diameter:</b> <%=getDiameter() %> cm<br/>
       <b>area of circle:</b> <%=getArea() %>cm<sup>2</sup><br/>
        <b>Circumfrence of circle:</b> <%=getCircumference() %><br/>
        </hr>

<body>
   <%!
    double radius=6.0;
   private double getRadius(){
	   return radius;
   }
   
   private double getDiameter(){
	   return (radius*2);
   }
   
   private double getArea(){
	   return (3.1415*radius);
   }
	   
   private double getCircumference(){
	   return (3.1415 * (radius*2));
   }    
   
  
 
   %>


</body>
</html>