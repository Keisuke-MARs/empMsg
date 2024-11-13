<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import = "model.Emp" %>
	
<!DOCTYPE html>
<%
	Emp emp = (Emp)session.getAttribute("emp");
%>
<html>
<head>
<meta charset="UTF-8">
<title>社員情報管理システム</title>
</head>
<body>
	<h1>社員情報管理システム</h1>
	<h1>社員情報更新完了画面</h1>
<% if(emp != null){%>
	<p>社員情報の更新が完了しました。</p>
<%}else{ %>
	<p>社員情報の更新に失敗しました。</p>
<%}%>
	<p>
		<a href="test.jsp">TOP</a>
	</p>
	<p>
		<a href="">ログアウト</a>
	</p>
</body>
</html>