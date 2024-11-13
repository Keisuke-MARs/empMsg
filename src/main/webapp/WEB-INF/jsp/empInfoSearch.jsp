<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Emp"%>
<%
Emp emp = (Emp) request.getAttribute("emp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>社員情報管理システム</title>
</head>
<body>
	<h1>社員情報管理システム</h1>
	<h1>社員検索画面</h1>
	<form action="EmpSearchServlet" method="post">
		<table>
			<tr>
				<th>社員番号</th>
				<td><input type="text" name="no" maxlength="6"></td>
				<td><input type="submit" value="検索"></td>
			</tr>
		</table>
	</form>
	<%
	if (emp != null) {
	%>
	<table border="1">
		<tr>
			<th>社員番号</th>
			<td><%=emp.getNo()%></td>
		</tr>
		<tr>
			<th>氏名</th>
			<td><%=emp.getName()%></td>
		</tr>
		<tr>
			<th>住所</th>
			<td><%=emp.getAddress()%></td>
		</tr>
		<tr>
			<th>電話番号</th>
			<td><%=emp.getTel()%></td>
		</tr>
		<tr>
			<th>入社年月日</th>
			<td><%=emp.getJoin_date()%></td>
		</tr>
		<tr>
			<th>所属部署</th>
			<td><%=emp.getDept_name()%></td>
		</tr>
		<tr>
			<th>役職</th>
			<td><%=emp.getRoll_name()%></td>
		</tr>
		<tr>
			<th>上司社員番号</th>
			<td><%=emp.getBoss_name()%></td>
		</tr>
		<tr>
			<th>上司氏名</th>
			<td><%=emp.getRetire()%></td>
		</tr>
	</table>
	<a href="EmpInfoUpdateServlet?NO=<%=emp.getNo()%>">編集</a>
	<a href="EmpDeleteCheck?NO=<%=emp.getNo()%>">退職</a>
	<%
	}
	%>
	<p>
		<a href="test.jsp">TOP</a>
	</p>
	<p>
		<a href="">ログアウト</a>
	</p>
</body>
</html>