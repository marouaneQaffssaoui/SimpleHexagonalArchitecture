package com.example.hexapp.domain.port.out;

import com.example.hexapp.domain.model.Todo;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TodoRepositoryPort {
    Todo save(Todo todo);
    List<Todo> findAll();
    Optional<Todo> findById(UUID id);
}
