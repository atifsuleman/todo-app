package com.suleman.todoapp.data;

import com.suleman.todoapp.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoItem, Long> {
}
