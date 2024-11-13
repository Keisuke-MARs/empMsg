<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Emp,java.util.List" %>
<% 
	List<Emp> empList = (List<Emp>)request.getAttribute("empList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>社員情報管理システム</title>
</head>
<body>
	<h1>社員情報管理システム</h1>
	<h1>社員一覧画面</h1>
	<table border="1">
		<tr>
			<th>社員番号</th>
			<th>氏名</th>
			<th>住所</th>
			<th>電話番号</th>
			<th>入社年月日</th>
			<th>所属部署</th>
			<th>役職</th>
			<th>上司社員番号</th>
			<th>上司氏名</th>
			<th></th>
			<th></th>

		</tr>
			<% for (Emp emp : empList) {%>
		<tr>
			<td><%= emp.getNo()%></td>
			<td><%= emp.getName() %></td>
			<td><%= emp.getAddress() %></td>
			<td><%= emp.getTel() %></td>
			<td><%= emp.getJoin_date() %></td>
			<td><%= emp.getDept_name() %></td>
			<td><%= emp.getRoll_name() %></td>
			<td><%= emp.getBoss_no() %></td>
			<td><%= emp.getBoss_name() %></td>
			<td><a href="EmpInfoUpdateServlet?NO=<%= emp.getNo()%>">編集</a></td>
			<td><a href="EmpDeleteCheck?NO=<%= emp.getNo()%>">退職</a></td>
		</tr>
		<% } %>
	</table>
	<p>
		<a href="test.jsp">TOP</a>
	</p>
	<p>
		<a href="">ログアウト</a>
	</p>
</body>
</html>