package com.solocoding.dto;

import java.util.UUID;

import lombok.Data;

@Data
public class Post {
	private String id;
	private String postTitle;
	private String body;

	public Post(String postTitle, String body) {
		this.id = UUID.randomUUID().toString();
		this.postTitle = postTitle;
		this.body = body;
	}
}
