package com.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.bean.Employee;
import com.emp.dao.IEmpDao;

@Service
public class EmpServiceImpl implements IEmpService{

	@Autowired
	private IEmpDao edao;
	
	@Override
	public int addEmployeeDetails(Employee emp) {
		int b=edao.addEmployeeDetails(emp);
		return b;
	}

}
