package com.reflectoring.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.reflectoring.dto.UserResource;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = RegisterRestController.class)
class RegisterRestControllerTest {

	@Autowired
	MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@Test
	void registerTestValidUrl() throws Exception {
		UserResource user = new UserResource("Zaphod", "zaphod@galaxy.net");
		mockMvc.perform(post("/forums/{forumId}/register", 42L).contentType("application/json")
				.param("sendWelcomeMail", "true").content(objectMapper.writeValueAsString(user))).andDo(print())
				.andExpect(status().isOk());
	}

}
