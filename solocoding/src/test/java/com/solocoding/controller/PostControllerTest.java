package com.solocoding.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(controllers = PostController.class)
class PostControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void getPostEndPointWorkingTest() throws Exception {
		mockMvc.perform(get("/post/1")).andDo(print()).andExpect(status().isOk());
	}

	void getPostAcceptsOnlyGetTest() throws Exception {
		mockMvc.perform(post("/post/1)")).andDo(print()).andExpect(status().isMethodNotAllowed());
	}

}
