<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register</title>
<link rel="stylesheet"href="css/style.css">
</head>
<body class="body">
<h4>Register here</h4>

<!-- Success Message -->
<c:if test="${not empty successMess}">
    <h4 style="color:green">${successMess}</h4>
</c:if>

<!-- Error Message -->
<c:if test="${not empty errMess}">
    <h4 style="color:red">${errMess}</h4>
</c:if>

<form action="regform" method="post">

Name :<input type="text" name="name"/><br><br>
Email :<input type="text" name="email"/><br><br>
Password :<input type="password" name="password"/><br><br>
Phone :<input type="text" name="phoneno"/><br><br>
<input type="submit"value="register"><br><br>

</form>
</body>
</html>