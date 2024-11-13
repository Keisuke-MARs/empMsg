package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Emp;
import model.EmpUpdateLogic;

/**
 * Servlet implementation class EmpUpdate
 */
@WebServlet("/EmpUpdate")
public class EmpUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		List<Emp> UpdateempList = new ArrayList<Emp>();
		EmpUpdateLogic empup = new EmpUpdateLogic();
		HttpSession session = request.getSession();
		String emono = (String)session.getAttribute("empno");
		String no = request.getParameter("no");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String tel = request.getParameter("tel");
		String join_date = request.getParameter("join_date");
		String dept_name = request.getParameter("dept_name");
		String roll_name = request.getParameter("roll_name");
		String boss_no = request.getParameter("boss_no");
		String boss_name = request.getParameter("boss_name");
		int retire = Integer.parseInt(request.getParameter("retire"));
		Emp emp = new Emp(no, name, address, tel, join_date, dept_name, roll_name, boss_no, boss_name, retire);
		UpdateempList.add(emp);
		boolean boo = empup.Update(emp,emono);
		if (boo) {
			session.setAttribute("emp", emp);
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/empInfoUpdateComp.jsp");
		dispatcher.forward(request, response);
	}

}
