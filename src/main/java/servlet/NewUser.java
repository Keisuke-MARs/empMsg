package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MembersDAO;
import model.Member;

/**
 * Servlet implementation class NewUser
 */
@WebServlet("/NewUser")
public class NewUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		String pass1 = request.getParameter("pass1");
		Member Member = new Member(id,name,pass);
		MembersDAO dao = new MembersDAO();
		boolean boo = dao.InsertUser(id, name, pass);
		if(boo) {
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", Member);
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/memberRegisterComp.jsp");
			dispatcher.forward(request, response);
		}else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/error.jsp");
			dispatcher.forward(request, response);
		}
		
		
	}

}
