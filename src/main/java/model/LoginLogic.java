package model;
import dao.MembersDAO;
public class LoginLogic {
	public boolean execute(String id,String pass) {
		boolean boo;
		MembersDAO dao = new MembersDAO();
		boo = dao.UserLogin(id,pass);

		if (boo) {
			return true;
		}else {
			return false;
		}
		
		//元々のコード
//		if (user.getPass().equals("1234")) {
//			return true;
//		}
//		return false;

	}
}
