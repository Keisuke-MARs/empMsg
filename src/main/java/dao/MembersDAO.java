package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MembersDAO {
	//データベースの接続情報
	private final String JDBC_URL = "jdbc:mysql://localhost:3307/WEB_AP";
	private final String DB_USER = "root";
	private final String DB_PASS = "password";

	public boolean UserLogin(String id, String pass) {
		String idt = "";
		String passt = "";
		ResultSet rs;
		try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			String sql = "select id,pass from member where id = ? and pass = ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, pass);
			//sqlの実行
			rs = stmt.executeQuery();
//			username = rs.getString("username");
//			password = rs.getString("password");
			if(rs.next()) {
				idt = rs.getString("id");
				passt = rs.getString("pass");
				return true;
			}else {
				return false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
//		if ("".equals(user) && "".equals(pass)) {
//			return false;
//
//		} else {
//			if (user.equals(username) && pass.equals(password)) {
//				return true;
//			} else {
//				return false;
//			}
//		}
		

	}
	
	public boolean InsertUser(String id,String name, String pass) {
		int rs;
		try (Connection con = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			String sql = "insert into member(id,name,pass)values(?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, name);
			stmt.setString(3, pass);
			rs = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		if (rs == 1) {
			return true;
		} else {
			return false;
		}
	}
}
