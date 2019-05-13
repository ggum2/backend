package xyz.hyunto.backend.photo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/photo")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Photo Project";
    }
}