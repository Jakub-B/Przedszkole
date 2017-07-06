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
<body>
	<table>
		<tr>
			<th>First Name</th>
			<th>Second Name</th>
			<th>Teacher</th>
			
			<th>Edit</th>
			<th>Delete</th>

		</tr>

		<c:forEach items="${childrens}" var="child">
			<tr>
				<td>${child.firstName }</td>
				<td>${child.lastName }</td>
				<td>${child.teacher.lastName}</td>
				
				<td><a href="">Edytuj</a></td>
				<td><a href="http://localhost:8080/JEE_Exam_6/children/delete/${child.id}">Usuń</a></td>
				
			</tr>
		</c:forEach>
	</table>
	+
</body>
</body>
</html>