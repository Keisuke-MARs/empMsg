package model;
import java.util.List;

import dao.EmpDao;

public class GetSingleEmpLogic {
	public List<Emp> execute(String empno){
		EmpDao dao = new EmpDao();
		List<Emp> SingleempList = dao.findsingle(empno);
		return SingleempList;
	}
}
