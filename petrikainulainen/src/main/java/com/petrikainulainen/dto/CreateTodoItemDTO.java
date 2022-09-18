package com.petrikainulainen.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class CreateTodoItemDTO {

	@Size(max = 1000)
    private String description;

    @NotBlank
    @Size(max = 100)
    private String title;

    public CreateTodoItemDTO() {}
}
