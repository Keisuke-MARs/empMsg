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
<link rel="stylesheet" href="../../css/style.css">
</head>
<body>
	<h1>社員情報管理システム</h1>
	<h1>社員情報変更画面</h1>
	<p>変更のある項目を修正してください。</p>
	<form action="EmpUpdateCheck" method="post">
		<table border="1" class="row">
			<%
			for (Emp emp : SingleempList) {
			%>
			<tr>
				<th>社員番号</th>
				<td><input type="text" name="no" value="<%=emp.getNo()%>" maxlength="6"></td>
			</tr>
			<tr>
				<th>氏名</th>
				<td><input type="text" name="name" value="<%=emp.getName()%>"></td>
			</tr>
			<tr>
				<th>住所</th>
				<td><input type="text" name="address"
					value="<%=emp.getAddress()%>"></td>
			</tr>
			<tr>
				<th>電話番号</th>
				<td><input type="tel" name="tel" value="<%=emp.getTel()%>" pattern="\d{2,4}-\d{3,4}-\d{3,4}"></td>
			</tr>
			<tr>
				<th>入社年月日</th>
				<td><input type="date" name="join_date"
					value="<%=emp.getJoin_date()%>"></td>
			</tr>
			<tr>
				<th>所属部署</th>
				<td><select name="dept_name">
						<option value="<%=emp.getDept_name()%>"><%=emp.getDept_name()%></option>
						<option value="システム部">システム部</option>
						<option value="総務部">総務部</option>
						<option value="経理部">経理部</option>
						<option value="人事部">人事部</option>
				</select></td>
			</tr>
			<tr>
				<th>役職</th>
				<td><select name="roll_name">
						<option value="<%=emp.getRoll_name()%>"><%=emp.getRoll_name()%></option>
						<option value="社長">社長</option>
						<option value="部長">部長</option>
						<option value="課長">課長</option>
						<option value="PM">PM</option>
						<option value="PL">PL</option>

				</select></td>
			</tr>
			<tr>
				<th>上司社員番号</th>
				<td><input type="text" name="boss_no"
					value="<%=emp.getBoss_no()%>"maxlength="6"></td>
			</tr>
			<tr>
				<th>上司氏名</th>
				<td><input type="text" name="boss_name"
					value="<%=emp.getBoss_name()%>" readonly></td>
			</tr>
			<tr>
				<th>退職フラグ</th>
				<td><input type="text" name="retire"
					value="<%=emp.getRetire()%>" readonly></td>
			</tr>
			<%
			}
			%>
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