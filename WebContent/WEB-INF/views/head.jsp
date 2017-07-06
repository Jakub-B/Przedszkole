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
	<div style="width: 400px" class="headerPlaySchool">
		<div style="float: left" class="logbutton">Przedszkole Kredka</div>
		<div style="float: right" class="logbutton">
			<a href="/JEE_Exam_6/logout">wyloguj</a>


		</div>
		<div style="clear: both"></div>
	</div>

	<div class="content">
		<a href="http://localhost:8080/JEE_Exam_6/teacher/listChildren">Lista
			wszystkich dzieci</a><br> 
		<a href="http://localhost:8080/JEE_Exam_6/children/add">Dodaj dziecko</a>
		<a href="http://localhost:8080/JEE_Exam_6/teacher/add">Dodaj nauczyciela</a>	
	</div>
</body>
</html>