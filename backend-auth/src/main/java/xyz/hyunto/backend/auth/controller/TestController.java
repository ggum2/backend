package xyz.hyunto.backend.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/auth")
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, backend-auth";
    }
}
