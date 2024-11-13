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
import model.EmpDeleteLogic;

/**
 * Servlet implementation class EmpInfoDeleteServlet
 */
@WebServlet("/EmpInfoDeleteServlet")
public class EmpInfoDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		List<Emp> DeleteempList = new ArrayList<Emp>();
		EmpDeleteLogic empdelete = new EmpDeleteLogic();
		String no = request.getParameter("no");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String tel = request.getParameter("tel");
		String join_date = request.getParameter("join_date");
		String dept_name = request.getParameter("dept_name");
		String roll_name = request.getParameter("roll_name");
		String boss_no = request.getParameter("boss_no");
		String boss_name = request.getParameter("boss_name");
		Emp emp = new Emp(no, name, address, tel, join_date, dept_name, roll_name, boss_no, boss_name);
		DeleteempList.add(emp);
		boolean boo = empdelete.EmpDeleteLogic(emp);
		if (boo) {
			session.setAttribute("emp", emp);
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/empDeleteResult.jsp");
		dispatcher.forward(request, response);

	}

}
