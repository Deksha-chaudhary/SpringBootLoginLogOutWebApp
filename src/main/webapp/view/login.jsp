<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"href="css/style.css">

</head>
<body class="body">

<c:if test="${not empty errMess}">
    <h4 style="color:red">${errMess}</h4>
</c:if>

<form action="logform" method="post">

Email :<input type="text" name="email"/><br><br>
Password :<input type="password" name="password"/><br><br>
<input type="submit"value=login><br><br>

if not register----<a href='regpage'>register-here</a>
</form>

</body>
</html>