package com.example.todolist.service;

import com.example.todolist.entity.Todo;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ITodoService {

    List<Todo>getTodoByUser(String user);

    Optional<Todo> getTodoById(long id);

    void updateTodo(Todo todo);

    void addTodo(String name, String desc, Date targetDate, boolean isDone);

    void deleteTodo(long id);

    void saveTodo(Todo todo);

    Object getTodosByUser(String name);
}
