package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Emp;
import model.GetSingleEmpLogic;

/**
 * Servlet implementation class EmpDeleteCheck
 */
@WebServlet("/EmpDeleteCheck")
public class EmpDeleteCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empno = request.getParameter("NO");
		GetSingleEmpLogic getemp = new GetSingleEmpLogic();
		List<Emp>SingleempList = getemp.execute(empno);
		request.setAttribute("SingleempList", SingleempList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/empInfoRetireConfirm.jsp");
		dispatcher.forward(request, response);
	}


}
