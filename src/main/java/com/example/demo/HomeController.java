package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class HomeController {

    @GetMapping("/hello")
    public String Index() {
        return "Hello, Spring Boot! Abishek";
    }

    // Add more methods to handle different endpoints
}
