package com.example.hexapp.domain.port.in;

import com.example.hexapp.domain.model.Todo;

import java.util.List;
import java.util.UUID;

public interface TodoUseCase {
    Todo addTodo(String title);
    List<Todo> getAllTodo();
    void completeTodo(UUID id);

}
