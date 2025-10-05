<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    // Gán nội dung cần hiển thị vào layout.jsp
    request.setAttribute("content", "home-content.jsp");
%>
<jsp:include page="layout.jsp" />
