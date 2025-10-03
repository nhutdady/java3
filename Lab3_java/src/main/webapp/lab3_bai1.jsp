<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="lab3_bai1">Bài1</a> ||
<a href="lab3_bai2">Bài2</a> ||
<a href="lab3_bai3">Bài3</a> ||
<a href="lab3_bai4">Bài4</a> ||
<hr/>

<select name="country"> 
  <c:forEach var="ct" items="${countries}"> 
    <option value="${ct.id}">${ct.name}</option> 
  </c:forEach>
</select>

</body>
</html>
