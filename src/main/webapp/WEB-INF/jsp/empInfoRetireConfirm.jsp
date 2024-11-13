<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Emp,java.util.List"%>
<%
List<Emp> SingleempList = (List<Emp>) request.getAttribute("SingleempList");
%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>社員情報管理システム</title>
</head>
<body>
	<h1>社員情報管理システム</h1>
	<h1>社員情報変更画</h1>
	<p>以下の社員を退職させます。よろしいですか？</p>
	<form action="EmpInfoDeleteServlet" method="post">
		<table border="1">
			<%
			for (Emp emp : SingleempList) {
			%>
			<tr>
				<th>社員番号</th>
				<td><input type="text" name="no" value="<%=emp.getNo()%>"
					readonly></td>
			</tr>
			<tr>
				<th>氏名</th>
				<td><input type="text" name="name" value="<%=emp.getName()%>"
					readonly></td>
			</tr>
			<tr>
				<th>住所</th>
				<td><input type="text" name="address"
					value="<%=emp.getAddress()%>" readonly></td>
			</tr>
			<tr>
				<th>電話番号</th>
				<td><input type="text" name="tel" value="<%=emp.getTel()%>"
					readonly></td>
			</tr>
			<tr>
				<th>入社年月日</th>
				<td><input type="text" name="join_date"
					value="<%=emp.getJoin_date()%>" readonly></td>
			</tr>
			<tr>
				<th>所属部署</th>
				<td><input type="text" name="dept_name"
					value="<%=emp.getDept_name()%>" readonly></td>
			</tr>
			<tr>
				<th>役職</th>
				<td><input type="text" name="roll_name"
					value="<%=emp.getRoll_name()%>" readonly></td>
			</tr>
			<tr>
				<th>上司社員番号</th>
				<td><input type="text" name="boss_name"
					value="<%=emp.getBoss_name()%>" readonly></td>
			</tr>
			<tr>
				<th>上司氏名</th>
				<td><input type="text" name="retire"
					value="<%=emp.getRetire()%>" readonly></td>
			</tr>
			<%
			}
			%>
		</table>
		<input type="submit" value="退職">
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