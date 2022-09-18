package com.petrikainulainen.dto;

import java.util.List;

import lombok.Data;

@Data
public class TodoItemDTO {

	private Long id;
	private String description;
	private List<TagDTO> tags;
	private String title;
	private TodoItemStatus status;

	public TodoItemDTO() {
	}
}
