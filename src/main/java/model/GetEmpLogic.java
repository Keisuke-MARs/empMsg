package model;

import java.util.List;

import dao.EmpDao;

public class GetEmpLogic {
	public List<Emp> execute() {
		EmpDao dao = new EmpDao();
		List<Emp> empList = dao.findAll();
		return empList;
	}

}
