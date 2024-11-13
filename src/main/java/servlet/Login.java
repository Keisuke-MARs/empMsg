package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.LoginLogic;
import model.Member;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		request.setCharacterEncoding("UTF-8");
		
		//入力値の取得
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
				//User.javaのインスタンス生成
		Member Member = new Member(id,pass);
		
		//LoginLogic.javaのインスタンス生成
		LoginLogic loginLogic = new LoginLogic();
		
		//ログイン可否の判定
		boolean isLogin = loginLogic.execute(id,pass);
		
		//ログイン可能な場合
		if(isLogin) {
			//セッションの取得
			HttpSession session = request.getSession();
			//セッションへの保存
			session.setAttribute("loginUser",Member);
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/menuList.jsp");
			dispatcher.forward(request, response);
		}else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/error.jsp");
			dispatcher.forward(request, response);
		}
		//ログイン成功画面への遷移
		
		
	}

}
