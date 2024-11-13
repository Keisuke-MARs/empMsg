package model;
import dao.EmpDao;
public class EmpUpdateLogic {
	public boolean Update(Emp emp,String empno) {
		EmpDao dao = new EmpDao();
		boolean boo = dao.EmpUpdate(emp,empno);
		return boo;
		
	}
}
