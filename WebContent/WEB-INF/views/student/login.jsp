<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성적관리</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
	<h1>학생입력</h1>
	<form id="join" action="<%=request.getContextPath() %>/student.do">
	이름 <input type="text" name="name"/><br />
	학번 <input type="text" name="StudentNum"/>
	<input type="submit" value="정보전송"/>
	</form>
<script>
$('#join').submit(function() {
	alert('로그인완료');
});
</script>	
</body>
</html>