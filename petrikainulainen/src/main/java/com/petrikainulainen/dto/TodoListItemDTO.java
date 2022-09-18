package com.petrikainulainen.dto;

import lombok.Data;

@Data
public class TodoListItemDTO {

	private Long id;
	private String title;
	private TodoItemStatus status;

	public TodoListItemDTO() {
	}

}
