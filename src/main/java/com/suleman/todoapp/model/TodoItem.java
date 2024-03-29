package com.suleman.todoapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class TodoItem {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Boolean done = Boolean.FALSE;

    public TodoItem() {}

    public TodoItem(String description) {
        this.description = description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public Boolean isDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItem todoItem = (TodoItem) o;
        return Objects.equals(id, todoItem.id) && done == todoItem.done && Objects.equals(description, todoItem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, id, done);
    }
}
