<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <a href="lab3bai1">Bài 1</a> ||
    <a href="lab3bai2">Bài 2</a> ||
    <a href="lab3bai3">Bài 3</a> ||
    <a href="lab3bai4">Bài 4</a>
    
    <hr>
    <li>Title: ${fn:toUpperCase(item.title)}</li>
    <li>
        Content: 
        <c:choose>
            <c:when test="${fn:length(item.content) > 100}">
                ${fn:substring(item.content, 0, 100)} ...
            </c:when>
            <c:otherwise>
                ${item.content}
            </c:otherwise>
        </c:choose>
    </li>
</body>
</html>