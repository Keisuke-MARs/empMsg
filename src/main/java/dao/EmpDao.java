package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import model.Emp;

public class EmpDao {
	//データベースの接続情報
	private final String JDBC_URL = "jdbc:mysql://localhost:3307/web_ap";
	private final String DB_USER = "root";
	private final String DB_PASS = "password";

	public List<Emp> findAll() {
		List<Emp> empList = new ArrayList<>();
		try (Connection con = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			String sql = "SELECT A.NO, A.NAME, A.ADDRESS,A.TEL,A.JOIN_DATE,A.DEPT_NAME,A.ROLL_NAME,A.BOSS_NO,B.NAME AS BOSS_NAME,A.RETIRE FROM EMP A LEFT JOIN EMP B ON B.NO = A.BOSS_NO WHERE A.RETIRE = 0";
			PreparedStatement pStmt = con.prepareStatement(sql);
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				String no = rs.getString("NO");
				String name = rs.getString("NAME");
				String address = rs.getString("ADDRESS");
				String tel = rs.getString("TEL");
				String join_date = new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate("JOIN_DATE"));
				String dept_name = rs.getString("DEPT_NAME");
				String roll_name = rs.getString("ROLL_NAME");
				String boss_no = rs.getString("BOSS_NO");
				String boss_name = rs.getString("BOSS_NAME");
				Emp emp = new Emp(no, name, address, tel, join_date, dept_name, roll_name, boss_no, boss_name);
				empList.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return empList;
	}

	public List<Emp> findsingle(String empno) {
		List<Emp> SingleempList = new ArrayList<>();
		try (Connection con = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			String sql = "SELECT A.NO, A.NAME, A.ADDRESS,A.TEL,A.JOIN_DATE,A.DEPT_NAME,A.ROLL_NAME,A.BOSS_NO,B.NAME AS BOSS_NAME,A.RETIRE FROM EMP A LEFT JOIN EMP B ON B.NO = A.BOSS_NO WHERE A.NO = ?";
			PreparedStatement pStmt = con.prepareStatement(sql);
			pStmt.setString(1, empno);
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				String no = rs.getString("NO");
				String name = rs.getString("NAME");
				String address = rs.getString("ADDRESS");
				String tel = rs.getString("TEL");
				String join_date = new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate("JOIN_DATE"));
				String dept_name = rs.getString("DEPT_NAME");
				String roll_name = rs.getString("ROLL_NAME");
				String boss_no = rs.getString("BOSS_NO");
				String boss_name = rs.getString("BOSS_NAME");
				int retire = rs.getInt("RETIRE");
				Emp emp = new Emp(no, name, address, tel, join_date, dept_name, roll_name, boss_no, boss_name, retire);
				SingleempList.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return SingleempList;
	}

	public boolean EmpUpdate(Emp emp, String empno) {
		String no = emp.getNo();
		String name = emp.getName();
		String address = emp.getAddress();
		String tel = emp.getTel();
		Date join_date = Date.valueOf(emp.getJoin_date());
		//		String join_date = emp.getJoin_date();
		String dept_name = emp.getDept_name();
		String roll_name = emp.getRoll_name();
		String boss_no = emp.getBoss_no();
		int rs;
		try (Connection con = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			String sql = "UPDATE EMP SET NO = ?,NAME = ?,ADDRESS = ? ,TEL = ?,JOIN_DATE = ?,DEPT_NAME = ?,ROLL_NAME = ?,BOSS_NO = ? WHERE NO = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, no);
			stmt.setString(2, name);
			stmt.setString(3, address);
			stmt.setString(4, tel);
			stmt.setDate(5, join_date);
			stmt.setString(6, dept_name);
			stmt.setString(7, roll_name);
			stmt.setString(8, boss_no);
			stmt.setString(9, empno);
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

	public boolean EmpDelete(Emp emp) {
		String no = emp.getNo();
		int rs;
		try (Connection con = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			String sql = "UPDATE EMP SET RETIRE = 1 WHERE NO = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, no);
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

	public Emp EmpSearch(String empno) {
		Emp emp = null;
		try (Connection con = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			String sql = "SELECT A.NO, A.NAME, A.ADDRESS,A.TEL,A.JOIN_DATE,A.DEPT_NAME,A.ROLL_NAME,A.BOSS_NO,B.NAME AS BOSS_NAME,A.RETIRE FROM EMP A LEFT JOIN EMP B ON B.NO = A.BOSS_NO WHERE A.NO = ?";
			PreparedStatement Stmt = con.prepareStatement(sql);
			Stmt.setString(1, empno);
			ResultSet rs = Stmt.executeQuery();
			while (rs.next()) {
				String no = rs.getString("NO");
				String name = rs.getString("NAME");
				String address = rs.getString("ADDRESS");
				String tel = rs.getString("TEL");
				String join_date = new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate("JOIN_DATE"));
				String dept_name = rs.getString("DEPT_NAME");
				String roll_name = rs.getString("ROLL_NAME");
				String boss_no = rs.getString("BOSS_NO");
				String boss_name = rs.getString("BOSS_NAME");
				emp = new Emp(no, name, address, tel, join_date, dept_name, roll_name, boss_no, boss_name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return emp;

	}

}
