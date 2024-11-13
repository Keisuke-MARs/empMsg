package model;
import dao.EmpDao;
public class EmpSearch {
	public Emp empseach(String no) {
		EmpDao dao = new EmpDao();
		Emp emp = dao.EmpSearch(no);
		return emp;
	}
}
