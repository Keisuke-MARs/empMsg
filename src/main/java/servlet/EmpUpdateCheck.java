package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpUpdateCheck
 */
@WebServlet("/EmpUpdateCheck")
public class EmpUpdateCheck extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
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
		request.setAttribute("no", no);
		request.setAttribute("name", name);
		request.setAttribute("address", address);
		request.setAttribute("tel", tel);
		request.setAttribute("join_date", join_date);
		request.setAttribute("dept_name", dept_name);
		request.setAttribute("roll_name", roll_name);
		request.setAttribute("boss_no", boss_no);
		request.setAttribute("boss_name", boss_name);
		request.setAttribute("retire", retire);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/empCheck.jsp");
		dispatcher.forward(request, response);
	}

}
