<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/Lab2_java/form/form.jsp" method="post"> 
    <div>Fullname:</div> 
    <input name="fullname" value="${user.fullname }" readonly><br>   
      <div>Gender:</div> 
    <input type="radio" name="gender" value="true" ${user.gender eq 'true' ? 'checked' : ''}> Male<br>
<input type="radio" name="gender" value="false" ${user.gender eq 'false' ? 'checked' : ''}> Female<br>

    <div>Country:</div> 
    <select name="country"> 
 	 	<option value="VN" ${user.country == 'VN' ?  ' selected' : ''}>Việt Nam</option> 
 	 	<option value="us" ${user.country == 'US' ?  ' selected' : ''}>Mỹ</option> 
 	 	<option value="cn" ${user.country == 'CN' ?  ' selected' : ''}>Trung Quốc</option> 
 	 
 	</select> 
    <hr> 
    <p>Gender: ${user.gender} </p>
    <button formaction="/Lab2_java/form/themmoi.jsp">Create</button> 
    <button>Update</button> 
    ${capnhat }
</form> 

</body>
</html>