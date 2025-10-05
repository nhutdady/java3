<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Quản lý loại tin</title>
</head>
<body>
    <h2>Quản lý loại tin</h2>
    <a href="category-form.jsp">+ Thêm loại tin</a>
    <table border="1" cellspacing="0" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>Tên loại</th>
            <th>Hành động</th>
        </tr>
        <tr>
            <td>1</td>
            <td>Thời sự</td>
            <td>
                <a href="category-form.jsp?id=1">Sửa</a> | 
                <a href="#">Xóa</a>
            </td>
        </tr>
    </table>
</body>
</html>
