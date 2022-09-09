package com.junit.javabydeveloper;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
	private String userName;
	private String email;

	public User(long id, String userName, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
	}

}
