package xyz.hyunto.backend.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/calendar")
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello, CalendarProject";
    }
}
