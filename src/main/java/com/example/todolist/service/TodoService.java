package com.example.todolist.service;

import com.example.todolist.entity.Todo;
import com.example.todolist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService implements ITodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public List< Todo > getTodosByUser(String user){
        return todoRepository.findByUserName(user);
    }

    @Override
    public List<Todo> getTodoByUser(String user) {
        return todoRepository.findByUserName(user);
    }

    @Override
    public Optional<Todo> getTodoById(long id) {
        return todoRepository.findById(id);
    }

    //Update_Todo
    @Override
    public void updateTodo(Todo todo) {
        todoRepository.save(todo);
    }

    //Add_Todo
    @Override
    public void addTodo(String name, String desc, Date targetDate, boolean isDone) {
        todoRepository.save(new Todo(name, desc, targetDate, isDone));
    }

    //Delete_Todo
    @Override
    public void deleteTodo(long id) {
        Optional < Todo > todo = todoRepository.findById(id);
        if (todo.isPresent()) {
            todoRepository.delete(todo.get());
        }
    }

    //Save_Todo
    @Override
    public void saveTodo(Todo todo) {
        todoRepository.save(todo);
    }
}
