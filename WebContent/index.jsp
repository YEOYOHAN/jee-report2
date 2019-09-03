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
	<h1>회원가입</h1>
	<form id="report" action="<%=request.getContextPath() %>/Student.do">
	이름 <input type="text" name="name"/><br />
	주민번호 <input type="text" name="ssn"/><br />
	국어 <input type="text" name="kor"/><br />
	영어 <input type="text" name="eng"/><br />
	수학 <input type="text" name="math"/><br />
	<input type="submit" value="전투더송"/><br />
	</form>
<script>
$('#report').submit(function() {
	alert('감사합니다.');
});
</script>	
</body>
</html>