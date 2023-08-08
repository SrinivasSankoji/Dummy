package com.reflectoring.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reflectoring.dto.UserResource;
import com.reflectoring.model.User;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class RegisterRestController {

	@PostMapping("/forums/{forumId}/register")
	UserResource register(@PathVariable("forumId") Long forumId, @Valid @RequestBody UserResource userResource,
			@RequestParam("sendWelcomeMail") boolean sendWelcomeMail) {
		User user = new User(userResource.getName(), userResource.getEmail());
		// Long userId = registerUseCase.registerUser(user, sendWelcomeMail);
		return new UserResource(user.getName(), user.getEmail());
	}
}
