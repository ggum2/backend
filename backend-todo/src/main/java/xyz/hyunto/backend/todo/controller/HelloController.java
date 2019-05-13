package xyz.hyunto.backend.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/todo")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, To-Do Project";
    }
}
