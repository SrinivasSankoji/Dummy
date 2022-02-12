package com.howtodoinjava.mockito.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.howtodoinjava.mockito.dao.EmployeeDao;
import com.howtodoinjava.mockito.model.EmployeeVO;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao dao;

	public List<EmployeeVO> getEmployeeList() {
		return dao.getEmployeeList();
	}

	public EmployeeVO getEmployeeById(int id) {
		return dao.getEmployeeById(id);
	}

	public void addEmployee(EmployeeVO employee) {
		dao.addEmployee(employee);
	}
}
