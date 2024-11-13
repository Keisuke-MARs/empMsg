<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Emp,java.util.List"%>
<%
List<Emp> CheckempList = (List<Emp>) request.getAttribute("CheckempList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>社員情報管理システム</title>
</head>
<body>
	<h1>社員情報管理システム</h1>
	<h1>社員情報変更画面</h1>
	<p>以下の内容で社員情報を更新します。よろしいですか？</p>
	<form action="EmpUpdate" method="post">
	<table border="1" class="row">
		<tr>
			<th>社員番号</th>
			<td><input type="text" name="no" value="<%=request.getAttribute("no")%>"
				readonly></td>
		</tr>
		<tr>
			<th>氏名</th>
			<td><input type="text" name="name" value="<%=request.getAttribute("name")%>"
				readonly></td>
		</tr>
		<tr>
			<th>住所</th>
			<td><input type="text" name="address"
				value="<%=request.getAttribute("address")%>" readonly></td>
		</tr>
		<tr>
			<th>電話番号</th>
			<td><input type="text" name="tel" value="<%=request.getAttribute("tel")%>"
				readonly></td>
		</tr>
		<tr>
			<th>入社年月日</th>
			<td><input type="text" name="join_date"
				value="<%=request.getAttribute("join_date")%>" readonly></td>
		</tr>
		<tr>
			<th>所属部署</th>
			<td><input type="text" name="dept_name"
				value="<%=request.getAttribute("dept_name")%>" readonly></td>
		</tr>
		<tr>
			<th>役職</th>
			<td><input type="text" name="roll_name"
				value="<%=request.getAttribute("roll_name")%>" readonly></td>
		</tr>
		<tr>
			<th>上司社員番号</th>
			<td><input type="text" name="boss_no"
				value="<%=request.getAttribute("boss_no")%>" readonly></td>
		</tr>
		<tr>
			<th>上司氏名</th>
			<td><input type="text" name="boss_name"
				value="<%=request.getAttribute("boss_name")%>" readonly></td>
		</tr>
		<tr>
			<th>退職フラグ</th>
			<td><input type="text" name="retire"
				value="<%=request.getAttribute("retire")%>" readonly></td>
		</tr>
	</table>
	<input type="submit" value="確認"> 
	</form>
	<p>
		<a href="EmpListServlet">戻る</a>
	</p>
	<p>
		<a href="test.jsp">TOP</a>
	</p>
	<p>
		<a href="">ログアウト</a>
	</p>

</body>
</html>