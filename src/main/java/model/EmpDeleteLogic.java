package model;
import dao.EmpDao;
public class EmpDeleteLogic {
	public boolean EmpDeleteLogic(Emp emp) {
		EmpDao dao = new EmpDao();
		boolean boo = dao.EmpDelete(emp);
		return boo;
	}
}
