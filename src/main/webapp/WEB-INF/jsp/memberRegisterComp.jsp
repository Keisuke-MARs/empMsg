<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "model.Member" %>
<% 
	Member loginUser = (Member)session.getAttribute("loginUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>社員情報管理システム</title>
</head>
<body>
<h1>社員情報管理システム</h1>
<% if(loginUser != null){ %>
	<p>ユーザ情報の登録が完了しました。</p>
	<a href="login.jsp">ログイン</a>
	<a href="Logout">ログアウト</a>
	
	<% }%>
</body>
</html>
