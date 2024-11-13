<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Member"%>
<%
	Member loginUser = (Member)session.getAttribute("loginUser");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>機能一覧画面</title>
</head>
<body>
<% if(loginUser != null){ %>
	<p>ログインに成功しました</p>
	<p>ようこそ<%= loginUser.getName() %>さん</p>
	<a href="Main">つぶやき投稿・閲覧へ</a>
	<a href="Logout">ログアウト</a>
	<%}else{ %>
	<p>ログインに失敗しました</p>
	<a href="Main">TOPへ</a>
	<% }%>
</body>
</html>