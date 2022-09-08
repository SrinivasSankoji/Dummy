package com.junit.softwaretestinghelp;

import lombok.Data;

@Data
public class Employee {

	public String ename;
	public int empcode;

	public Employee(String ename, int empcode) {
		this.ename = ename;
		this.empcode = empcode;
	}
}
