<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@	taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<body>

	<form:form method="post" modelAttribute="user">
	<p>User Creation Form</p>
		First Name: <form:input path="firstName"/><br> 
		<form:errors path="firstName" />
		Last Name: <form:textarea path="lastName"/><br> 
		<form:errors path="lastName" />
		email: <form:input	path="email"/><br>
		<form:errors path="email" />
		<input type="submit" value="Submit">
	</form:form>


</body>

</html>