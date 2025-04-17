package com.example.hexapp.application.service;

import com.example.hexapp.domain.model.Todo;
import com.example.hexapp.domain.port.in.TodoUseCase;
import com.example.hexapp.domain.port.out.TodoRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TodoService implements TodoUseCase {
    private final TodoRepositoryPort repository;

    public TodoService(TodoRepositoryPort repository) {
        this.repository = repository;
    }

    @Override
    public Todo addTodo(String title) {
        return repository.save(new Todo(title));
    }

    @Override
    public List<Todo> getAllTodo() {
        return repository.findAll();
    }

    @Override
    public void completeTodo(UUID id) {
        repository.findById(id).ifPresent(todo -> {
            todo.markCompleted();
            repository.save(todo);
        });
    }
}
