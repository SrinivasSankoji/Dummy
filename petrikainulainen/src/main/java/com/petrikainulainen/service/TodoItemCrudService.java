package com.petrikainulainen.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.petrikainulainen.dto.CreateTodoItemDTO;
import com.petrikainulainen.dto.TodoItemDTO;
import com.petrikainulainen.dto.TodoListItemDTO;

@Service
public class TodoItemCrudService {

	/**
	 * Creates a new todo item and saves it to the database.
	 * 
	 * @param input The information of the new todo item.
	 * @return The information of the created todo item.
	 */
	public TodoItemDTO create(CreateTodoItemDTO input) {
		return null;
	}

	/**
	 * Finds all todo items from the database.
	 * 
	 * @return A list that contains the information of the found todo items. If no
	 *         todo items is found, this method returns an empty list.
	 * @return
	 */
	public List<TodoListItemDTO> findAll() {
		return new ArrayList<>();
	}

	/**
	 * Finds the requested todo item from the database.
	 * 
	 * @param id The id of the todo item.
	 * @return The information of the found todo item.
	 * @throws TodoItemNotFoundException if the requested todo item isn't found from
	 *                                   the database.
	 */
	public TodoItemDTO findById(Long id) {
		return null;
	}
}
