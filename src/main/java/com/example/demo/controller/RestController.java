package com.example.demo.controller;

import com.example.demo.entity.TodoList;
import com.example.demo.repository.TodoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    private TodoListRepository todoListRepository;

    @GetMapping("/todo")
    public List<TodoList> todo() {
        return todoListRepository.findAll();
    }

    @PostMapping("/todo")
    public RedirectView todo(TodoList todoList) {
        todoListRepository.save(todoList);
        return new RedirectView("/");
    }
    @DeleteMapping("/todo{id}")
    public void todo(long id) {
        todoListRepository.deleteById(id);
    }
}
