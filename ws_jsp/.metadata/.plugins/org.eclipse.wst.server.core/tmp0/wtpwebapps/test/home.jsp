<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>

<h1>Welcome Home Page</h1>
<hr>

<div>
	<p>반갑습니다.</p>
</div>

<form action="result" method="get">
	이름:
	<input placeholder="이름을 입력하세요." name="userName" type="text">
	나이:
	<input placeholder="나이를 입력하세요." name="userAge" type="text">
	<input type="submit" value="전송">
</form>

</body>
</html>