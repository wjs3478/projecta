<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>GET</h1>
<form method="get" action="baka"><!-- 메소드 생략시 그냥 겟방식 -->
이름 : <input type="text" name="na"><br>
id : <input type="text" name="id"><br>
password : <input type="password" name="pwd"><br>
<input type="submit" value="get요청">
</form>

<a href="baka">김민수 문어발, 교회오빠</a>
<hr>


<h1>POST</h1>
<form method="post" action="baka">
이름 : <input type="text" name="na"><br>
id : <input type="text" name="id"><br>
password : <input type="password" name="pwd"><br>
<input type="submit" value="post요청">
</form>

<hr>
<h1>JSP</h1>
<form method="post" action="sss3.jsp">
이름 : <input type="text" name="na"><br>
id : <input type="text" name="id"><br>
password : <input type="password" name="pwd"><br>
<input type="submit" value="jsp로">
</form>

</body>
</html>