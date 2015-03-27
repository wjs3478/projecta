<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html>
<head>
<title>내맘대로</title>
<style>
body{background-image:url("7-1.jpg");background-repeat:no-repeat;background-attachement:fixed;}

input,select{border:green 1.5pt dashed;background:gold;color:red;font-size:30px;font-weight:bold;}
</style>

<script>
function testfunc(){
alert("hello java");	
}
</script>
</head>
<body>
<h1>서블릿 테스트</h1>
<hr>	
<form action="zzzz" onsubmit="return testfunc()">

<input type="text" name="na"><br>


<input type="radio" name="gg" value="1"> 남자
<input type="radio" name="gg" value="2"> 여자
<br>

<input type="color" name="co"><br>

<input type="checkbox" name="cv" value="3"> alt
<input type="checkbox" name="cv" value="4"> contorl
<input type="checkbox" name="cv" value="5"> aaa
<br>
<input type="email" name="em"><br>
<select name="min">
<option>minsu</option>
<option>kasanoba</option>
<option>dog</option>
</select>
<br>
<textarea name="txt" rows=100 cols=10></textarea><br>
<input type="submit" value="서버로 제출">

</form>
</body>
</html>