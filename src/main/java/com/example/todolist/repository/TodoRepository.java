package com.example.todolist.repository;

import com.example.todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    List<Todo> findByUserName(String user);
}
