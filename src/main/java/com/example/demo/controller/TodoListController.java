package com.example.demo.controller;

import com.example.demo.entity.TodoList;
import com.example.demo.repository.TodoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.List;

@Controller
public class TodoListController {
    @Autowired
    private TodoListRepository todoListRepository;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("todoList", todoListRepository.findAll());
        return "index";
    }


}
