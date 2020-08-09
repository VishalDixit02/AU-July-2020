<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Page</title>
</head>
<body>
<form action="/springMvc/add" method="post">
<h1>Enter the details of the student</h1>
<input placeholder="Enter ID" type="text" required="true"><br>
<input placeholder="Enter first name" type="text" required="true"><br>
<input placeholder="Enter lname" type="text" required="true"><br>
<input placeholder="Enter dept name" type="text" required="true"><br>
<input type="submit" value="add">
<input type="submit" value="update">
<input type="submit" value="delete"> 
</form>
</body>
</html>