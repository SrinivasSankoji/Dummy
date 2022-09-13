package com.howtodoinjava.mockito.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.howtodoinjava.mockito.dao.EmployeeDao;
import com.howtodoinjava.mockito.model.EmployeeVO;

@ExtendWith(MockitoExtension.class)
class EmployeeControllerTest {

	@InjectMocks
	EmployeeController employeeController;

	@Mock
	EmployeeDao employeeDao;

	@Test
	public void testAddEmployee() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		when(employeeDao.addEmployee(ArgumentMatchers.any(EmployeeVO.class))).thenReturn(true);

		EmployeeVO employee = new EmployeeVO(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com");
		ResponseEntity<Object> responseEntity = employeeController.addEmployee(employee);

		assertThat(responseEntity.getStatusCodeValue()).isEqualTo(201);
		assertThat(responseEntity.getHeaders().getLocation().getPath()).isEqualTo("/1");
	}
}
