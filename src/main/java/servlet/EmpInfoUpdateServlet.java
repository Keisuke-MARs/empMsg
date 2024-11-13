package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Emp;
import model.GetSingleEmpLogic;
/**
 * Servlet implementation class EmpInfoUpdateServlet
 */
@WebServlet("/EmpInfoUpdateServlet")
public class EmpInfoUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empno = (String) request.getParameter("NO");
		HttpSession session = request.getSession();
		session.setAttribute("empno", empno);
		GetSingleEmpLogic getemp = new GetSingleEmpLogic();
		List<Emp>SingleempList = getemp.execute(empno);
		request.setAttribute("SingleempList", SingleempList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/empInfoUpdate.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
