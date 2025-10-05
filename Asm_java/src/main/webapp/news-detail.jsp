<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    // Gán file content để layout.jsp hiển thị
    request.setAttribute("content", "news-detail-content.jsp");
%>
<jsp:include page="layout.jsp" />
