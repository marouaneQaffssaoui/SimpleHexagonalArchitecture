package com.example.hexapp.adapter.inbound;

import com.example.hexapp.domain.model.Todo;
import com.example.hexapp.domain.port.in.TodoUseCase;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoUseCase todoUseCase;

    public TodoController(TodoUseCase todoUseCase) {
        this.todoUseCase = todoUseCase;
    }
    @PostMapping
    public Todo addTodo(@RequestBody String title){
        return todoUseCase.addTodo(title);
    }
    @GetMapping
    public List<Todo> getTodos() {
        return todoUseCase.getAllTodo();
    }
    @PostMapping("/{id}/complete")
    public void completeTodo(@PathVariable UUID id){
        todoUseCase.completeTodo(id);
    }
}
