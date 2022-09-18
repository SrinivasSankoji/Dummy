package com.howtodoinjava.mockito.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.howtodoinjava.mockito.dao.EmployeeDao;
import com.howtodoinjava.mockito.model.EmployeeVO;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeDao employeeDao;

	/**@GetMapping(path = "/", produces = "application/json")
	public List<EmployeeVO> getEmployees() {
		return employeeDao.getEmployeeList();
	}**/

	@PostMapping(path = "/addEmployee", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> addEmployee(@RequestBody EmployeeVO employee) {

		// add resource
		employeeDao.addEmployee(employee);

		// Create resource location
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(employee.getEmployeeId()).toUri();

		// Send location in response
		return ResponseEntity.created(location).build();
	}
}
