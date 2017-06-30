<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@	taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<body>

	<form:form method="post" modelAttribute="tweet">
	<p>Tweet Creation Form</p>
		Title: <form:input path="title"/><br> 
		<form:errors path="title" />
		Last Name: <form:textarea path="text"/><br> 
		<form:errors path="text" />
		User: <form:select path="user.id" items="${users}" itemLabel="lastName" itemValue="id"/><br>
		<form:errors path="user.id" />
		<input type="submit" value="Submit">
	</form:form>


</body>

</html>