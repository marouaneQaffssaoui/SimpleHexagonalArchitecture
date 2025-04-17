package com.example.hexapp.adapter.outbound;

import com.example.hexapp.domain.model.Todo;
import com.example.hexapp.domain.port.out.TodoRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class InMemoryTodoRepository implements TodoRepositoryPort {

    private final Map<UUID, Todo> db = new ConcurrentHashMap<>();
    @Override
    public Todo save(Todo todo) {
        db.put(todo.getId(), todo);
        return todo;
    }

    @Override
    public List<Todo> findAll() {
        return new ArrayList<>(db.values());
    }

    @Override
    public Optional<Todo> findById(UUID id) {
        return Optional.ofNullable(db.get(id));
    }
}
