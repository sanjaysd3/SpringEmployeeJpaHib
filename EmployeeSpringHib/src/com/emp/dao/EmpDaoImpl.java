package com.emp.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.emp.bean.Employee;

@Repository
@Transactional
public class EmpDaoImpl implements IEmpDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public int addEmployeeDetails(Employee emp) {
		em.persist(emp);
		System.out.println(emp.getEmpId());
		return emp.getEmpId();
	}

}
