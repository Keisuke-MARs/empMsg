<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー新規登録画面</title>
</head>
<body>
<h1>ユーザー新規登録</h1>
<form action="NewUser" method="post">
ID:<input type="text" name="id"><br>
名前:<input type="text" name="name"><br>
Pass:<input type="password" name="pass"><br>
確認パス:<input type="password" name="pass1"><br>
<input type="submit" value="登録">
<p><a href = "login.jsp">ログイン</a></p>
</form>
</body>
</html>