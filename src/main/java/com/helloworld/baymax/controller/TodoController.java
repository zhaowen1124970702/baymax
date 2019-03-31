package com.helloworld.baymax.controller;

import com.helloworld.baymax.pojo.TodoPojo;
import com.helloworld.baymax.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping(value = "/")
    public String index(Model model) {
        List<TodoPojo> list = todoService.getAll();
        model.addAttribute("list", list);
        return "todo";
    }

    @GetMapping(value = "/creation_page")
    public String creationPage() {
        return "creation_page";
    }

    @GetMapping(value = "/create_todo")
    public String create_todo(@RequestParam String content) {
        todoService.save(content);
        return "redirect:/";
    }
}
