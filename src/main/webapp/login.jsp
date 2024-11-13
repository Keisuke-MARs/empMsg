<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>社員情報管理システム</title>
</head>
<body>
<h1>社員情報管理システム</h1>
<form action="Login" method="post">
ID:<input type="text" name="id"><br>
Pass:<input type="password" name="pass"><br>
<input type="submit" value="ログイン">
</form>
<p><a href = memberRegister.jsp>ユーザー新規登録はこちら</a></p>
</body>
</html>