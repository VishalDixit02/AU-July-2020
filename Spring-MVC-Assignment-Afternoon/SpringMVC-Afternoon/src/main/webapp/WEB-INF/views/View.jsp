<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View result</title>
</head>
<body>
<h2>List Of All The Students</h2>

 <c:forEach var="student" items="${list}">   
          	<tr> <td>${student.id }</td> 
          	<td>${student.firstname }</td>
          	<td>${student.lastname }</td>
          	<td>${student.dept }</td>
          	   </tr>
          </c:forEach>   
</body>
</html>