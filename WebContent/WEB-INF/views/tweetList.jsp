<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
	<tr>
		<th>TITLE</th>
		<th>TEXT</th>
		<th>CREATED</th>
		<th>FIRST NAME</th>
		<th>LAST NAME</th>
		
	</tr>

		<c:forEach items="${tweets}" var="tweet">
		<tr>
			<td>${tweet.title }</td>
			<td>${tweet.text }</td>
			<td>${tweet.created }</td>
			<td>${tweet.user.firstName }</td>
			<td>${tweet.user.lastName }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>