package com.suleman.todoapp.web;

import com.suleman.todoapp.services.TodoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/api/todo/{id}")
    public TodoItem oneTodoItem(@PathVariable  int id) {
        return todoService.getTodoItem(id);
    }

    @GetMapping("/api/todo")
    public List<TodoItem> allTodoItems() {
        return todoService.getTodoItems();
    }

}