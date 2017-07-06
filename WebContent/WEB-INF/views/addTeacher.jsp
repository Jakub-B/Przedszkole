<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@	taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" modelAttribute="teacher">
		<p>Dodawanie nauczyciela</p>
		Login: <form:input path="login" />
		<br>
		<form:errors path="login" />
		
		Hasło: <form:input path="password" />
		<br>
		<form:errors path="password" />
		
		firstName: <form:input path="firstName" />
		<br>
		<form:errors path="firstName" />
		
		lastName: <form:input path="lastName" />
		<br>
		<form:errors path="lastName" />
		
		email: <form:input path="email" />
		<br>
		<form:errors path="email" />
		phoneNumber: <form:input path="phoneNumber" />
		<br>
		<form:errors path="phoneNumber" />
		
		secondPhoneNumber: <form:input path="secondPhoneNumber" />
		<br>
		<form:errors path="secondPhoneNumber" />
		
		
		<input type="submit" value="Dodaj">
	</form:form>
</body>
</html>