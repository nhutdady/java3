<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    // Gán content để layout.jsp load phần form đăng ký
    request.setAttribute("content", "newsletter-form.jsp");
%>
<jsp:include page="layout.jsp" />
