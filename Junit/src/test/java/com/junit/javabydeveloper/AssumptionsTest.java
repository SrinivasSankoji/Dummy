package com.junit.javabydeveloper;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Test;

public class AssumptionsTest {

	@Test
	void testOnlyForDevelopment() {
		assumeTrue("Development".equals("Production"), () -> "Aborting Test Since It is Not Development");
		User user = new User(1, "Peter", "peterm@email.com");
		UserService.saveOrUpdate(user);
		assertTrue(UserService.users.get(1l) == user);
	}

	@Test
	void testOnlyForProduction() {
		assumeFalse("Development".equals("Production"));
		User user = new User(1, "Peter", "peterm@email.com");
		UserService.saveOrUpdate(user);
		assertTrue(UserService.users.get(1l) == user);
	}

	@Test
	void testOnlyIfNotProduction() {
		assumingThat("Development".equals("Production"), () -> {
			UserService.saveOrUpdate(new User(1, "Peter", "peterm@email.com"));
		});
		User user = new User(2, "Srinivas", "Srinivas@email.com");
		UserService.saveOrUpdate(user);
		System.out.println(UserService.users.get(2l));
		assertTrue(UserService.users.get(2l) == user);
	}
}
