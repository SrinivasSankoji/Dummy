package com.howtodoinjava.mockito.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer employeeId;
	private String firstName;
	private String lastName;
	private String email;

}
