package com.howtodoinjava.mockito.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.howtodoinjava.mockito.dao.EmployeeDao;
import com.howtodoinjava.mockito.model.EmployeeVO;

public class EmployeeServiceTest {

	@InjectMocks
	EmployeeService employeeService;

	@Mock
	EmployeeDao employeeDao;

	@BeforeEach
	public void init() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void getEmployeeListTest() {

		List<EmployeeVO> list = new ArrayList<EmployeeVO>();
		EmployeeVO empOne = new EmployeeVO(1, "John", "John", "howtodoinjava@gmail.com");
		EmployeeVO empTwo = new EmployeeVO(2, "Alex", "kolenchiski", "alexk@yahoo.com");
		EmployeeVO empThree = new EmployeeVO(3, "Steve", "Waugh", "swaugh@gmail.com");

		list.add(empOne);
		list.add(empTwo);
		list.add(empThree);

		when(employeeDao.getEmployeeList()).thenReturn(list);

		List<EmployeeVO> employeeList = employeeService.getEmployeeList();

		assertEquals(3, employeeList.size());
		verify(employeeDao, times(1)).getEmployeeList();
	}
}
