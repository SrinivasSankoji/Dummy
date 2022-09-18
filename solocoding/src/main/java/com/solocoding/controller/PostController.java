package com.solocoding.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.solocoding.dto.Post;

@RestController
public class PostController {

	@GetMapping("/post/{random}")
	public Post getPost(@PathVariable Integer random) {
		return new Post("postTitle " + random, "some body");
	}
}
