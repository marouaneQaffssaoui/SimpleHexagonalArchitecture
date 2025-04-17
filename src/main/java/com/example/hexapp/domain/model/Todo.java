package com.example.hexapp.domain.model;

import java.util.UUID;

public class Todo {
    private UUID id;
    private String title;
    private boolean completed;

    public Todo(String title) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.completed = false;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted(){
        return completed;
    }

    public void markCompleted() {
        this.completed = true;
    }
}
